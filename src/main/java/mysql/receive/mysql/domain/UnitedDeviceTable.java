package mysql.receive.mysql.domain;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.receive.model.DeviceModel;
import com.example.receive.model.uniteddevicemodel;


@Entity
public class UnitedDeviceTable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	@Column(nullable = false)
	private String lastInst;
	@Column(nullable = false)
	private String devType;
	@Column(nullable = false)
	private String infraTypeID;
	@Column(nullable = false)
	private String bigType;
	@Column(nullable = false)
	private String infraName;
	@Column(nullable = false)
	private String devID;
	@Column(nullable = false)
	private String subWeight;
	@Column(nullable = false)
	private String time;
	public UnitedDeviceTable(){}
	public UnitedDeviceTable(uniteddevicemodel model,String devID,String time){
		this.bigType=model.getBigType();
		this.devID=devID;
		this.devType=model.getDevType();
		this.infraName=model.getInfraName();
		this.infraTypeID=model.getInfraTypeID();
		this.lastInst=model.getLastInst();
		this.subWeight=model.getSubWeight();
		this.time=time;
	}
}
