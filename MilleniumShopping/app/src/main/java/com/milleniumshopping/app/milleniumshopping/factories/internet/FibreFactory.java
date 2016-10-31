package com.milleniumshopping.app.milleniumshopping.factories.internet;

import com.milleniumshopping.app.milleniumshopping.domain.internet.Fibre;

import java.io.Serializable;

/**
 * Created by 208023429 on 5/13/2016.
 */
public class FibreFactory implements Serializable {
    public static Fibre getFibre(String ISP, String planName, String price, String dataAllowance) {
        Fibre fibre = new Fibre.Builder()
                .ISP(ISP)
                .planName(planName)
                .price(price)
                .dataAllowance(dataAllowance)
                .build();

        return fibre;
    }
}
