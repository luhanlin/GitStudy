package org.smart4j.chapter2.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.chapter2.model.Customer;
import org.smart4j.chapter2.utils.PropsUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @Description  提供客户数据服务
 * @Author Lu HanLin
 * @Date Create in 2018/1/19 16:56
 * @Modified by
 */
public class CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

    private static final String DRIVER;
    private static final String URL;
    private static final String USERNAME;
    private static final String PASSWORD;

    static {
        Properties conf= PropsUtil.loadProps("database.properties");
        DRIVER=conf.getProperty("jdbc.driver");
        URL=conf.getProperty("jdbc.url");
        USERNAME= conf.getProperty("jdbc.username");
        PASSWORD=conf.getProperty("jdbc.password");
    }

    /**
     * 获取客户列表
     * @param keyword
     * @return
     */
    public List<Customer> getCustomerList(String keyword){
        // TODO
        Connection conn=null;
        try{
            List<Customer> customerList=new ArrayList<Customer>();
            String sql="select * from customer";
            conn= DriverManager.getConnection(URL,USERNAME,PASSWORD);
            PreparedStatement pstmt=conn.prepareStatement(sql);
            ResultSet rs=pstmt.executeQuery();
            while(rs.next()){
                Customer customer=new Customer();
                customer.setId(rs.getLong("id"));
                customer.setName(rs.getString("name"));
                customer.setContact(rs.getString("contact"));
                customer.setTelephone(rs.getString("telephone"));
                customer.setEmail(rs.getString("email"));
                customer.setRemark(rs.getString("remark"));
                customerList.add(customer);
            }
            return customerList;
        }catch (SQLException e){
            LOGGER.error("execute sql failure",e);
        }finally {
            if (conn !=null){
                try {
                    conn.close();
                }catch (SQLException e){
                    LOGGER.error("close connection failure",e);
                }
            }
        }
        return null;
    }

    /**
     * 获取客户
     * @param id
     * @return
     */
    public Customer getCustomer(long id){
        // TODO
        return null;
    }

    /**
     * 创建客户
     * @param fileMap
     * @return
     */
    public boolean createCustomer(Map fileMap){
        // TODO
        return false;
    }

    /**
     * 更新客户
     * @param id
     * @param fileMap
     * @return
     */
    public boolean updateCustomer(long id,Map fileMap){
        // TODO
        return false;
    }

    /**
     * 删除客户
     * @param id
     * @return
     */
    public boolean deleteCustomer(long id){
        // TODO
        return false;
    }



}
