

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Connection conn ;
		String url = "jdbc:oracle:thin:@project-db-campus.smhrd.com:1524:xe";
		String id = "cgi_24k_dd26_p2_3";
		String pw = "smhrd3";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "12345");
			conn = DriverManager.getConnection(url, id, pw);
		
			System.out.println("연결성공");
		//	Statement stmt = conn.createStatement();
		//	stmt.close();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("conn failed");
		}
		
		
		
	}

}