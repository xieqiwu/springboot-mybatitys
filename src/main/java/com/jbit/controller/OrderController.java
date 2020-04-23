package com.jbit.controller;

import com.jbit.entity.Order;
import com.jbit.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@Slf4j
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping("/getOrderInfo")
    public List<Order> getOrderList(@RequestBody Map<String,Object> params){
        log.info("params id:"+Integer.valueOf(params.get("id").toString()));
        return orderService.selectOneOrder(Integer.valueOf(params.get("id").toString()));
    }

    @RequestMapping("/selectAll")
    public List<Order> selectAll(){

        return orderService.selectAll();
    }

}
