package streem;

public class Student {
	
private String name;
private int id;
private int fee;
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
public Student(String name, int id, int fee) {
	super();
	this.name = name;
	this.id = id;
	this.fee = fee;
}
public int getFee() {
	return fee;
}
public void setFee(int fee) {
	this.fee = fee;
}
@Override
public String toString() {
	return name+" "+id+" "+fee;
			
}

}
