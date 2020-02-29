package com.veeru.RestApi;

import org.springframework.stereotype.Component;

@Component
public class UserInfo {
	private String email;
	private String emailRecognized;
	private String emailMigrated;
	
	public UserInfo(){
		
	}
	
	
	public UserInfo(String email, String emailMigrated) {
		this.email = email;
		this.emailMigrated = emailMigrated;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmailRecognized() {
		return emailRecognized;
	}
	public void setEmailRecognized(String emailRecognized) {
		this.emailRecognized = emailRecognized;
	}
	public String getEmailMigrated() {
		return emailMigrated;
	}
	public void setEmailMigrated(String emailMigrated) {
		this.emailMigrated = emailMigrated;
	}
	
	
	

}
