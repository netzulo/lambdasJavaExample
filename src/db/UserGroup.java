package db;

import db.exceptions.UserGroupException;

public class UserGroup {

	private int id;
	private int idUser;
	private int idGroup;
	
	/**
	 * UserGroup constructor without params
	 * */
	public UserGroup() throws UserGroupException{
		throw new UserGroupException("[UserGroupException][ERROR]: Constructor without params denied");
	}
	
	public UserGroup(int id, int idUser, int idGroup) {
		super();
		this.id = id;
		this.idUser = idUser;
		this.idGroup = idGroup;
	}

	public int getId() {
		return id;
	}

	public int getIdUser() {
		return idUser;
	}

	public int getIdGroup() {
		return idGroup;
	}
	
	
}
