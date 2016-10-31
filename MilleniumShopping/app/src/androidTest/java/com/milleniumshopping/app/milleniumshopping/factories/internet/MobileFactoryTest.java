package com.milleniumshopping.app.milleniumshopping.factories.internet;

import android.test.AndroidTestCase;

import com.milleniumshopping.app.milleniumshopping.domain.internet.Mobile;

import junit.framework.Assert;

/**
 * Created by cfebruary on 2016/10/31.
 */
public class MobileFactoryTest extends AndroidTestCase {
    public void testFactory() throws Exception
    {
        Mobile internet = MobileFactory.getMobile("Telkom", "Fibre", "R1000", "10GB");
        Assert.assertNotNull(internet);
    }
}
