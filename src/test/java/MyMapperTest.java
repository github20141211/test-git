import com.iflywolf.entities.Employee;
import com.iflywolf.mapper.services.EmployeeService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyMapperTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");

        EmployeeService employeeService = context.getBean(EmployeeService.class);
        List<Employee> empList = employeeService.getAll();
        for (Employee employee: empList) {
            System.out.println(empList);
        }
        context.close();
    }
}
