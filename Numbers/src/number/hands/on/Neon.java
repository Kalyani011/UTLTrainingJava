package number.hands.on;

import java.util.Scanner;

public class Neon {

	public static void main(String[] args) {
		
		int num, sum=0;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number:");
		num=scan.nextInt();
		int square= num*num;
		
		while(square>0) {
			int rem=square%10;
			sum+=rem;
			square=square/10;
		}
		if(sum==num) {
			System.out.println(num+" is a neon number");
		}else {
			System.out.println(num+" is a not neon number");
		}

	}

}
