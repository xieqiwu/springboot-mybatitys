package com.jbit.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 *    客户
 */
@Data   //不用生产get/set方法
public class Customer {
    private Integer id ;
    private String name ;
    private int age ;

    //建立从Customer到Order之间一对多关系,因为一个客户可能会有多个订单。我们将多个订单放在一个list中。
    private List<Order> orders = new ArrayList<Order>() ;

}