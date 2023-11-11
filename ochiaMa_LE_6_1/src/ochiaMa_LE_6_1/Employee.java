/**
 * 
 */
package ochiaMa_LE_6_1;

/**
 * 
 */
public class Employee extends Person{

	private String office;
	private double salary;
	private MyDate hireDate;
	
	Employee(String name, String address, String phoneNum, String email, 
			 String office,double salary, MyDate hireDate){
		
		super(name, address,phoneNum, email);
		this.office = office;
		this.salary = salary;
		this.hireDate = hireDate;
	}
	
	public String getOffice() {
		return this.office;
	}
	public double getSalary() {
		return this.salary;
	}
	public MyDate getHireDate() {
		return this.hireDate;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setHireDate(MyDate hireDate) {
		this.hireDate = hireDate;
	}
	@Override
	public String toString() {
		return "" + super.toString() + "\n" +"Office: " + this.office + "\n" + 
				"Salary: " + salary + "\n" + "Date Hired: " + hireDate.toString();
	}

}
