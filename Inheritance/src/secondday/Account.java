package secondday;

import java.util.Scanner;

public class Account {
	
	Scanner sc= new Scanner(System.in);
	
	//Instance variables
	public String accountType;
	public float availableBalance, withdrawAmount, depositAmount;
	
	//Instance method

	public void withdraw() {
		
		System.out.println("Enter the amount to withdraw:");
		withdrawAmount=sc.nextFloat();
		
		if((availableBalance==0) || (availableBalance < withdrawAmount)) {
			System.out.println("Insufficient balance"+availableBalance);
		}else {
			availableBalance -= withdrawAmount;
			System.out.println("Transaction Successful");
		}
	}
	public void deposit() {
		
		System.out.println("Enter the amount to deposit:");
		depositAmount=sc.nextFloat();
		
		if(depositAmount==0) {
			System.out.println("Cannot deposit the amount");
		}else {
			availableBalance += depositAmount;
			System.out.println("Transaction Successful");
		}
	}

	
	public void displayBalance() {
		System.out.println("Balance="+availableBalance);
	}
}
