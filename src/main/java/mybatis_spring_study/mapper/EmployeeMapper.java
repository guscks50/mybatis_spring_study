package mybatis_spring_study.mapper;

import mybatis_spring_study.dto.Employee;

public interface EmployeeMapper {
	int insertEmployee(Employee employee);
	
	int deleteEmployee(Employee employee);
}
