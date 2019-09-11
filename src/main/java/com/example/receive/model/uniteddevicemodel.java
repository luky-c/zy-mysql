package com.example.receive.model;

public class uniteddevicemodel {
	private String lastInst;
	private String devType;
	private String infraTypeID;
	private String bigType;
	private String infraName;
	private LogoSet logoSet;
	private String subWeight;
	
	public String getInfraTypeID(){
		return this.infraTypeID;
	}
	public String getDevType(){
		return this.devType;
	}
	public String getLastInst(){
		return this.lastInst;
	}
	public String getBigType(){
		return this.bigType;
	}
	public String getInfraName(){
		return this.infraName;
	}
	public String getSubWeight(){
		return this.subWeight;
	}
	
	
	public void setInfraTypeID(String ID){
		this.infraTypeID = ID;
	}
	public void setDevType(String type){
		this.devType = type;
	}
	public void setLastInst(String inst){
		this.lastInst = inst;
	}
	public void setBigType(String bigtype){
		this.bigType = bigtype;
	}
	public void setInfraName(String name){
		this.infraName = name;
	}
	public void setSubWeight(String a){
		this.subWeight = a;
	}
	
	
	public LogoSet getLogoSet(){
		return this.logoSet;
	}
	public void setLogoSet(LogoSet logoSet){
		this.logoSet = logoSet;
	}
	
	
}
