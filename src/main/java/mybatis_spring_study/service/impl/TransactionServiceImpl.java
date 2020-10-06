package mybatis_spring_study.service.impl;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mybatis_spring_study.dto.Department;
import mybatis_spring_study.dto.Employee;
import mybatis_spring_study.mapper.DepartmentMapper;
import mybatis_spring_study.mapper.EmployeeMapper;
import mybatis_spring_study.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService {
	@Autowired
	private DepartmentMapper deptMapper;
	@Autowired
	private EmployeeMapper empMapper;
	
	@Override
	@Transactional
	public void registerTransaction(Department department, Employee employee) {
		//부서가 등록되고 난후 해당 부서에 사원을 추가
		deptMapper.insertDepartment(department);
		empMapper.insertEmployee(employee);


		int res = deptMapper.insertDepartment(department);
		res += empMapper.insertEmployee(employee);
		if (res != 2) throw new RuntimeException();


	}

	@Override
	@Transactional
	public void unRegisterTransaction(Department department, Employee employee) {
		
		empMapper.deleteEmployee(employee);
		deptMapper.deleteDepartment(department);
		int res = empMapper.deleteEmployee(employee);
		res += deptMapper.deleteDepartment(department);
		if (res != 2) throw new RuntimeException();

	}

}
