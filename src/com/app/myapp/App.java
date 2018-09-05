package com.app.myapp;

public class App {

	private float version;
	private String versionName;
	
	public float getVersion() {
		return version;
	}
	
	public void setVersion(float version) {
		this.version = version;
	}
	
	public String getVersionName() {
		return versionName;
	}
	
	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}
	
	@Override
	public String toString() {
		return "App [version=" + version + ", versionName=" + versionName + "]";
	}
	
}
