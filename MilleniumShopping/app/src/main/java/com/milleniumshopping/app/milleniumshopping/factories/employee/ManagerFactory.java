package com.milleniumshopping.app.milleniumshopping.factories.employee;


import com.milleniumshopping.app.milleniumshopping.domain.employee.Manager;

import java.io.Serializable;

/**
 * Created by 208023429 on 5/13/2016.
 */
public class ManagerFactory implements Serializable {

    public static Manager getManager(String employeeId, String name, String surname, String dateOfBirth, String role) {

        Manager manager = new Manager.Builder()
                .employeeID(employeeId)
                .name(name)
                .surname(surname)
                .dateOfBirth(dateOfBirth)
                .role(role)
                .build();

        return manager;
    }
}
