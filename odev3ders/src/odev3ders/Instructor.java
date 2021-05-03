package odev3ders;

public class Instructor extends User {
	String branch;
	
	public Instructor(int id, String firstName, String lastName, String mail, String password,String branch) {
		super(id, firstName, lastName, mail, password);
		this.branch = branch;	
	}

	
	
	
}
