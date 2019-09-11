package mysql.receive.mysql.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.receive.model.DeviceModel;
import com.example.receive.model.InstStruct;
@Entity
public class InstStructTable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	@Column(nullable = false)
	private String fanSpeed;
	@Column(nullable = false)
	private String fanDirection;
	@Column(nullable = false)
	private String mode;
	@Column(nullable = false)
	private String temperature;
	@Column(nullable = false)
	private String onOff;
	@Column(nullable = false)
	private String devID;
	@Column(nullable = false)
	private String time;
	
	public InstStructTable(){}
	
	public InstStructTable(DeviceModel model,String time){
		InstStruct i =model.getInstStruct();
		this.fanDirection=i.getFanDirection();
		this.fanSpeed=i.getFanSpeed();
		this.mode=i.getMode();
		this.onOff=i.getOnOff();
		this.temperature=i.getTemperature();
		this.devID=model.getDevID();
		this.time=time;
	}
	public String getFanSpeed(){
		return this.fanSpeed;
	}
	public String getFanDirection(){
		return this.fanDirection;
	}
	public String getMode(){
		return this.mode;
	}
	public String getTemperature(){
		return this.temperature;
	}
	public String getOnOff(){
		return this.onOff;
	}
}
