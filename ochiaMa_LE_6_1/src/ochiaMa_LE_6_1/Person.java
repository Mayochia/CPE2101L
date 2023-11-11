/**
 * 
 */
package ochiaMa_LE_6_1;

/**
 * 
 */
public class Person {

	private String name;
	private String address;
	private int phoneNum;
	private String email;
	
	Person(String name, String address, int phoneNum, String email){
		this.name = name;
		this.address = address;
		this.phoneNum = phoneNum;
		this.email = email;
	}
	
	public String getName() {
		return this.name;
	}
	public String getAddress() {
		return this.address;
	}
	public int getPhoneNum() {
		return this.phoneNum;
	}
	public String getEmail() {
		return this.email;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
//		return "Person: " + name;
		return "Name: " + name + "\n" + "Address: " + address
				+ "\n" + "Phone Number: " + phoneNum + "\n" + 
				"Email address: " + email + "\n";
	}

}
