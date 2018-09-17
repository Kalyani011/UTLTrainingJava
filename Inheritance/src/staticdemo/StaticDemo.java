package staticdemo;

public class StaticDemo {

	public static void main(String...a) {
		
		//static inner class object creation
//		OClass.InnerClass oi= new OClass.InnerClass();
//		oi.innerClass();

		
		//for non-static inner class
		OClass os= new OClass();
		OClass.InnerClass oi = os.new InnerClass(); 
		
//		Employee e[]=new Employee[10];
//		//e.readVal();
//		
//		for(int i=0;i < e.length; i++) {
//			e[i]=new Employee();
//		}
//		e[0].eid="L008";
//		e[0].ename="Kali";	
//		
//		e[1].eid="L009";
//		e[1].ename="Dottie";
//		
//		Employee.company="LnT";
//		Employee.calculateSalary();
		
	}

}
