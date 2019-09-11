package mysql.receive.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mysql.receive.mysql.domain.PositionTable;

public interface PositionRepository extends JpaRepository<PositionTable,Long>{

}
