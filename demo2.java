import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Student's Name");
		String stu1 = scan.nextLine();
		System.out.println("Enter Student's Course");
		String course1 = scan.nextLine();
		
		System.out.println("Enter Student's Name");
		String stu2 = scan.nextLine();
		System.out.println("Enter Student's Course");
		String course2 = scan.nextLine();
		
		student obj = new student();
		System.out.println("Student List are: ");
		obj.list(stu1,course1);
		obj.list(stu2,course2);
		
		
	}

	

}
