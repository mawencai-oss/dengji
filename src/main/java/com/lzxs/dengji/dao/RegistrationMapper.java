package com.lzxs.dengji.dao;

import com.lzxs.dengji.domain.Registration;
import com.lzxs.dengji.domain.RegistrationExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface RegistrationMapper {
    int countByExample(RegistrationExample example);

    int deleteByExample(RegistrationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Registration record);

    int insertSelective(Registration record);

    List<Registration> selectByExample(RegistrationExample example);

    Registration selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Registration record, @Param("example") RegistrationExample example);

    int updateByExample(@Param("record") Registration record, @Param("example") RegistrationExample example);

    int updateByPrimaryKeySelective(Registration record);

    int updateByPrimaryKey(Registration record);
}