package jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UpdateSalary {

	public static void main(String[] args) {
		try {
			Class.forName("org.h2.Driver");
			Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
			//String s="select empid,salary from employee";
			String s="select * from employee";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(s);
			
			while(rs.next()) {
				int salary= rs.getInt("salary");
				double incSalary= (0.5*salary)+salary;
				System.out.println(incSalary);
				String s1="update employee set salary="+incSalary+"";
				Statement st1=con.createStatement();
				st1.executeUpdate(s1);
			}
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
