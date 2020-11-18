package modelBO;

import Bean.Account;
import modelDAO.InsertDAO;

public class InsertBO {

	public static Boolean insert(Account a) {
		// TODO Auto-generated method stub
		return InsertDAO.insert(a);
	}

}
