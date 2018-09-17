package gc;

public class GCExample{
	
	public static void main(String args[]) throws Throwable{
		GCExample gce = new GCExample();
		gce.finalize();
//		System.gc();
		Runtime.getRuntime().gc();
		System.out.println("Garbage Collected");
	}

}
