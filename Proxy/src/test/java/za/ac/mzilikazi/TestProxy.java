package za.ac.mzilikazi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

/**
 * Created by mandisi on 2017-04-02.
 */
public class TestProxy {

    Proxy proxy;
    Phone phone;

    @Before
    public void setUp() throws Exception {
        proxy = new Proxy();
        phone = new Phone();

    }

    @Test
    public void testDeviceInserted() throws Exception {
        Assert.assertEquals("New Device inserted at "+ new Date() ,phone.deviceInserted());

    }

    @Test
    public void testProxy() throws Exception {
        Assert.assertNull(proxy.insertDevice());

    }
}
