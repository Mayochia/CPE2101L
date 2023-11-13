/**
 * 
 */
package ochiaMa_LE_6_1;

/**
 * 
 */
public class Staff extends Employee{
	
	private String title;
	
	Staff(){
		super();
	}
	
	Staff(String name, String address, String phoneNum, String email, String office, double salary, MyDate hireDate, String title) {
		super(name, address, phoneNum, email, office, salary, hireDate);
		this.title = title;
	}
	
		
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n"+ "Title: " + title;
	}

}
