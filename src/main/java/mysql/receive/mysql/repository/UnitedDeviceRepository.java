package mysql.receive.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mysql.receive.mysql.domain.UnitedDeviceTable;

public interface UnitedDeviceRepository extends JpaRepository<UnitedDeviceTable,Long> {

}
