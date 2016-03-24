package db;

import db.exceptions.GroupException;
import db.exceptions.UserException;

public class Group {
	private int id;
	private String name;
	private int read;
	private int write;
	private int execution;
	
	/**
	 * Group constructor without params
	 * */
	public Group() throws GroupException{
		throw new GroupException("[GroupException][ERROR]: Constructor without params denied");
	}
	
	public Group(int id, String name, int read, int write, int execution) {
		super();
		this.id = id;
		this.name = name;
		this.read = read;
		this.write = write;
		this.execution = execution;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getRead() {
		return read;
	}

	public int getWrite() {
		return write;
	}

	public int getExecution() {
		return execution;
	}
	
	
	
}
