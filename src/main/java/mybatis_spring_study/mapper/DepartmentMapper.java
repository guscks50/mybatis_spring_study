package mybatis_spring_study.mapper;

import java.util.List;

import mybatis_spring_study.dto.Department;

public interface DepartmentMapper {
	int deleteDepartment(Department department);
	int insertDepartment(Department department);
	int updateDepartment(Department department);
	List<Department> selectDepartmentByAll();
	Department selectDepartmentByNo(Department department);
}
