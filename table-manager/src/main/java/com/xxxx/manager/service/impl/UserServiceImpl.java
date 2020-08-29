package com.xxxx.manager.service.impl;

import com.github.pagehelper.PageHelper;

import com.github.pagehelper.PageInfo;
import com.xxxx.commer.result.BaseResult;
import com.xxxx.commer.util.BeanUtils;
import com.xxxx.manager.mapper.UserDemoMapper;
import com.xxxx.manager.pojo.UserDemo;
import com.xxxx.manager.pojo.UserDemoExample;
import com.xxxx.manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDemoMapper userDemoMapper;

    @Override
    public BaseResult selectUserList(Integer pageNum, Integer pageSize) {
        if(pageNum==null || pageSize==null){
            return BaseResult.error();
        }
        //构建查询对象
        PageHelper.startPage(pageNum,pageSize);
        //创建查询对象
        UserDemoExample example = new UserDemoExample();
        UserDemoExample.Criteria criteria = example.createCriteria();
        BaseResult baseResult;
        List<UserDemo> list = userDemoMapper.selectByExample(example);
        System.out.println(list);
        if(!CollectionUtils.isEmpty(list)){
            //将查询结果设置分页对象
            PageInfo<UserDemo> pageInfo = new PageInfo<>(list);
            return BaseResult.success(pageInfo);

        }
        return BaseResult.error();
    }

    /**
     * 用户新增-保存
     * @param userDemo
     * @return
     */
    @Override
    public BaseResult saveUser(UserDemo userDemo) {
        if(userDemo.getId()!=null){
            userDemo.setId(null);

        }
        System.out.println("User:"+userDemo);
        BaseResult baseResult;
        int i =userDemoMapper.insertSelective(userDemo);
        if(i>0){
            baseResult  = BaseResult.success();
        }else{
            baseResult = BaseResult.error();
            baseResult.setMessage("新增失败");
        }
        return baseResult;
    }

    /**
     * 根据id删除
     * @param id
     * @return
     */
    @Override
    public BaseResult deleteUserById(Integer id) {
        BaseResult baseResult = new BaseResult();
        int i = userDemoMapper.deleteByPrimaryKey(id);
        if(i>0){
            baseResult = BaseResult.success();
            baseResult.setMessage("删除失败");
        }
        return BaseResult.error();
    }

    /**
     * 用户修改
     * @param userDemo
     * @return
     */
    @Override
    public BaseResult updateUser(UserDemo userDemo) {
        if(BeanUtils.checkFieldValueNull(userDemo)) {
            return BaseResult.error();
        }
        System.out.println("User:"+userDemo);
        BaseResult baseResult;
        int result = userDemoMapper.updateByPrimaryKey(userDemo);
        if (result>0){
            baseResult = BaseResult.success();
        }else{
            baseResult = BaseResult.error();
            baseResult.setMessage("修改失败");
        }
        return BaseResult.error();
    }

    /**
     * 通过id查询
     * @param id
     * @return
     */
    @Override
    public BaseResult selectUserById(Integer id) {
        //构建分页对象
        PageHelper.startPage(1,1);
        BaseResult baseResult;
        if(id==null){
            return   BaseResult.error();
        }

        UserDemo user=userDemoMapper.selectByPrimaryKey(id);
        System.out.println(user);
        List<UserDemo> list = new ArrayList();
        if(user!=null){
            list.add(user);
            PageInfo<UserDemo> pageInfo = new PageInfo<>(list);
            baseResult= BaseResult.success();
            baseResult.setPageInfo(pageInfo);
            return baseResult;
        }
        return BaseResult.error();
    }
}
