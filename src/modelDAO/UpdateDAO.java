package modelDAO;

import Bean.Account;

public class UpdateDAO {

	public static Account getAcc(String id) {
		// TODO Auto-generated method stub
		if (AccountDAO.data == null|| AccountDAO.correct == false) {
			AccountDAO.data = SQLConnect.getData("select * from USERS");
			AccountDAO.correct = true;
			System.out.println("Access to DB...");
		}
		//System.out.println(data);
		String[] d;
		for (String n : AccountDAO.data) {
			d = n.split("  ");
			if (id.equals(d[0])) {
				Account a = new Account(d[0], d[1], d[2], d[3]);
				return a;
			}
		}

		return null;
	}

	public static Boolean uptodate(Account a) {
		// TODO Auto-generated method stub
		String que = "UPDATE USERS SET pass = '"+a.getPass()+"',username = '"+a.getName()+"',info = '"+a.getInfo()+"'"
				+ "WHERE id = '"+a.getId()+"';";
		//System.out.println(que);
		AccountDAO.correct = false;
		return SQLConnect.Query(que);

	}

}
