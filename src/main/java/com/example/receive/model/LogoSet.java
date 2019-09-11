package com.example.receive.model;

import mysql.receive.mysql.domain.LogoSetTable;

public class LogoSet {
	private String off;
	private String onl;
	private String act;
	
	public LogoSet(LogoSetTable l){
		this.act=l.getAct();
		this.off=l.getOff();
		this.onl=l.getOnl();
	}
	
	public String getOff(){
		return this.off;
	}
	public String getOnl(){
		return this.onl;
	}
	public String getAct(){
		return this.act;
	}
	public void setOff(String a){
		this.off = a;
	}
	public void setOnl(String a){
		this.onl = a;
	}
	public void setAct(String a){
		this.act = a;
	}
}
