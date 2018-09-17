package string.packages;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
	
		String str=new String("Remove     the whitespaces");
		str=str.replaceAll("\\s+","");
		System.out.println(str);
	}

}
