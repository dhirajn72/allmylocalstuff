package com.spring.commands;

public class SearchCommand {
	private String sid;

	public SearchCommand() {
		// TODO Auto-generated constructor stub
	}

	public SearchCommand(String sid) {
		super();
		this.sid = sid;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	@Override
	public String toString() {
		return sid;
	}

}
