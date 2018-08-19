package com.iflywolf.mapper.mymappers;

import org.apache.ibatis.mapping.MappedStatement;
import tk.mybatis.mapper.mapperhelper.MapperHelper;
import tk.mybatis.mapper.mapperhelper.MapperTemplate;

public class MyBatchUpdateProvider extends MapperTemplate {

    public MyBatchUpdateProvider(Class<?> mapperClass, MapperHelper mapperHelper) {
        super(mapperClass, mapperHelper);
    }

    public void batchUpdate(MappedStatement statement) {
        StringBuilder builder = new StringBuilder();
        builder.append("");
    }
}
