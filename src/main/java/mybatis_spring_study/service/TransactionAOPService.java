package mybatis_spring_study.service;

import mybatis_spring_study.dto.Department;
import mybatis_spring_study.dto.Employee;

public interface TransactionAOPService {
	int trRegister(Department department, Employee employee);
	int trUnRegister(Department department, Employee employee);

}
