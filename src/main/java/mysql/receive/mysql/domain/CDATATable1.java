package mysql.receive.mysql.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.receive.model.CDATA1;
import com.example.receive.model.DeviceModel;
@Entity
public class CDATATable1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	@Column(nullable = false)
	private String AIRTEMP;
	@Column(nullable = false)
	private String stat;
	@Column(nullable = false)
	private String STEAMTEMP;
	@Column(nullable = false)
	private String WATERBACK;
	@Column(nullable = false)
	private String devReady;
	@Column(nullable = false)
	private String SIOPort;
	@Column(nullable = false)
	private String shidu;
	@Column(nullable = false)
	private String workMode;
	@Column(nullable = false)
	private String wendu;
	@Column(nullable = false)
	private String DHT;
	@Column(nullable = false)
	private String TEMPSET;
	@Column(nullable = false)
	private String Switch;
	@Column(nullable = false)
	private String WATEROUT;
	@Column(nullable = false)
	private String devID;
	@Column(nullable = false)
	private String time;
	
	public CDATATable1(){}
	public CDATATable1(DeviceModel model,String time){
		CDATA1 c = model.getCDATA();
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
		this.devID=model.getDevID();
		this.time=time;
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

}
