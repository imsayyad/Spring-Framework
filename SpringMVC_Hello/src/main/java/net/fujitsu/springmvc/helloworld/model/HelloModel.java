package net.fujitsu.springmvc.helloworld.model;

public class HelloModel {
	private String message;
	private String dateTime;
	
	public HelloModel () {
		
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	
	
}
