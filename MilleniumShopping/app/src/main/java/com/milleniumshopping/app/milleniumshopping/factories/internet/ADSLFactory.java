package com.milleniumshopping.app.milleniumshopping.factories.internet;

import com.milleniumshopping.app.milleniumshopping.domain.internet.ADSL;

import java.io.Serializable;

/**
 * Created by 208023429 on 5/13/2016.
 */
public class ADSLFactory implements Serializable {

    public static ADSL getADSL(String ISP, String planName, String price, String dataAllowance) {
        ADSL adsl = new ADSL.Builder()
                .ISP(ISP)
                .planName(planName)
                .price(price)
                .dataAllowance(dataAllowance)
                .build();

        return adsl;
    }
}
