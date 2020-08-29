package com.xxxx.manager.mapper;

import com.xxxx.manager.pojo.UserDemo;
import com.xxxx.manager.pojo.UserDemoExample;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface UserDemoMapper {
    long countByExample(UserDemoExample example);

    int deleteByExample(UserDemoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserDemo record);

    int insertSelective(UserDemo record);

    List<UserDemo> selectByExample(UserDemoExample example);

    UserDemo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record")UserDemo record, @Param("example")UserDemoExample example);

    int updateByExample(@Param("record")UserDemo record,@Param("example")UserDemoExample example);

    int updateByPrimaryKeySelective(UserDemo record);

    int updateByPrimaryKey(UserDemo record);
}