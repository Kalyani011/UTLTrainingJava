package jdbcexample;

import java.sql.*;

public class JDBCExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("org.h2.Driver");
			Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
			String s="select * from sample";
			Statement st=con.createStatement();
			ResultSet rs= st.executeQuery(s);
			while(rs.next()) {
				System.out.println("id:"+rs.getInt(1));
				System.out.println("name:"+rs.getString(2));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
