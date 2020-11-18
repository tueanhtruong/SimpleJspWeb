package Bean;

public class Account {
	private String id, name, pass, info;
	
	public Account() {
		
	}
	
	public Account(String t,String y,String u,String i) {
		this.id=t;
		this.name=u;
		this.pass=y;
		this.info=i;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
}
