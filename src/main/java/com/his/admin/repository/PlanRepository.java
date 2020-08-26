package com.his.admin.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.his.admin.Entity.PlanManagementEntity;

@Repository
public interface PlanRepository extends JpaRepository<PlanManagementEntity,Serializable> {
	
	@Modifying
	@Query("update PlanManagementEntity d set d.activateSw=:status where d.planId=:id")
	public int deleteOrActivatePlan(@Param("id") Integer Id,@Param("status") String status);

}
