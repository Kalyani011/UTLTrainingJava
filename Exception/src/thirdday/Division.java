package thirdday;

import java.util.Scanner;

public class Division {
	
	public void division() throws ArithmeticException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values of a and b:");
		int a= sc.nextInt();
		int b= sc.nextInt();
		sc.close();
		if(b==0)
			throw(new ArithmeticException("b is zero"));
		System.out.println(a/b);
	}

	public static void main(String[] args) throws Exception{
		
			Division d=new Division();
			try {			
				d.division();
			
			}catch(Exception e) {
			
				e.printStackTrace();
			
			}finally {
				System.out.println("End of program");
			}
	}

}
