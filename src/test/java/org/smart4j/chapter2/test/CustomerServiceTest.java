package org.smart4j.chapter2.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.smart4j.chapter2.model.Customer;
import org.smart4j.chapter2.service.CustomerService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description 单元测试
 * @Author Lu HanLin
 * @Date Create in 2018/1/19 17:03
 * @Modified by
 */
public class CustomerServiceTest {

    private CustomerService customerService;

    @Before
    public void init() {
        // TODO 初始化数据库
        customerService = new CustomerService();
    }

    @Test
    public void getCustomerListTest() {
        List<Customer> customerList = customerService.getCustomerList(null);
        Assert.assertEquals(4, customerList.size());
    }

    @Test
    public void getCustomerTest() {
        long id = 1;
        Customer customer = customerService.getCustomer(id);
        Assert.assertNotNull(customer);
    }

    @Test
    public void createCustomerTest() {
        Map fieldMap = new HashMap();
        fieldMap.put("name", "customer11");
        fieldMap.put("contact", "John");
        fieldMap.put("telephone", "15362746372");
        boolean result = customerService.createCustomer(fieldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void updateCustomerTest() {
        long id = 1;
        Map fieldMap = new HashMap();
        fieldMap.put("contact", "Eric");
        boolean result = customerService.updateCustomer(id,fieldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void deleteCustomerTest() {
        long id = 1;
        boolean result = customerService.deleteCustomer(id);
        Assert.assertTrue(result);
    }

}
