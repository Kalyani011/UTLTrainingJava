package jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeTableExample {

	public static void main(String[] args) {
		try {
			Class.forName("org.h2.Driver");
			Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
			//String s="select empid,salary from employee";
			String s="select * from employee where salary>50000";
			Statement st=con.createStatement();
			ResultSet rs= st.executeQuery(s);
			while(rs.next()) {
				System.out.println("empid:"+rs.getInt("empid")+"\t empname:"+rs.getString("empname")+"\t salary:"+rs.getInt("salary"));
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
