package string.packages;

public class ReverseWords {

	public static void main(String[] args) {
		String string=new String("Reverse this string");
		String[] subStrings=string.split("\\s");
		System.out.println("Original String:"+string);
		String reversedString = "";
		for (int i = 0; i < subStrings.length; i++){
			String word = subStrings[i]; 
	        String reverseWord = "";
	        for (int j = word.length()-1; j >= 0; j--){
			
	        	reverseWord = reverseWord + word.charAt(j);
	        }
		   reversedString = reversedString + reverseWord + " ";
		}
		
		System.out.println("Reversed String:"+reversedString);
	}

}
