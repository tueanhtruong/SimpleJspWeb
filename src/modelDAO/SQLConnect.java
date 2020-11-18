package modelDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SQLConnect {
	//ArrayList<String> data;
	public static 	Connection conn = null;
	public static void Connect() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String DB_URL = "jdbc:sqlserver://DESKTOP-B1M2Q90;"
	            + "databaseName=JSPDB;"
	            + "integratedSecurity=true";
		try {
		conn = DriverManager.getConnection(DB_URL);}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static Boolean Query(String q) {
		if(SQLConnect.conn==null) {
			Connect();
		}
		Statement stmt;
		try {
			stmt = conn.createStatement();
	        ResultSet rs = stmt.executeQuery(q);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
        // get data from table 'student'
		return true;

	}
	public static ArrayList<String> getData(String query) {
		if(SQLConnect.conn==null) {
			Connect();
		}
		ArrayList<String> data = new ArrayList<String>();
		try {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        String n;
        ResultSetMetaData rsmd = rs.getMetaData();
        String name = "";
        for(int i = 0; i<rsmd.getColumnCount();i++) {
        	name = name + rsmd.getColumnName(i+1) + "  ";
        }
        data.add(name);
        while (rs.next()) {
            n = rs.getString(1) + "  " + rs.getString(2) 
            + "  " + rs.getString(3)+ "  " + rs.getString(4);
            //System.out.println(n);
            data.add(n);
        }
		} catch(Exception e) {
			e.printStackTrace();
		}
		return data;
	}
	public static boolean closeC() {
		try {
			SQLConnect.conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		//getData("");
		System.out.println(getData("select * from USERS"));
	}
}


