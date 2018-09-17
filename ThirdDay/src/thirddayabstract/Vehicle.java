package thirddayabstract;

public abstract class Vehicle {

		public void start() {
			System.out.println("Start");
		}
		public void stop() {
			System.out.println("Stop");
		}
		public abstract void changeGear();
}
