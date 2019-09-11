package mysql.receive.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mysql.receive.mysql.domain.InstStructTable;

public interface InstStructRepository extends JpaRepository<InstStructTable,Long>{

}
