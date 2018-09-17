package secondday;

public class SBAccount extends Account{
	
	float minBalance=1500, interestRate=6, numberOfDays;
	
	public void readBalance() {
		System.out.println("Enter the available balance:");
		availableBalance=sc.nextFloat();
		System.out.println("No. of days=");
		numberOfDays=sc.nextFloat();
	}
	
	public void calculateInterest() {
		if(numberOfDays > 30) {
			availableBalance += (availableBalance * 0.6f);
			numberOfDays -= 30;
		}
		
		System.out.println("Updates balance after credit of interest is="+availableBalance);
	}
		

}
