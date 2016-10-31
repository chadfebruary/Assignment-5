package com.milleniumshopping.app.milleniumshopping.factories.internet;

import android.test.AndroidTestCase;

import com.milleniumshopping.app.milleniumshopping.domain.internet.Fibre;

import junit.framework.Assert;

/**
 * Created by cfebruary on 2016/10/31.
 */
public class FibreFactoryTest extends AndroidTestCase {
    public void testFactory() throws Exception
    {
        Fibre internet = FibreFactory.getFibre("Telkom", "Fibre", "R1000", "10GB");
        Assert.assertNotNull(internet);
    }
}
