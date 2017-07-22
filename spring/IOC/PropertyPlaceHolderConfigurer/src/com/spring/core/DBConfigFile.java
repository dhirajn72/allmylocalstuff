package com.spring.core;

public class DBConfigFile {

	private String driverClass;
	private String url;
	private String username;
	private String password;
	private int poolSize;
	private int min;
	private int max;

	public DBConfigFile() {

	}

	public DBConfigFile(String driverClass, String url, String username,
			String password, int poolSize, int min, int max) {
		super();
		this.driverClass = driverClass;
		this.url = url;
		this.username = username;
		this.password = password;
		this.poolSize = poolSize;
		this.min = min;
		this.max = max;
	}

	public String getDriverClass() {
		return driverClass;
	}

	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
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

	public int getPoolSize() {
		return poolSize;
	}

	public void setPoolSize(int poolSize) {
		this.poolSize = poolSize;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	@Override
	public String toString() {
		return driverClass + "\n" + this.url + "\n" + this.username + "\n"
				+ this.password + "\n" + this.poolSize + "\n" + this.min + "\n"
				+ this.max;
	}

}
