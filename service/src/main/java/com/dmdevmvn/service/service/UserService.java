package com.dmdevmvn.service.service;

import com.dmdevmvn.database.dao.UserDao;
import com.dmdevmvn.database.entity.User;
import com.dmdevmvn.service.dto.UserDto;

import java.util.Optional;

public class UserService {

    private final UserDao userDao = new UserDao();
    public Optional<UserDto> getUser(Long id) {
        return userDao.findById(id)
                .map(it -> new UserDto());

    }
}
