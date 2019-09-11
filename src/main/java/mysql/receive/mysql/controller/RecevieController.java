package mysql.receive.mysql.controller;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.example.receive.model.CDATA;
import com.example.receive.model.CDATA1;
import com.example.receive.model.DModel2;
import com.example.receive.model.DeviceModel;

import com.example.receive.model.uniteddevicemodel;

import mysql.receive.mysql.domain.CDATAHTable;
import mysql.receive.mysql.domain.CDATATable1;
import mysql.receive.mysql.domain.DModelHTable;
import mysql.receive.mysql.domain.DeviceInfoTable1;
import mysql.receive.mysql.domain.InstStructTable;
import mysql.receive.mysql.domain.LogoSetTable;
import mysql.receive.mysql.domain.PositionTable;
import mysql.receive.mysql.domain.SubRlystatusTable;
import mysql.receive.mysql.domain.UnitedDeviceTable;
import mysql.receive.mysql.repository.CDATARepository;
import mysql.receive.mysql.repository.DeviceRepository;
import mysql.receive.mysql.repository.InstStructRepository;
import mysql.receive.mysql.repository.LogoSetRepository;
import mysql.receive.mysql.repository.PositionRepository;
import mysql.receive.mysql.repository.SubRlystatusRepository;
import mysql.receive.mysql.repository.UnitedDeviceRepository;




@Component
public class RecevieController implements CommandLineRunner {
		@Autowired
		private RedisTemplate redisTemplate;
		
		@Autowired
		private DeviceRepository deviceRepository;
		

		
		@Autowired
		private UnitedDeviceRepository unitedDeviceRepository;
		
		@Autowired
		private CDATARepository cDATARepository;
		
		@Autowired
		private InstStructRepository instStructRepository;
		
		@Autowired
		private LogoSetRepository logoSetRepository;
		
		@Autowired
		private PositionRepository positionRepository;
		
		@Autowired
		private SubRlystatusRepository subRlystatusRepository;
		
	

		
		@Override

		public void run(String... strings) throws Exception{
			List<DModelHTable> list = new ArrayList<DModelHTable>();
		//	List<UnitedDeviceTable> unitlist = new ArrayList<UnitedDeviceTable>();
		//	List<LogoSetTable> logolist = new ArrayList<LogoSetTable>();
			List<CDATAHTable> cdatalist = new ArrayList<CDATAHTable>();
		//	List<InstStructTable> instlist = new ArrayList<InstStructTable>();
		//	List<PositionTable> positionlist = new ArrayList<PositionTable>();
		//	List<SubRlystatusTable> sublist = new ArrayList<SubRlystatusTable>();
			while(true){
				
				DModel2 device =  (DModel2) redisTemplate.opsForList().rightPop("device", 5, TimeUnit.SECONDS);

				
			 	if(device != null){
			 	Date date = new Date();
			 	String time = String.valueOf(date);
			 	String devID = device.getDevID();
				DModelHTable deviceinfo = new DModelHTable(device,time);
				CDATA c = device.getCDATA();
				
				CDATAHTable cDATATable = new CDATAHTable(c,devID,time);
			/*	InstStructTable instStructTable = new InstStructTable(device,time);
				PositionTable positionTable = new PositionTable(device,time);
				SubRlystatusTable sub = new SubRlystatusTable(device,time);
				List<uniteddevicemodel> list1 = device.getUnitedevice();
			
				if(list1 != null){
				for(uniteddevicemodel model : list1){
				
					unitlist.add(new UnitedDeviceTable(model,devID,time));
					logolist.add(new LogoSetTable(model,device,time));
				}
				}
			*/
				list.add(deviceinfo);
				cdatalist.add(cDATATable);
			//	instlist.add(instStructTable);
			//	positionlist.add(positionTable);
			//	sublist.add(sub);
				
				}

			 	if(list.size() > 100){
			 		deviceRepository.saveAll(list);
			 		
			 		list.clear();
			 //		unitedDeviceRepository.saveAll(unitlist);
			 //		unitlist.clear();
			 		
					cDATARepository.saveAll(cdatalist);
					cdatalist.clear();
					
			/*		instStructRepository.saveAll(instlist);
					instlist.clear();
					logoSetRepository.saveAll(logolist);
					logolist.clear();
					positionRepository.saveAll(positionlist);
					positionlist.clear();
					subRlystatusRepository.saveAll(sublist);
					sublist.clear();
				*/
			 	}
			 	
			}
			
			
		}




	
}
