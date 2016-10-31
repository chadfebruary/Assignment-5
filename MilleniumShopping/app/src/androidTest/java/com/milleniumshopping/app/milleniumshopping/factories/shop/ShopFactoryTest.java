package com.milleniumshopping.app.milleniumshopping.factories.shop;

import android.test.AndroidTestCase;

import com.milleniumshopping.app.milleniumshopping.domain.shop.Shop;

import junit.framework.Assert;

/**
 * Write a description of class TestInternet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class ShopFactoryTest extends AndroidTestCase
{
    public void testFactory() throws Exception
    {
        Shop shop = ShopFactory.getShop("Shop", "Owner", "Test", "0001");
        Assert.assertNotNull(shop);
    }
}
