package mybatis_spring_study.mapper;

import static org.junit.Assert.*;

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

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ContextRoot.class })
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeMapperTest {
	private static final Log log = LogFactory.getLog(EmployeeMapperTest.class);

	@Autowired
	private EmployeeMapper mapper;
	
	@After
	public void testDown() throws Exception{
		System.out.println();
	}
	
	@Test
	public void test01InsertEmployee() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Employee employee = new Employee(1005, "아이유", "과장", new Employee(4377), 3000000, new Department(1));
		int res = mapper.insertEmployee(employee);
		Assert.assertEquals(1, res);
	}

	@Test
	public void test02DeleteEmployee() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Employee employee = new Employee(1005, "아이유", "과장", new Employee(4377), 3000000, new Department(1));
		int res = mapper.deleteEmployee(employee);
		Assert.assertEquals(1, res);
	}

}
