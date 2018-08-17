package com.iflywolf.mapper.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iflywolf.entities.Employee;
import com.iflywolf.mapper.mappers.EmployeeMapper;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeMapper employeeMapper;

	public Employee getOne(Employee employeeQueryCondition) {
		
		return employeeMapper.selectOne(employeeQueryCondition);
	}
	

}
