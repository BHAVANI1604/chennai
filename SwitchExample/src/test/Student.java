package test;

public class Student {
	private String name;
	private int id;
	private String city;
	private String dept;
	private int dob;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getDob() {
		return dob;
	}
	public void setDob(int dob) {
		this.dob = dob;
	}
	public Student(String name, int id, String city, String dept, int dob) {
		super();
		this.name = name;
		this.id = id;
		this.city = city;
		this.dept = dept;
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", city=" + city + ", dept=" + dept + ", dob=" + dob + "]";
	}
	

}
