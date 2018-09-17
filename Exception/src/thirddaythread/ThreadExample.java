package thirddaythread;

//public class ThreadExample  extends Thread{
//
//	public void run() {
//		System.out.println("Thread exxample run method");
//	}
//	public static void main(String args[]) {
//		ThreadExample te=new ThreadExample();
//		te.start();
//	}
//}
public class ThreadExample implements Runnable{

	public void run() {
		System.out.println("Thread example run method");
	}
	public static void main(String args[]) {
		ThreadExample te=new ThreadExample();
		Thread t= new Thread(te);
		t.start();
		System.out.println(t.getPriority());
		t.setPriority(6);
		System.out.println(t.getPriority());
		System.out.println(t.isDaemon());
		t.setDaemon(true);
		System.out.println(t.isDaemon());
	}
}
