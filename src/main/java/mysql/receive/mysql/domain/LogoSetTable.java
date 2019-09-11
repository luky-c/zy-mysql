package mysql.receive.mysql.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.receive.model.DeviceModel;
import com.example.receive.model.LogoSet;
import com.example.receive.model.uniteddevicemodel;
@Entity
public class LogoSetTable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false)
	private String off;
	@Column(nullable = false)
	private String onl;
	@Column(nullable = false)
	private String act;
	@Column(nullable = false)
	private String deviceID;
	@Column(nullable = false)
	private String time;
	
	public LogoSetTable(){}
	
	public LogoSetTable(uniteddevicemodel model,DeviceModel de,String time){
		LogoSet l = model.getLogoSet();
		this.act=l.getAct();
		this.off=l.getOff();
		this.onl=l.getOnl();
		this.deviceID=de.getDevID();
		this.time=time;
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
	
}
