package firstday;

public class SampleApp {

	public static void main(String[] args) { 
		// A signature is combination of function name, parameters, return type, access specifiers and modifiers

		float principle=10000, simpleInterest, rateOfInterest=2, numberOfYears=1; 

			simpleInterest = principle * rateOfInterest * numberOfYears/100;
			
			System.out.println("The simple interest is "+simpleInterest);
			
			//System.out.println("This is first java program");
	}
}
