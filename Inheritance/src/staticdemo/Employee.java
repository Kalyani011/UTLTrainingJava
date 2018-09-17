package staticdemo;

import java.util.Scanner;

public class Employee {

	String ename;
	String eid;
	static String company; 
	Scanner sc= new Scanner(System.in);
	
	static {
		System.out.println("Employee Static Block");
	}
	
	void readVal(){
		System.out.println("Enter employee details:");
		System.out.println("eid:");
		eid=sc.next();
		System.out.println("ename:");
		ename=sc.next();
		System.out.println("company:");
		company=sc.next();
	}
	void printVal() {
		System.out.println("employee details:");
		System.out.println("eid:"+eid);
		System.out.println("ename:"+ename);
		System.out.println("company:"+company);
	}
	static void calculateSalary() {
		System.out.println("Salary of the emplyoee= 150000");
	}
}
