package modelBO;

import Bean.Account;
import modelDAO.AccountDAO;

public class AccountBO {

	public static Account getAccount(String id, String pass) {
		// TODO Auto-generated method stub
		return AccountDAO.getAccount(id,pass);
	}

}
