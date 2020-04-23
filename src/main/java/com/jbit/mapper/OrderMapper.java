package com.jbit.mapper;

import com.jbit.entity.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {

    public List<Order> selectOneOrder(int id);

    public List<Order> selectAll();

}
