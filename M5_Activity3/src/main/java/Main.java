import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int option = 0;

		do {
			System.out.println("======= STUDENT COURSE MANAGEMENT =======");
			System.out.println("1. Add Student");
			System.out.println("2. Add Course");
			System.out.println("3. Show Students");
			System.out.println("4. Show Courses");
			System.out.println("0. Exit");
			
			System.out.print("Choose an option: ");
			String strOption = scn.nextLine().trim();
			option = Integer.parseInt(strOption);
			
			switch (option) {
			case 1:
				addNewStudent();
				break;
			case 2:
				addNewCourse();
				break;
			case 3:
				showAllStudents();
				break;
			case 4:
				showAllCourses();
				break;
			default:
				break;			
			}
			
		}while (option != 0);
	
		
	}
	
	public static void addNewStudent() {
		
		String name;
		int age;
		String email;
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter name: ");
		name = scn.nextLine().trim();
		
		System.out.print("Enter age: ");
		age = Integer.parseInt(scn.nextLine().trim());
		
		System.out.print("Enter email: ");
		email = scn.nextLine().trim();
		
		Student student = new Student();
		student.addStudent(name, age, email);
		
	}
	public static void addNewCourse() {
		
		String coursename;
		String grade;
		int studentId;
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter Student ID: ");
		studentId = Integer.parseInt(scn.nextLine().trim());

		System.out.print("Enter course name: ");
		coursename = scn.nextLine().trim();

		
		System.out.print("Enter grade: ");
		grade = scn.nextLine().trim();
		
		Course course = new Course();
		course.addCourse(coursename, grade, studentId);
	}
	public static void showAllStudents() {
		
		Student student = new Student();
		student.displayStudents();
	}
	public static void showAllCourses() {
		Course course = new Course();
		course.displayCourses();
	}
	
}
