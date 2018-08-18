

import static org.junit.Assert.fail;

import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.iflywolf.entities.Employee;
import com.iflywolf.mapper.services.EmployeeService;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

public class EmployeeMapperTest {

	private ApplicationContext iocContainer = 
			new ClassPathXmlApplicationContext("spring-context.xml");
	
	private EmployeeService employeeService = iocContainer.getBean(EmployeeService.class);
			
	@Test
	public void testSelectOne() {
		Employee employeeQueryCondition = new Employee(null, "bob", 5560.11, null);
		Employee employeeQueryResult = employeeService.getOne(employeeQueryCondition);
		System.out.println(employeeQueryResult);
	}

	@Test
	public void testSelect() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectCount() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectByPrimaryKey() {
		Integer empId = 3;
		Employee employee = employeeService.getEmployeeById(empId);
		System.out.println(employee);
	}

	@Test
	public void testExistsWithPrimaryKey() {
		Integer empId = 33;
		boolean result = employeeService.isExists(empId);
		System.out.println(result);
	}

	@Test
	public void testInsert() {
		Employee employee = new Employee();
		employee.setEmpId(null);
		employee.setEmpName("emp02");
		employee.setEmpSalary(1000.00);
		employee.setEmpAge(23);
		employeeService.saveEmployee(employee);

		Integer empId = employee.getEmpId();
		System.out.println("==========>" + empId);
	}

	@Test
	public void testInsertSelective() {
		Employee employee = new Employee();
		employee.setEmpId(null);
		employee.setEmpName("emp03");
		employee.setEmpSalary(1000.00);
		employee.setEmpAge(23);
		employeeService.saveEmployeeSelective(employee);

	}

	@Test
	public void testUpdateByPrimaryKey() {

	}

	@Test
	public void testUpdateByPrimaryKeySelective() {
		Employee employee = new Employee(7, "empNewName", null, null);
		employeeService.updateEmployeeSelective(employee);
	}

	@Test
	public void testDelete() {
		Employee employee = null;
		employeeService.removeEmployee(employee);
	}

	@Test
	public void testDeleteByPrimaryKey() {
		Integer empId = 13;
		employeeService.removeEmployeeById(empId);
	}

	@Test
	public void testSelectByExample() {

		//WHERE (emp_salary >? AND emp_age<?) OR (emp_salary<? AND emp_age>?)
		Example example = new Example(Employee.class);
		Example.Criteria criteria1 = example.createCriteria();
		Example.Criteria criteria2 = example.createCriteria();

		criteria1.andGreaterThan("empSalary", 3000).andLessThan("empAge", 25);

		criteria2.andLessThan("empSalary", 5000).andGreaterThan("empAge", 30);

		example.or(criteria2);

		//去重
		example.setDistinct(true);
		example.selectProperties("empName", "empSalary");
		example.orderBy("empSalary").asc().orderBy("empAge").desc();
		List<Employee> empList = employeeService.getEmpListByExample(example);

		//SQL SELECT distinct emp_name , emp_salary FROM tabple_emp WHERE ( emp_salary > ? and emp_age < ? ) or ( emp_salary < ? and emp_age > ? ) order by emp_salary ASC,emp_age DESC
		for (Employee employee: empList) {
			System.out.println(employee);
		}
	}

	@Test
	public void testSelectOneByExample() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectCountByExample() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteByExample() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByExample() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByExampleSelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectByExampleAndRowBounds() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectByRowBounds() {
		int pageNo = 3;
		int pageSize = 5;
		int index = (pageNo - 1) * pageSize;

		RowBounds rowBounds = new RowBounds(index, pageSize);


	}

}
