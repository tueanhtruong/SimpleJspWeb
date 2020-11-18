package modelDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DelUsersDAO {

	public static Boolean del(String q) {
		// TODO Auto-generated method stub
		String que = "DELETE FROM USERS WHERE id = '"+q+"';";
		System.out.println(que);
		AccountDAO.correct = false;
		return SQLConnect.Query(que);
	}

}
