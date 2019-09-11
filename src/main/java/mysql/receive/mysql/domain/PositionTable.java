package mysql.receive.mysql.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.receive.model.DeviceModel;
import com.example.receive.model.Position;
@Entity
public class PositionTable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	@Column(nullable = false)
	private String city;
	@Column(nullable = false)
	private String upTime;
	@Column(nullable = false)
	private String fence;
	@Column(nullable = false)
	private String wifiMAC;
	@Column(nullable = false)
	private String area;
	@Column(nullable = false)
	private String lat;
	@Column(nullable = false)
	private String lng;
	@Column(nullable = false)
	private String devID;
	@Column(nullable = false)
	private String time;
	
	public PositionTable(){}
	
	public PositionTable(DeviceModel model,String time){
		Position p =model.getPosition();
		this.area=p.getArea();
		this.city=p.getCity();
		this.fence=p.getFence();
		this.lat=p.getLat();
		this.lng=p.getLng();
		this.upTime=p.getUpTime();
		this.wifiMAC=p.getWifiMAC();
		this.devID=model.getDevID();
		this.time= time;
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
	
}
