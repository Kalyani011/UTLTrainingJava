package string.packages;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String args[]) {
		
		int flag=1;
		String string1= new String("dusty");
		String string2= new String("study");
		
		char first[]=string1.toCharArray();
		char second[]=string2.toCharArray();
		
		Arrays.sort(first);
		Arrays.sort(second);
		
		if(first.length==second.length) {
			for(int i=0;i<first.length;i++){
				if(first[i]!=second[i]) {
					flag=0;
				}
			}
		}else {
			flag=0;
		}
		if(flag==1) {
			System.out.println(string1+" and "+string2+ " are anagrams");
		}else {
			System.out.println(string1+" and "+string2+ " are not anagrams");
		}
		
	}
}
