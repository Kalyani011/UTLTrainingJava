package jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class TableCreate {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("org.h2.Driver");
			Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
			//String s="select empid,salary from employee";
//			String s="create table riverdale(character varchar(20), actor varchar(20))";
//			Statement st=con.createStatement();
//			st.executeUpdate(s);

			for(int i=0;i<4;i++) {
				System.out.println("Enter character:");
				String character=sc.next();

				System.out.println("Enter actor:");
				String actor=sc.next();
				String s1="insert into riverdale values('"+character+"','"+actor+"')";	
				Statement st1=con.createStatement();
				st1.executeUpdate(s1);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
