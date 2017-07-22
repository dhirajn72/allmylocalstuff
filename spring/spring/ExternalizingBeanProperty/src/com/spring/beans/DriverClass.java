package com.spring.beans;

public class DriverClass {

	private String dcName;
	private String url;
	private String username;
	private String password;
	private String minSize;
	private String maxSize;

	public DriverClass() {
		// TODO Auto-generated constructor stub
	}

	public DriverClass(String dcName, String url, String username,
			String password, String minSize, String maxSize) {
		super();
		this.dcName = dcName;
		this.url = url;
		this.username = username;
		this.password = password;
		this.minSize = minSize;
		this.maxSize = maxSize;
	}

	public String getDcName() {
		return dcName;
	}

	public void setDcName(String dcName) {
		this.dcName = dcName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMinSize() {
		return minSize;
	}

	public void setMinSize(String minSize) {
		this.minSize = minSize;
	}

	public String getMaxSize() {
		return maxSize;
	}

	public void setMaxSize(String maxSize) {
		this.maxSize = maxSize;
	}

	@Override
	public String toString() {
		return "\n DriverClass=" + dcName + ",\n url=" + url
				+ ",\n username=" + username + ",\n password=" + password
				+ ",\n minSize=" + minSize + ",\n maxSize=" + maxSize;
	}

}
