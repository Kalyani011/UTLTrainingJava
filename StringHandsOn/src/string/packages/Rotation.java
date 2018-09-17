package string.packages;

public class Rotation {

	public static void main(String[] args) {
		String string1=new String("javaj2ee");
		String string2=new String("j2eejava");
		if(string1.substring(0, 3).contentEquals(string2.substring(4,7)) && string1.substring(4, 7).contentEquals(string2.substring(0,3))) {
			System.out.println(string1+" and "+string2+" are rotations of each other");
		}else {
			System.out.println(string1+" and "+string2+" are not rotations of each other");
		}
	}
}
