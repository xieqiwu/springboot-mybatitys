package com.jbit.service;

import com.jbit.entity.Customer;
import com.jbit.mapper.CustomerMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CustomerService {

    @Resource
    CustomerMapper customerMapper;

    public Customer selectOne(int id){

        return customerMapper.selectOne(id);
    }

}
