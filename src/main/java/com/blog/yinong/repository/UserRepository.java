package com.blog.yinong.repository;

import com.blog.yinong.domain.User;

import java.util.List;

/**
 * User 的Repository接口
 */


public interface UserRepository {
    /**
     * 创建或者修改用户
     * @param user
     * @return
     */
    User saveOrUpdateUser(User user);

    /**
     * 删除用户
     * @param id
     */
    void deleteUser(Long id);


    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User getUserById(Long id);

    /**
     * 获取用户列表
     * @return
     */
    List<User> listUsers();


}



