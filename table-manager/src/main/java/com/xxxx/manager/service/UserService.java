package com.xxxx.manager.service;

import com.xxxx.commer.result.BaseResult;
import com.xxxx.manager.pojo.UserDemo;


import java.text.ParseException;
import java.util.List;

public interface UserService {
    /**
     * 用户查询
     */
    BaseResult selectUserList(Integer pageNum,Integer pageSize);
    /**
 * 用户新增
 */
    BaseResult saveUser(UserDemo userDemo);

    /**
     * 用户删除
     *
     */
    BaseResult deleteUserById(Integer id);

    /**
     * 用户修改
     *
     */
    BaseResult updateUser(UserDemo userDemo);
    /**
     * 根据id查询用户
     */
    BaseResult selectUserById(Integer id);
}
