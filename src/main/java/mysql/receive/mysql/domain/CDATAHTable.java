package mysql.receive.mysql.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.receive.model.CDATA;

import lombok.Data;

@Entity
@Data public class CDATAHTable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
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
	private String workMode;
	@Column(nullable = false)
	private String wendu;
	@Column(nullable = false)
	private String TEMPSET;
	@Column(nullable = false)
	private String Switch;
	@Column(nullable = false)
	private String WATEROUT;
	@Column(nullable = false)
	private String OILLEVEL;
	@Column(nullable = false)
	private String devID;
	@Column(nullable = false)
	private String time;
	public CDATAHTable(CDATA c,String devID,String time){
		this.AIRTEMP=c.getAIRTEMP();
		this.devReady=c.getDevReady();
		this.OILLEVEL=c.getOILLEVEL();
		this.stat=c.getStat();
		this.STEAMTEMP=c.getSTEAMTEMP();
		this.Switch=c.getSwitch();
		this.TEMPSET=c.getTEMPSET();
		this.WATERBACK=c.getWATERBACK();
		this.WATEROUT=c.getWATEROUT();
		this.wendu=c.getWendu();
		this.workMode=c.getWorkMode();
		this.devID=devID;
		this.time=time;		
	}
	
}
