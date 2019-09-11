package mysql.receive.mysql.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.receive.model.CDATA1;
import com.example.receive.model.DModel2;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data public class DModelHTable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	 private String devID;
	@Column(nullable = false)
	 private String devReady;
	
	@Column(nullable = false)
	 private String CMD;
	@Column(nullable = false)
	 private String YMDHMS;
	@Column(nullable = false)
	 private String CAT;
	@Column(nullable = false)
	 private String SN;
	@Column(nullable = false)
	 private String time;
	public DModelHTable(DModel2 model,String time){
		this.devID=model.getDevID();
		this.CAT=model.getCAT();
		this.CMD=model.getCMD();
		this.devReady=model.getDevReady();
		this.SN=model.getSN();
		this.YMDHMS=model.getYMDHMS();
		this.time=time;
				
	}
	

}
