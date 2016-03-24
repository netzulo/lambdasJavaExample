package db;

import db.exceptions.UserException;

public class User {

	private int id;
	private String name;
	private String pass;
	private String email;
	
	/**
	 * user constructor without params
	 * */
	public User() throws UserException{
		throw new UserException("[UserException][ERROR]: Constructor without params denied");
	}
	
	/**
	 * user constructor with params
	 * */
	public User(int id, String name, String pass, String email) throws UserException {
		super();
		
		if(id <=0){
			throw new UserException("[UserException][ERROR]: invalid id");
		}else 
			if(name == "" || name.isEmpty()){
				throw new UserException("[UserException][ERROR]: invalid name");
			
			}else 
				if(pass == "" || name.isEmpty()){			
					throw new UserException("[UserException][ERROR]: invalid pass");			
				}else		
					if(email == "" || name.isEmpty()){
						throw new UserException("[UserException][ERROR]: invalid email");
					}
					else{
						this.id = id;
						this.name = name;
						this.pass = pass;
						this.email = email;
					}
		//End validation on user constructor with params
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPass() {
		return pass;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", pass=" + pass + ", email=" + email + "]";
	}
	
	
	
}
