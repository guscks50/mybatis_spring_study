package mybatis_spring_study.service;

import mybatis_spring_study.dto.Department;
import mybatis_spring_study.dto.Employee;

public interface TransactionService {
	
	void registerTransaction(Department department, Employee employee);
	
	void unRegisterTransaction(Department department, Employee employee);
}
