package com.jbit.controller;

import com.jbit.entity.Customer;
import com.jbit.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

//知识点：@RestController注解相当于@ResponseBody ＋ @Controller合在一起的作用。
@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping("/index")
    @ResponseBody
    public String getInfo(){
        return "ok";
    }

    @RequestMapping("/getCustomerInfo")
    @ResponseBody
    public Customer selectOne(@RequestBody Map<String,Object> params){

        return customerService.selectOne(Integer.valueOf(params.get("id").toString()));
    }


}
