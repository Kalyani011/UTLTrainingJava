package number.hands.on;

import java.util.Scanner;

public class Spy {

	public static void main(String[] args) {
		int num, sum=0, mul=1;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number:");
		num=scan.nextInt();
		int temp=num;
		
		while(temp>0) {
			int rem=temp%10;
			sum+=rem;
			mul*=rem;
			temp=temp/10;
		}
		if(sum==mul) {
			System.out.println(num+" is a spy number");
		}else {
			System.out.println(num+" is a not spy number");
		}
	}

}
