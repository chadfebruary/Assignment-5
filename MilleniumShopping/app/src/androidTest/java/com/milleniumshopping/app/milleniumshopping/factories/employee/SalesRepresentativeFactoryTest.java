package com.milleniumshopping.app.milleniumshopping.factories.employee;

import android.test.AndroidTestCase;

import com.milleniumshopping.app.milleniumshopping.domain.employee.SalesRepresentative;

import junit.framework.Assert;

/**
 * Created by cfebruary on 2016/10/31.
 */
public class SalesRepresentativeFactoryTest extends AndroidTestCase {
    public void testFactory() throws Exception
    {
        SalesRepresentative employee = SalesRepresentativeFactory.getSalesRepresentative("Employee", "Name", "Surname", "01/01/1999", "1234");
        Assert.assertNotNull(employee);
    }
}
