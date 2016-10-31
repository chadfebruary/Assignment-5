package com.milleniumshopping.app.milleniumshopping.factories.employee;

import android.test.AndroidTestCase;

import com.milleniumshopping.app.milleniumshopping.domain.employee.Cleaner;

import junit.framework.Assert;

/**
 * Created by cfebruary on 2016/10/31.
 */
public class CleanerFactoryTest extends AndroidTestCase{
    public void testFactory() throws Exception
    {
        Cleaner employee = CleanerFactory.getCleaner("Employee", "Name", "Surname", "01/01/1999", "1234");
        Assert.assertNotNull(employee);
    }
}
