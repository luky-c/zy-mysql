package mysql.receive.mysql.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.receive.model.DeviceModel;

@Entity
public class DeviceInfoTable1{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	
	/*
	@Column(nullable = false)
    private String siteToken;
	@Column(nullable = false)
    private String specToken;

	@Column(nullable = false)
    private String specName;
	*/
	
  
	@Column(nullable = false)
	private long errcode;
	@Column(nullable = false)
	private String errmsg;
	@Column(nullable = false)
	private String devName;
	@Column(nullable = false)
	private String devID;
	@Column(nullable = false)
	private String devStatus;
	@Column(nullable = false)
	private String devType;
	@Column(nullable = false)
	private String lastInst;
	@Column(nullable = false)
	private String socketOut_W;
	@Column(nullable = false)
	private String socketOutY_W;
	@Column(nullable = false)
	private String socketOut_P;
	@Column(nullable = false)
	private String thisMonth;
	@Column(nullable = false)
	private String lastMonth;
	@Column(nullable = false)
	private String socketOut_upTime;
	@Column(nullable = false)	
	private String token;
	@Column(nullable = false)
	private String time;
    public DeviceInfoTable1(){}
    public DeviceInfoTable1(DeviceModel model,String time){
    	this.devID=model.getDevID();
    	this.devName=model.getDevName();
    	this.devStatus=model.getDevStatus();
    	this.devType=model.getDevType();
    	this.errcode=model.getErrcode();
    	this.errmsg=model.getErrmsg();
    	this.lastInst=model.getLastInst();
    	this.lastMonth=model.getLastMonth();
    	this.socketOut_P=model.getSocketOut_P();
    	this.socketOut_upTime=model.getSocketOut_upTime();
    	this.socketOut_W=model.getSocketOut_W();
    	this.socketOutY_W=model.getSocketOutY_W();
    	this.thisMonth=model.getThisMonth();
    	this.token=model.getToken();
    	this.time = time;
    }
/*
    public DeviceInfoTable(String name,String type,long userId,String status) {
        this.name = name;
        
        this.type=type;
    
        this.userId=userId;
        
        this.status = status;
    }
	
    public void setId(long id){
    	this.id = id;
    }
    public long getId()	{
    	return this.id;
    }
    public void setUserId(long userId){
    	this.userId = userId;
    }
    public long getUserId()	{
    	return this.userId;
    }
    
    
   
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    public String getStastus(){
        return this.status;
    }
   
   
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    */
    public String getSocketOut_P(){
		return this.socketOut_P;
	}
	public String getThisMonth(){
		return this.thisMonth;
	}
	public String getLastMonth(){
		return this.lastMonth;
	}
	public String getSocketOut_upTime(){
		return this.socketOut_upTime;
	}
    public long getErrcode(){
		return this.errcode;
	}
	public String getErrmsg(){
		return this.errmsg;
	}
    public String getTime(){
        return this.time;
    }
    public String getDevName(){
		return this.devName;
	}
	public String getDevID(){
		return this.devID;
	}
	public String getDevStatus(){
		return this.devStatus;
	}
	public String getDevType(){
		return this.devType;
	}
	public String getLastInst(){
		return this.lastInst;
	}
	public String getSocketOut_W(){
		return this.socketOut_W;
	}
	public String getSocketOutY_W(){
		return this.socketOutY_W;
	}
	

	public String getToken(){
		return this.token;
	}

}

