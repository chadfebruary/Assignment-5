package com.milleniumshopping.app.milleniumshopping.factories.employee;

import android.test.AndroidTestCase;

import com.milleniumshopping.app.milleniumshopping.domain.employee.Employee;

import junit.framework.Assert;

/**
 * Write a description of class TestInternet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class EmployeeFactoryTest extends AndroidTestCase
{
    public void testFactory() throws Exception
    {
        Employee employee = EmployeeFactory.getInstance("Employee", "Name", "Surname", "01/01/1999", "1234");
        Assert.assertNotNull(employee);
    }

}
