package number.hands.on;

import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) {

		int num;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number:");
		num=scan.nextInt();
		int square= num*num;
		
		if((square%10)==num) {
			System.out.println(num+" is a automorphic number");
		}else {
			System.out.println(num+" is a not automorphic number");
		}
	}

}
