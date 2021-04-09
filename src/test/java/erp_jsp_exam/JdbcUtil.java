package erp_jsp_exam;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {
	public static Connection getConnection() throws IOException {
		Connection con = null;
		try {
			String url = "jdbc:mysql://localhost:3306/erp_jsp_exam?useSSL=false";
			String id = "ERP_JSP_EXAM";
			String passwd = "rootroot";
				
			con = DriverManager.getConnection(url,id,passwd);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
}
