package mybatis_spring_study.service;

import mybatis_spring_study.dto.Department;
import mybatis_spring_study.dto.Employee;

public interface TransactionAOPService {
	public int trRegister(Department department,Employee employee);
	
	public int trUnRegister(Department department,Employee employee);
}
