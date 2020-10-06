package mybatis_spring_study.mapper;

import static org.junit.Assert.fail;

import java.util.DuplicateFormatFlagsException;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.junit.After;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import mybatis_spring_study.dto.Department;
import mybatis_spring_study.dto.Employee;
import mybatis_spring_study.service.TransactionService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/resources/context-root.xml" })
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TransactionServiceImplTest {
	private static final Log log = LogFactory.getLog(TransactionServiceImplTest.class);

	
	@After
	public void tearDown() throws Exception {
	System.out.println();
	}
	@Autowired
	private TransactionService service;
	
	@Test(expected = DuplicateFormatFlagsException.class)
	public void testARegisterTransaction_Dept_Fail() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Department department = new Department(1, "태스크포스", 10); // DuplicateKeyException
		Employee employee = new Employee(1004, "박신혜", "과장", new Employee(4377), 4100000, department);
		
		service.registerTransaction(department, employee);
	}
	@Test(expected = DuplicateKeyException.class)
	public void testBRegisterTransaction_Emp_Fail() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Department department = new Department(6, "태스크포스", 10); 
		Employee employee = new Employee(1005, "박신혜", "과장", new Employee(4377), 4100000, department);
		
		service.registerTransaction(department, employee);

	}
	@Test
	public void testCRegisterTransaction_Success() {
		fail("Not yet implemented");
	}

	@Test
	public void testUnRegisterTransaction() {
		fail("Not yet implemented");
	}

}