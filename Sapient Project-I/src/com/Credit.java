package com;

public class Credit extends Payment implements Authorization{
	private int number;
	public int getNumber() {return number;}
	public void setNumber(int number) {this.number = number;}
	
	
	private String type;
	public String getType() {return type;}
	public void setType(String type) {this.type = type;}
	
	private String expDate;
	public String getExpDate() {return expDate;}
	public void setExpDate(String expDate) {this.expDate = expDate;}
	public boolean authorization() {return true;}
	
	@Override
	public boolean authorized() {
		// TODO Auto-generated method stub
		return false;
	}
}
