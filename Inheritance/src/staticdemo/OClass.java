package staticdemo;

public class OClass {
	
	private static int a=30;
	
	public void outClass() {
		System.out.println("In outer class");
	}
	
	public  class InnerClass{
		public void innerClass() {
			System.out.println("In inner class, value a="+a);
		}	
	}
}
