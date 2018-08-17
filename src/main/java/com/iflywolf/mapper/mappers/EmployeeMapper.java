package com.iflywolf.mapper.mappers;

import com.iflywolf.entities.Employee;

import tk.mybatis.mapper.common.Mapper;

/**
 * 具体操作数据库的Mapper接口，需要继承通用Mapper提供的核心接口：Mapper<Employee>
 * @author luocheng
 *
 */
public interface EmployeeMapper extends Mapper<Employee> {

//	Employee selectEmployeeById(Integer empId);

}
