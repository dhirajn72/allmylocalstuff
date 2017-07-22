package com.springframework.web.command;

public class CidCommand {
	private String cid;
	public CidCommand() {
		// TODO Auto-generated constructor stub
	}
	public CidCommand(String cid) {
		super();
		this.cid = cid;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}

}
