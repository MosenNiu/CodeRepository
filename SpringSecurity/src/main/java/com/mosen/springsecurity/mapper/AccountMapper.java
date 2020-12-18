package com.mosen.springsecurity.mapper;


import com.mosen.springsecurity.model.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AccountMapper {

    @Select("SELECT * FROM account WHERE loginName = #{loginName}")
    Account findByLoginName(@Param("loginName") String loginName);

}
