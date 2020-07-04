package com.example.mapper;


import com.example.domain.User;

import java.util.List;

public interface UserMapper {

    List<User> findByLoginName(String loginName);

    List<User> list();

}