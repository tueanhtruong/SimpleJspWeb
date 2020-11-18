package modelBO;

import modelDAO.DelUsersDAO;

public class DelUsersBO {

	public static Boolean del(String q) {
		// TODO Auto-generated method stub
		return DelUsersDAO.del(q);
	}

}
