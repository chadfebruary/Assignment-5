package com.milleniumshopping.app.milleniumshopping.factories.internet;


import com.milleniumshopping.app.milleniumshopping.domain.internet.Mobile;

import java.io.Serializable;

/**
 * Created by 208023429 on 5/13/2016.
 */
public class MobileFactory implements Serializable {

    public static Mobile getMobile(String ISP, String planName, String price, String dataAllowance) {
        Mobile mobile = new Mobile.Builder()
                .ISP(ISP)
                .planName(planName)
                .price(price)
                .dataAllowance(dataAllowance)
                .build();

        return mobile;
    }
}
