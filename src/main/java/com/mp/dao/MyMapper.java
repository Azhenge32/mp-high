package com.mp.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.injector.methods.additional.LogicDeleteByIdWithFill;
import org.apache.ibatis.annotations.Param;


import java.util.List;


public interface MyMapper<T> extends BaseMapper<T> {
    int deleteAll();

    int insertBatchSomeColumn(List<T> list);

    int deleteByIdWithFill(T entity);

    int alwaysUpdateSomeColumnById(@Param(Constants.ENTITY) T entity);
}
