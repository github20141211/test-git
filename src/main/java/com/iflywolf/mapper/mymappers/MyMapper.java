package com.iflywolf.mapper.mymappers;

import tk.mybatis.mapper.common.base.select.SelectAllMapper;
import tk.mybatis.mapper.common.example.SelectByExampleMapper;

/**
 * 自定义mapper接口
 * @param <T>
 */
public interface MyMapper<T> extends SelectAllMapper<T>, SelectByExampleMapper<T>, MyBatchUpdateMapper<T> {
}
