package com.blog.yinong.repository;

import com.blog.yinong.domain.User;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * 用户资源库实现
 */

public class UserRepositoryImpl implements UserRepository{


    private final ConcurrentMap<Long,User> userMap = new ConcurrentHashMap<>();

    @Override
    public User saveOrUpdateUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public List<User> listUsers() {
        return null;
    }
}
