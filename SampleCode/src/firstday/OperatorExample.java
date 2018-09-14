package firstday;

public class OperatorExample {

	public static void main(String[] args) {
		
		int i=0, j=2;
		/*
		//post increment
		System.out.println(i++);
		
		//post decrement
		System.out.println(i--);


		//pre increment
		System.out.println(++i);
		

		//pre decrement
		System.out.println(--i);*/

		/*System.out.println(i & j);
		
		System.out.println(i | j);
		
		System.out.println(i ^ j);
		
		System.out.println(i >> 2); //right shift
		
		System.out.println(i << 2); //left shift
		
		System.out.println(~i);*/
		/*if(i!=0) {
			if(i>2) {
				System.out.println("I is greater than J");
			}else {
				System.out.println("I is less than J");
			}			
		}else {
			System.out.println("I is zero");
		}*/
		
		int k=4;
		/*if((i!=0) && (i>2) &&(k<i)) {
			System.out.println("I is greater than J and not Zero");
		}else {
			System.out.println("I is greater than J and less than K and not zero");
		}*/
		
		if(!((i!=0) || (i>j) || (k<i))) {
			System.out.println("I is greater than J and not Zero");
		}else {
			System.out.println("I is greater than J and less than K and not zero");
		}
		System.out.println("Out of if");
		
		
		System.out.println(Math.pow(5, 2));
		System.out.println(Math.floor(4.6));
		System.out.println(Math.round(4.6));
		System.out.println(Math.ceil(4.4));
		
		
	}

}
