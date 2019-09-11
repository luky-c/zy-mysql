package com.example.receive.model;

import mysql.receive.mysql.domain.PositionTable;

public class Position {
	private String city;
	private String upTime;
	private String fence;
	private String wifiMAC;
	private String area;
	private String lat;
	private String lng;
	
	public Position(PositionTable p){
		this.area=p.getArea();
		this.city=p.getCity();
		this.fence=p.getFence();
		this.lat=p.getLat();
		this.lng=p.getLng();
		this.upTime=p.getUpTime();
		this.wifiMAC=p.getWifiMAC();
	}
	
	public String getCity(){
		return this.city;
	}
	public String getUpTime(){
		return this.upTime;
	}
	public String getFence(){
		return this.fence;
	}
	public String getWifiMAC(){
		return this.wifiMAC;
	}
	public String getArea(){
		return this.area;
	}
	public String getLat(){
		return this.lat;
	}
	public String getLng(){
		return this.lng;
	}
	
	
	public void setCity(String city){
		this.city = city;
	}
	public void setUpTime(String up){
		this.upTime = up;
	}
	public void setFence(String fence){
		this.fence = fence;
	}
	public void setWifiMAC(String wifi){
		this.wifiMAC = wifi;
	}
	public void setArea(String area){
		this.area =area;
	}
	public void setLat(String lat){
		this.lat = lat;
	}
	public void setLng(String lng){
		this.lng = lng;
	}
}
