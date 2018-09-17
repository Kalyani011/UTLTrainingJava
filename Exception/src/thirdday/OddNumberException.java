package thirdday;

public class OddNumberException extends Exception{

		OddNumberException(){
			super("Odd Number Exception");
		}
		
		OddNumberException(String message){
			super(message);
		}
}
