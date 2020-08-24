package com.his.admin.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.his.admin.Entity.CaseWorkerEntity;

public interface CaseWorkerRepo extends JpaRepository<CaseWorkerEntity,Serializable> {

}
