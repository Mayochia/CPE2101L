/**
 * 
 */
package ochiaMa_LE_6_1;

/**
 * 
 */
public class Student extends Person{
	private final String STATUS;
	
	Student(String name, String address, int phoneNum, String email,String STATUS){
		super(name,address,phoneNum,email);
		this.STATUS = STATUS;
	}
	
	public String getStatus() {
		return this.STATUS;
	}
	
//	public void setStatus(String STATUS) {
//		this.STATUS = STATUS;
//	}
//	
	@Override
	public String toString() {
		return "" + super.toString() + "Student: " + STATUS;
	}

}
