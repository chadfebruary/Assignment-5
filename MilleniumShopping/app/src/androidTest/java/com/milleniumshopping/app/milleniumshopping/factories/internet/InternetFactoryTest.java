package com.milleniumshopping.app.milleniumshopping.factories.internet;

import android.test.AndroidTestCase;

import com.milleniumshopping.app.milleniumshopping.domain.internet.Fibre;

import junit.framework.Assert;

/**
 * Write a description of class TestInternet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class InternetFactoryTest extends AndroidTestCase
{
    public void testFactory() throws Exception
    {
        Fibre internet = FibreFactory.getFibre("Telkom", "Fibre", "R1000", "10GB");
        Assert.assertNotNull(internet);
    }
}
