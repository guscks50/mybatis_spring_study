package mybatis_spring_study.service;

import static org.junit.Assert.fail;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import mybatis_spring_study.config.ContextRoot;
import mybatis_spring_study.dto.Department;
import mybatis_spring_study.dto.Employee;
import mybatis_spring_study.mapper.EmployeeMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ContextRoot.class })
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeServiceTest {
	private static final Log log = LogFactory.getLog(EmployeeServiceTest.class);

	@Autowired
	private EmployeeService service;
	
	@After
	public void testDown() throws Exception{
		System.out.println();
	}
	
	@Test
	public void testAddEmployee() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Employee employee = new Employee(1005, "쏘대장", "부장", new Employee(4377), 4000000, new Department(1));
		int res = service.addEmployee(employee);
		Assert.assertEquals(1, res);
	}

	@Test
	public void testDelEmployee() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Employee employee = new Employee(1005, "쏘대장", "부장", new Employee(4377), 4000000, new Department(1));
		int res = service.delEmployee(employee);
		Assert.assertEquals(1, res);
	}

}
