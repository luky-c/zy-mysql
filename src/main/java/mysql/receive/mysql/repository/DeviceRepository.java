package mysql.receive.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mysql.receive.mysql.domain.DModelHTable;
import mysql.receive.mysql.domain.DeviceInfoTable1;

public interface DeviceRepository extends JpaRepository<DModelHTable,Long>{

}
