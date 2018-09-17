package thirdday;

import java.util.Scanner;

public class UserDefinedException {

	
	static boolean checkCharacters(String val){
		
		char[] valArr= val.toCharArray();
		int flag=0,flag1=0;
		
		for(char ch:valArr) {
			if(ch=='@' || ch=='#' || ch=='$' || ch=='%' || ch=='!' || ch=='^' || ch=='&' || ch=='*') {
				flag=1;
				break;
			}
		}
	
		for(char ch:valArr) {
				if(ch>=0 && ch<=9) {
					flag1=1;
					break;
				}
		}	
	
		if(flag==1 && flag1==1) {
			return true;
		}else {
			return false;	
		}		
	}
	public static void main(String[] args) {
		String val;
		Scanner sc=new Scanner(System.in);
		val= sc.next();
		int len=val.length();
		System.out.println(len);
		boolean flag=checkCharacters(val);
		System.out.println(flag);
		try {
			if(len<8 || flag) {
				throw(new PasswordException());
			}
		}catch(PasswordException e) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
			System.out.println("Closed the scanner");
		}
		
	}

}
