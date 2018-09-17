package string.packages;

public class OccurancesOfCharacter {

	public static void main(String[] args) {
		
		String str="This is a program to count number of occurances of character";
		String str1=str.replaceAll("c", "");
		int count= str.length()-str1.length();
		System.out.println("c occurs "+count+" times");
		
	}

}
