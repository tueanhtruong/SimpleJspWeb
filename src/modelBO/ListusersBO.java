package modelBO;

import java.util.ArrayList;

import modelDAO.ListusersDAO;

public class ListusersBO {

	public static ArrayList<String> getData() {
		// TODO Auto-generated method stub
		return ListusersDAO.getData();
	}

}
