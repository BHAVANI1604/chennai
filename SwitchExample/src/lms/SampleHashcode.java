package lms;

public class SampleHashcode {
	String key;
	SampleHashcode(String key){
		this.key=key;
	}
 int hashcode() {
	 return key.charAt(0);
 }
 public boolean equals(Object obj) {
	 return key.equals((String) obj);
 }
}
