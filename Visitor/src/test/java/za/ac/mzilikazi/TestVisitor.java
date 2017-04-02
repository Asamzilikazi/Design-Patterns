package za.ac.mzilikazi;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mandisi on 2017-04-02.
 */
public class TestVisitor {
    private BodyPart body = null;

    @Before
    public void setUp() {
        body = new Body();
        body.move(new MovePart());
    }

    @Test
    public void test() {
        Assert.assertEquals(true, body.move(new MovePart()).equalsIgnoreCase("Moving arms Moving legs Moving body "));
    }
}
