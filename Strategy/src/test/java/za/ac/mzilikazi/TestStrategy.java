package za.ac.mzilikazi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mandisi on 2017-04-02.
 */
public class TestStrategy {
    private SalaryRequired gold = null;
    private SalaryRequired platinum = null;
    private Banker banker = null;
    private Banker banker1 = null;

    @Before
    public void setUp() {
        platinum = new PlatinumCreditCard();
        gold = new GoldCreditCard();
        banker = new Banker(60000.00, platinum);
        banker1 = new Banker(7500.00, gold);
    }

    @Test
    public void getGoldSalary() {
        Assert.assertEquals(60000.00, banker.getSalary(),60000.00);
    }

    @Test
    public void testGoldApproval() {
        Assert.assertEquals(true, banker.result());
    }

    @Test
    public void getPlatinumSalary() {
        Assert.assertEquals(7500.00, banker1.getSalary(),7500.00);
    }

    @Test
    public void testPlatinumApproval() {
        Assert.assertEquals(true, banker1.result());
    }
}
