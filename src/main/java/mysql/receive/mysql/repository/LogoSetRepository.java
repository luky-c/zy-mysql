package mysql.receive.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mysql.receive.mysql.domain.LogoSetTable;

public interface LogoSetRepository extends JpaRepository<LogoSetTable,Long>{

}
