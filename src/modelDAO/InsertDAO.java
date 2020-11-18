package modelDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Bean.Account;

public class InsertDAO {

	public static Boolean insert(Account a) {
		// TODO Auto-generated method stub
		String que = "INSERT INTO USERS VALUES ('"+a.getId()+"','"+a.getPass()+"','"+a.getName()+"','"+a.getInfo()+"');";
		System.out.println(que);
		AccountDAO.correct = false;
		return SQLConnect.Query(que);
	}

}
