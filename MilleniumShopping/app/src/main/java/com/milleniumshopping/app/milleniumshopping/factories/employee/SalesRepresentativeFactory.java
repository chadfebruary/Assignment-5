package com.milleniumshopping.app.milleniumshopping.factories.employee;


import com.milleniumshopping.app.milleniumshopping.domain.employee.SalesRepresentative;

import java.io.Serializable;

/**
 * Created by 208023429 on 5/13/2016.
 */
public class SalesRepresentativeFactory implements Serializable {

    public static SalesRepresentative getSalesRepresentative(String employeeID, String type, String name, String surname, String dateOfBirth) {
        SalesRepresentative salesRep = new SalesRepresentative.Builder()
                .name(name)
                .surname(surname)
                .dateOfBirth(dateOfBirth)
                .employeeID(employeeID)
                .build();

        return salesRep;
    }
}
