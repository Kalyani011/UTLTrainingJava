package firstday;

public class Phone {

	//class or instance variables
	/** dial is a variable used for connecting or disconnecting a class*/
	int dial;
	int diconnect;
	
	//instance method
	/** method makeCall() is used to connect call*/
	public void makeCall() {
		if(dial==1) {
			System.out.println("Calling");
		}else {
			System.out.println("User Busy");
		}
	}
	
}
