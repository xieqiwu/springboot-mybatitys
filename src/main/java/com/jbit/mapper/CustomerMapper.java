package com.jbit.mapper;

import com.jbit.entity.Customer;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerMapper {

    public Customer selectOne(int id);

}
