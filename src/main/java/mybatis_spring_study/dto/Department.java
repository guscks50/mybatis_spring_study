package mybatis_spring_study.dto;

public class Department {
private int deptNo;
private String deptName;
private int floor;
public Department() {
	super();
	// TODO Auto-generated constructor stub
}
public Department(int deptNo) {
	super();
	this.deptNo = deptNo;
}
public Department(int deptNo, String deptName, int floor) {
	super();
	this.deptNo = deptNo;
	this.deptName = deptName;
	this.floor = floor;
}
public int getDeptNo() {
	return deptNo;
}
public void setDeptNo(int deptNo) {
	this.deptNo = deptNo;
}
public String getDeptName() {
	return deptName;
}
public void setDeptName(String deptName) {
	this.deptName = deptName;
}
public int getFloor() {
	return floor;
}
public void setFloor(int floor) {
	this.floor = floor;
}
@Override
public String toString() {
	return "Department [deptNo=" + deptNo + ", deptName=" + deptName + ", floor=" + floor + "]";
}


}
