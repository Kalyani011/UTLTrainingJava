package firstday;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		int i=0;
		//int k;
		int j=0;
		Scanner sc= new Scanner(System.in);
		
		/*System.out.println("Enter the values:");
		i=sc.nextInt();
		j=sc.nextInt();
		*/
		/*k=(int)sc.nextFloat();
		System.out.println(i+"\t\t"+j+"\t\t"+k);*/
	
		/*while(j<i){
			System.out.println(j++);
		}*/
		
		/*for(int n=0; n!=6; n++) {
			System.out.println(n);
		}*/
			
		/*Implicit type casting
		 * int a=2;
		 * float b=a;*/
		System.out.println("Enter the choice:");
		System.out.println("A-Addition");
		System.out.println("M-Mulitplication");
		char ch=sc.next().charAt(0);
		
		if((ch=='A')||(ch=='M')) {
			System.out.println("Enter i"); i=sc.nextInt();
			System.out.println("Enter j"); j=sc.nextInt();
		}
		
		switch(ch) {
		case 'A':
			System.out.println(i+j);
			break;
		case 'M':
			System.out.println(i*j);
			break;
		default:
				System.out.println("No such choice");
				break;
		}
		sc.close();		
	}

}
