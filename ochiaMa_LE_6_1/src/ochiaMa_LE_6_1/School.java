/**
 * 
 */
package ochiaMa_LE_6_1;

public class School {
	
	public static void displayInfo(Person person, Student student, Employee employee, Faculty faculty, Staff staff) {
		System.out.println("=======================");
		System.out.println(person);
		System.out.println("=======================");
		System.out.println(student);
		System.out.println("=======================");
		System.out.println(employee);
		System.out.println("=======================");
		System.out.println(faculty);
		System.out.println("=======================");
		System.out.println(staff);
		System.out.println("=======================");
	}

	public static void main(String[] args) {
//		MyDate hireDate = new MyDate(561555550000L);

   	 	Person person = new Person("May", "Cebu", 9984493, "mayochia@gmail.com");
        Student student = new Student("Andes", "Leyte",9985500,"mithcam@gmail.com", "Senior");

//        MyDate employeeHireDate = new MyDate(2022, 2, 15);  // Year, Month (0-based), Day
        Employee employee = new Employee("Aron", "Aklan",9986600,"aron@gmail.com", "DCPE", 50000, new MyDate(561555550000L));

//        MyDate facultyHireDate = new MyDate(2021, 5, 20);  // Year, Month (0-based), Day
        Faculty faculty = new Faculty("Alli", "Talamban",9987700,"alli@gmail.com", "DME", 75000,new MyDate(630000000000L), "9:00 AM - 5:00 PM", "Professor");

//        MyDate staffHireDate = new MyDate(2020, 8, 10);  // Year, Month (0-based), Day
        Staff staff = new Staff("Ange", "Ireland",9988800,"ange@gmail.com", "DCPA", 100000,new MyDate(610000000000L), "Secretary");

        displayInfo(person, student, employee, faculty, staff);
	}

}
