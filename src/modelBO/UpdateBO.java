package modelBO;

import Bean.Account;
import modelDAO.UpdateDAO;

public class UpdateBO {

	public static Account getAcc(String id) {
		// TODO Auto-generated method stub
		return UpdateDAO.getAcc(id);
	}


	public static Boolean uptodate(Account a) {
		// TODO Auto-generated method stub
		return UpdateDAO.uptodate(a);
	}

}
