package number.hands.on;

import java.util.Scanner;

public class Strong {

	
	public static void main(String[] args) {
		int num, sum=0;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number:");
		num=scan.nextInt();
		int temp=num;
		while(temp>0) {
			int rem=temp%10;
			sum=sum+factorial(rem);
			temp=temp/10;
		}
		if(sum==num) {
			System.out.println(num+" is a strong number");
		}else {
			System.out.println(num+" is a not strong number");
		}

	}
	static int factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;		
	}

}
