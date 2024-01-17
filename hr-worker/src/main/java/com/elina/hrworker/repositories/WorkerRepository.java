package com.elina.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elina.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
