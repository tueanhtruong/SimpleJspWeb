package modelBO;

import java.util.ArrayList;

import modelDAO.ListusersDAO;

public class ListusersBO {

	public static ArrayList<String> getData() {
		// TODO Auto-generated method stub
		return ListusersDAO.getData();
	}

	public static ArrayList<String> searchData(String s, String op) {
		// TODO Auto-generated method stub
		ArrayList<String> data = ListusersDAO.getData();
		ArrayList<String> search = new ArrayList<String>();
		search.add(data.get(0));
		String[] nn;
		String n;
		int o = Integer.parseInt(op);
		for(int i = 1;i<data.size();i++) {
			n = data.get(i);
			nn = n.split("  ");
			if(nn[o+1].toLowerCase().contains(s)) {
				search.add(n);
			}
		}
		return search;
	}

}
