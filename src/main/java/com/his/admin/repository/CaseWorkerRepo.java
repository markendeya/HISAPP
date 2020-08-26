package com.his.admin.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.his.admin.Entity.CaseWorkerEntity;

@Repository
public interface CaseWorkerRepo extends JpaRepository<CaseWorkerEntity,Serializable> {

}
