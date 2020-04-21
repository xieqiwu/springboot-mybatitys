package com.jbit.mapper;

import com.jbit.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:20
 */
@Mapper
public interface UserMapper {

    User Sel(int id);

    int insert(User user);

}