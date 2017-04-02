package za.ac.mzilikazi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mandisi on 2017-04-02.
 */
public class TestCalculator {

    Calculator calc;

    @Before
    public void setUp() throws Exception {
        calc = Calculator.getInstance();

    }

    @Test
    public void testAdd() throws Exception {
        Assert.assertEquals(4,calc.add(2,2));

    }

    @Test
    public void testMultiply() throws Exception {
        Assert.assertEquals(4, calc.multiply(2,2));

    }

    @Test
    public void testSubtract() throws Exception {
        Assert.assertEquals(0, calc.substract(2,2));

    }

    @Test
    public void testDevide() throws Exception {
        Assert.assertEquals(1, calc.devide(2,2));

    }
}
