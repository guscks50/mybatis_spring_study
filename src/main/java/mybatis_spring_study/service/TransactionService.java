package mybatis_spring_study.service;

import mybatis_spring_study.dto.Department;
import mybatis_spring_study.dto.Employee;

public interface TransactionService {
	
	void trregisterTransaction(Department department, Employee employee);
	
	void trunRegisterTransaction(Department department, Employee employee);
}
