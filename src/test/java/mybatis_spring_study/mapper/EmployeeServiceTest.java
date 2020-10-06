package mybatis_spring_study.mapper;

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


import mybatis_spring_study.dto.Department;
import mybatis_spring_study.dto.Employee;
import mybatis_spring_study.service.EmployeeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/resources/context-root.xml" })
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeServiceTest {
	private static final Log log = LogFactory.getLog(EmployeeServiceTest.class);

@After
public void tearDown() throws Exception {
System.out.println();
}
@Autowired
private EmployeeService service;

	@Test
	public void testAddEmployee() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Employee employee = new Employee(1465,"박연미","사원",new Employee(1365),1640000,new Department(1));
		int res = service.addEmployee(employee);
		Assert.assertEquals(1, res);
	}

	@Test
	public void testDelEmployee() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Employee employee = new Employee(1465);
		int res = service.delEmployee(employee);
		Assert.assertEquals(1, res);
	}

}
