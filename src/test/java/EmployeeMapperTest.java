

import static org.junit.Assert.fail;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.iflywolf.entities.Employee;
import com.iflywolf.mapper.services.EmployeeService;

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
		fail("Not yet implemented");
	}

	@Test
	public void testExistsWithPrimaryKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsert() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertSelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByPrimaryKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByPrimaryKeySelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteByPrimaryKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectByExample() {
		fail("Not yet implemented");
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
		fail("Not yet implemented");
	}

}
