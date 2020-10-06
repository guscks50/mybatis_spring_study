package mybatis_spring_study.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mybatis_spring_study.dto.Department;
import mybatis_spring_study.dto.Employee;
import mybatis_spring_study.mapper.DepartmentMapper;
import mybatis_spring_study.mapper.EmployeeMapper;
import mybatis_spring_study.service.transactionService;

@Service
public class transactionServiceImpl implements transactionService {

	@Autowired
	private DepartmentMapper deptMapper;

	@Autowired
	private EmployeeMapper empMapper;

	@Override
	@Transactional
	public void trRegister(Department department, Employee employee) {
		// 부서가 등록되고난후 해당 부서에 사원을 추가
		deptMapper.insertDepartment(department);
		empMapper.insertEmployee(employee);
		
	}

	@Override
	@Transactional
	public void trUnRegister(Department department, Employee employee) {
		int res= empMapper.deleteEmployee(employee);
		res+= deptMapper.deleteDepartment(department);
		if(res!= 2) throw new RuntimeException();

	}

}
