package com.pengcan.dao;


import com.pengcan.entity.XueyuanInfo;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface XueyuanInfoDao extends Mapper<XueyuanInfo> {
    @Select("select * from xueyuan_info where name  = #{name} ;")
    XueyuanInfo findByName(String name);

    @Select("select * from xueyuan_info where name like concat('%',#{name},'%')")
    List<XueyuanInfo> findByNamePage(String name);
}
