package modelDAO;

import java.util.ArrayList;

public class ListusersDAO {

	public static ArrayList<String> getData() {
		// TODO Auto-generated method stub
		if(AccountDAO.data == null || AccountDAO.correct == false) {
			AccountDAO.data = SQLConnect.getData("select * from USERS");
			AccountDAO.correct = true;
			System.out.println("Access to DB...");
		}
		return AccountDAO.data;
	}

}
