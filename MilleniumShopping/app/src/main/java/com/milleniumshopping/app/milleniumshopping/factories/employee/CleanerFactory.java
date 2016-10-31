package com.milleniumshopping.app.milleniumshopping.factories.employee;


import com.milleniumshopping.app.milleniumshopping.domain.employee.Cleaner;

import java.io.Serializable;

/**
 * Created by 208023429 on 5/13/2016.
 */
public class CleanerFactory implements Serializable {

    public static Cleaner getCleaner(String employeeID, String type, String name, String surname, String dateOfBirth) {
        Cleaner cleaner = new Cleaner.Builder()
                .name(name)
                .surname(surname)
                .dateOfBirth(dateOfBirth)
                .employeeID(employeeID)
                .build();

        return cleaner;
    }
}
