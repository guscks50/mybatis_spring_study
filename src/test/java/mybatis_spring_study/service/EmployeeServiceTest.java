package mybatis_spring_study.service;

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
import mybatis_spring_study.mapper.EmployeeMapperTest;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/context-root.xml" })
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeServiceTest {
	private static final Log log = LogFactory.getLog(EmployeeMapperTest.class);

	@After
	public void testDown() throws Exception {
		System.out.println();
	}

	@Autowired
	private EmployeeService service;

	@Test
	public void test01AddEmployee() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Employee employee = new Employee(1004, "쏘대장", "과장", new Employee(4377), 3000000, new Department(1));
		int res = service.addEmployee(employee);
		Assert.assertEquals(1, res);
	}

	@Test
	public void test02DelEmployee() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Employee employee = new Employee(1004, "쏘대장", "과장", new Employee(4377), 3000000, new Department(1));
		int res = service.delEmployee(employee);
		Assert.assertEquals(1, res);
	}

}
