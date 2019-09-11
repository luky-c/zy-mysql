package mysql.receive.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mysql.receive.mysql.domain.CDATAHTable;


public interface CDATARepository extends JpaRepository<CDATAHTable,Long>{

}
