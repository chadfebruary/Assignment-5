package com.milleniumshopping.app.milleniumshopping.factories.shop;

import com.milleniumshopping.app.milleniumshopping.domain.shop.ShoppingCentre;

import java.io.Serializable;

/**
 * Created by cfebruary on 2016/10/31.
 */
public class ShoppingCentreFactory implements Serializable {
    public static ShoppingCentre getShoppingCentre(String centreName, String centreCode, String portfolio, String address)
    {
        ShoppingCentre shop = new ShoppingCentre.Builder()
                .centreName(centreName)
                .centreCode(centreCode)
                .portfolio(portfolio)
                .address(address)
                .build();

        return shop;
    }
}
