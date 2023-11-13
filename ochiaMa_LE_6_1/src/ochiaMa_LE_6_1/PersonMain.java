package ochiaMa_LE_6_1;

import java.util.Scanner;

public class PersonMain {
	public static void displayPerson(Person person) {
		System.out.println("=======================");
		System.out.println("Person");
		System.out.println(person);
		System.out.println("=======================");
	}
	
	public static void displayStudent(Student student) {
		System.out.println("=======================");
		System.out.println("Student");
		System.out.println(student);
		System.out.println("=======================");
	}
	
	public static void displayEmployee(Employee employee) {
		System.out.println("=======================");
		System.out.println("Employee");
		System.out.println(employee);
		System.out.println("=======================");
	}
	
	public static void displayFaculty(Faculty faculty) {
		System.out.println("=======================");
		System.out.println("Faculty");
		System.out.println(faculty);
		System.out.println("=======================");
	}
	
	public static void displayStaff(Staff staff) {
		System.out.println("=======================");
		System.out.println("Staff");
		System.out.println(staff);
		System.out.println("=======================");
	}
	
	public static void displayInfo(Person person, Student student, Employee employee, Faculty faculty, Staff staff) {
		System.out.println("=======================");
		System.out.println("Person");
		System.out.println(person);
		System.out.println("=======================");
		System.out.println("Student");
		System.out.println(student);
		System.out.println("=======================");
		System.out.println("Employee");
		System.out.println(employee);
		System.out.println("=======================");
		System.out.println("Faculty");
		System.out.println(faculty);
		System.out.println("=======================");
		System.out.println("Staff");
		System.out.println(staff);
		System.out.println("=======================");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice;
		
   	 	Person person = new Person("Piolo Pascual", "Bohol", "09989876543", "piolopascual@gmail.com");
        Student student = new Student("May Ochia", "Cebu", "09984493434", "mayochia@gmail.com", Student.SOPHOMORE);
        Employee employee = new Employee("Aron Gonzaga", "Dumaguete","09986600125","arongonzaga@gmail.com", "DME", 50000, new MyDate(561555550000L));
        Faculty faculty = new Faculty("Marco Polo", "Bacolod","09987700236","marcopolo@gmail.com", "DCPE", 75000,new MyDate(630000000000L), "9:00 AM - 5:00 PM", "Dean");
        Staff staff = new Staff("Angelo Cruz", "Leyte","09988800137","angelocruz@gmail.com", "DCPA", 100000,new MyDate(610000000000L), "PhD");
		
		System.out.println("View Names: ");
		System.out.println("1. Person");
		System.out.println("2. Student");
		System.out.println("3. Employee");
		System.out.println("4. Faculty");
		System.out.println("5. Staff");
		System.out.println("6. Display all");
		
		System.out.print("Choice: ");
		choice = input.nextInt();
		
		switch(choice) {
			case 1:
				displayPerson(person);
				break;
			case 2:
				displayStudent(student);
				break;
			case 3:
				displayEmployee(employee);
				break;
			case 4:
				displayFaculty(faculty);
				break;
			case 5:
				displayStaff(staff);
				break;
			case 6:
				displayInfo(person, student, employee, faculty, staff);
				break;
			default:
				System.out.println("Invalid Input");
				break;
		}  
	}

}
