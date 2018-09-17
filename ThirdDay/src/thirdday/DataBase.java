package thirdday;

public interface DataBase {
	
		//interface variables by default public static and final
		int x=10;
	
		void printData();
		default void checkConnection() {
			System.out.println("Check connection");
		}
		static void dbConnect(){
			System.out.println("Connecting to db");
		}
}
