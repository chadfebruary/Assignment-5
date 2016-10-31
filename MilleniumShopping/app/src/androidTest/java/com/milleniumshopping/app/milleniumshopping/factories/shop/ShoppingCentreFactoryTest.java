package com.milleniumshopping.app.milleniumshopping.factories.shop;

import android.test.AndroidTestCase;

import com.milleniumshopping.app.milleniumshopping.domain.shop.ShoppingCentre;

import junit.framework.Assert;

/**
 * Created by cfebruary on 2016/10/31.
 */
public class ShoppingCentreFactoryTest extends AndroidTestCase {
    public void testFactory() throws Exception
    {
        ShoppingCentre shoppingCentre = ShoppingCentreFactory.getShoppingCentre("Century", "Vukile", "Test", "0001");
        Assert.assertNotNull(shoppingCentre);
    }
}
