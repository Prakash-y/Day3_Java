package Day2_;

import java.util.Scanner;

public class Student implements College {

	String name;
	int rollNo;
	
	Student(String n, int p)
	{
		this.name=n;
		this.rollNo=p;
	}
	@Override
	public void displaymethod() {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name : ");
		String s = sc.nextLine();
		System.out.println("Enter a roll number :");
		int n = sc.nextInt();
		System.out.println("Name :" + s);
		System.out.println("RollNo :" + n);
		//System.out.println("Name :"+ name );
	//	System.out.println("RollNo :"+ rollNo);	
	}
}
