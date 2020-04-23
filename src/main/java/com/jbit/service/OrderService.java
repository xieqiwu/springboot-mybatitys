package com.jbit.service;

import com.jbit.entity.Order;
import com.jbit.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderService {

    @Resource
    OrderMapper orderMapper;

    public List<Order> selectOneOrder(int id){

        return orderMapper.selectOneOrder(id);
    }

    public List<Order> selectAll(){

        return orderMapper.selectAll();
    }
}
