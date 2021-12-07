package com.mp.component;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        System.out.println("insert fill");

        boolean hasSetter = metaObject.hasSetter("createTime");

        if (hasSetter) {
            setInsertFieldValByName("createTime", LocalDateTime.now(), metaObject);
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        System.out.println("update fill");

        Object val = getFieldValByName("updateTime", metaObject);
        boolean hasSetter = metaObject.hasSetter("updateTime");
        if (hasSetter && val == null) {
            setUpdateFieldValByName("updateTime", LocalDateTime.now(), metaObject);
        }
    }
}
