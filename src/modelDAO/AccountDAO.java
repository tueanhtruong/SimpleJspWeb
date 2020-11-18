package modelDAO;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.sound.sampled.TargetDataLine;

import Bean.Account;

public class AccountDAO {
	static ArrayList<String> data;
	static public boolean correct = true;
	public static Account getAccount(String id, String pass) {

		// DESKTOP-B1M2Q90
		if (data == null|| AccountDAO.correct == false) {
			data = SQLConnect.getData("select * from USERS");
			AccountDAO.correct = true;
			System.out.println("Access to DB...");
		}
		//System.out.println(data);
		String[] d;
		for (String n : data) {
			d = n.split("  ");
			if (id.equals(d[0]) && pass.equals(d[1])) {
				Account a = new Account(d[0], d[1], d[2], d[3]);
				return a;
			}
		}

		return null;
	}

}
