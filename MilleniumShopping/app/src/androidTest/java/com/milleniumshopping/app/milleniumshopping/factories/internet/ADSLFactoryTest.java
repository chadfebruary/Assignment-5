package com.milleniumshopping.app.milleniumshopping.factories.internet;

import android.test.AndroidTestCase;

import com.milleniumshopping.app.milleniumshopping.domain.internet.ADSL;

import junit.framework.Assert;

/**
 * Created by cfebruary on 2016/10/31.
 */
public class ADSLFactoryTest extends AndroidTestCase{
    public void testFactory() throws Exception
    {
        ADSL internet = ADSLFactory.getADSL("Telkom", "Plan", "R1000", "10GB");
        Assert.assertNotNull(internet);
    }
}
