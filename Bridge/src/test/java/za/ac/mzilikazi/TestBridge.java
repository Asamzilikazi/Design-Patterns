package za.ac.mzilikazi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mandisi on 2017-04-02.
 */
public class TestBridge {

    private Shape largeRectangle = null;
    private Shape smallRectangle = null;

    @Before
    public void setUp() {
        largeRectangle = new Rectangle(8, 4, new LargeRectangle());
        smallRectangle = new Rectangle(4, 2, new SmallRectangle());
    }

    @Test
    public void testLargeRectangle() {
        Assert.assertEquals(true, largeRectangle.draw().equalsIgnoreCase("Height: 8 Width: 4"));
    }

    @Test
    public void testSmallRectangle() {
        Assert.assertEquals(true, smallRectangle.draw().equalsIgnoreCase("Height: 4 Width: 2"));
    }
}
