package thirdday;

public class MainClass {

	public static void main(String[] args) {
		InterfaceImplementation im = new InterfaceImplementation();
		DataBase.dbConnect();
		im.printData();
		im.checkConnection();
	}

}
