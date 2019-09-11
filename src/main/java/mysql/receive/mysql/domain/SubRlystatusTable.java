package mysql.receive.mysql.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.receive.model.DeviceModel;
import com.example.receive.model.SubRlystatus;
@Entity
public class SubRlystatusTable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	@Column(nullable = false)
	private String test;
	@Column(nullable = false)
	private String devID;
	@Column(nullable = false)
	private String time;
	
	public SubRlystatusTable(){}
	
	public SubRlystatusTable(DeviceModel model,String time){
		SubRlystatus s =model.getSubRlystatus();
		this.test=s.getTest();
		this.devID=model.getDevID();
		this.time=time;
	}
	
	
	
}
	
	
