package com.example.receive.model;

import mysql.receive.mysql.domain.CDATATable1;

public class CDATA1 {
	private String AIRTEMP;
	private String stat;
	private String STEAMTEMP;
	private String WATERBACK;
	private String devReady;
	private String SIOPort;
	private String shidu;
	private String workMode;
	private String wendu;
	private String DHT;
	private String TEMPSET;
	private String Switch;
	private String WATEROUT;
	
	public CDATA1(CDATATable1 c){
		this.AIRTEMP=c.getAIRTEMP();
		this.devReady=c.getDevReady();
		this.DHT=c.getDHT();
		this.shidu=c.getShidu();
		this.SIOPort=c.getSIOPort();
		this.stat=c.getStat();
		this.STEAMTEMP=c.getSTEAMTEMP();
		this.Switch=c.getSwitch();
		this.TEMPSET=c.getTEMPSET();
		this.WATERBACK=c.getWATERBACK();
		this.WATEROUT=c.getWATEROUT();
		this.wendu=c.getWendu();
		this.workMode=c.getWorkMode();
	}
	
	
	public String getAIRTEMP(){
		return this.AIRTEMP;
	}	
	public String getStat(){
		return this.stat;
	}
	public String getSTEAMTEMP(){
		return this.STEAMTEMP;
	}
	public String getWATERBACK(){
		return this.WATERBACK;
	}
	public String getDevReady(){
		return this.devReady;
	}
	public String getSIOPort(){
		return this.SIOPort;
	}
	public String getShidu(){
		return this.shidu;
	}
	public String getSwitch(){
		return this.Switch;
	}	
	public String getWATEROUT(){
		return this.WATEROUT;
	}
	public String getWorkMode(){
		return this.workMode;
	}
	public String getWendu(){
		return this.wendu;
	}
	public String getDHT(){
		return this.DHT;
	}
	public String getTEMPSET(){
		return this.TEMPSET;
	}
	
	
	
	public void setAIRTEMP(String a){
		this.AIRTEMP = a;
	}
	public void setStat(String a){
		this.stat=a;
	}
	public void setSTEAMTEMP(String a){
		this.STEAMTEMP = a;
	}
	public void setWATERBACK(String a){
		this.WATERBACK  = a;
	}
	public void setDevReady(String a){
		this.devReady  = a;
	}
	public void setSIOPort(String a){
		this.SIOPort  = a;
	}
	public void setShidu(String a){
		this.shidu  = a;
	}
	public void setSwitch(String a){
		this.Switch = a;
	}	
	public void setWATEROUT(String a){
		this.WATEROUT = a;
	}
	public void setWorkMode(String a){
		this.workMode = a;
	}
	public void setWendu(String a){
		this.wendu = a;
	}
	public void setDHT(String a){
		this.DHT = a;
	}
	public void setTEMPSET(String a){
		this.TEMPSET = a;
	}
}