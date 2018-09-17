package firstday;

public class StringExample {

	public static void main(String[] args) {

		//First way
		String slt;
		slt=""
				+ "Hawkins Indiana"; //string literal
		
		//Second way
		String s1 = new String();
		String newS1 = new String("USA");
		
		String s2=new String("USA");
		
		System.out.println("Character at given index is:"+slt.charAt(3));
		System.out.println("Length of string:"+slt.length());
		System.out.println("Concat two strings:"+slt.concat(newS1));
		System.out.println("Substring from given index is:"+slt.substring(8,slt.length()));
		System.out.println(s2.equals(newS1));
		System.out.println(s2.compareTo(newS1));
		System.out.println(s2.compareToIgnoreCase(newS1));
		System.out.println(slt.indexOf('i'));
		System.out.println(slt.lastIndexOf('i'));
		System.out.println(slt.contains("kins"));
		System.out.println(newS1.contentEquals(s2));
		System.out.println(s2.hashCode());
		System.out.println(newS1.hashCode());
		System.out.println(slt.length());
		System.out.println(slt.trim().length());
		System.out.println(slt.trim().endsWith("na"));
		System.out.println(slt.trim().startsWith("Ha"));
		
		String[] spTokens =  slt.split(" ");
		for(String st:spTokens) {
			System.out.println(st);
		}
		
		char ch[] =newS1.toCharArray();
		for(char c:ch)
			System.out.println(c);
		
		char chars[]=new char[10];
		slt.getChars(4, 10, chars, 0);
		for(char i:chars)
			System.out.println(i);
		
		System.out.println(slt.codePointAt(3));
		System.out.println(slt.codePointBefore(3));
	}
	
}
