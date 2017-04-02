package za.ac.mzilikazi;

/**
 * Created by mandisi on 2017-04-02.
 *
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPrototype {

    Mercedes mercedes = null;
    Mercedes mercedes1 = null;
    Bmw bmw = null;
    Bmw bmw1 = null;

    @Before
    public void setUp() {
        mercedes = new Mercedes("A45 AMG");
        mercedes1 = (Mercedes) mercedes.copy();
        bmw = new Bmw("X6");
        bmw1 = (Bmw) bmw.copy();
    }

    @Test
    public void testMercedes() {
        Assert.assertEquals(false, mercedes.equals(mercedes1));
    }

    @Test
    public void testMercedesOutput() {
        Assert.assertEquals(mercedes1.toString(), mercedes.toString());
    }

    @Test
    public void testBWM() {
        Assert.assertEquals(false, bmw.equals(bmw1));
    }

    @Test
    public void testBWMOutput() {
        Assert.assertEquals(bmw1.toString(), bmw.toString());
    }
}

