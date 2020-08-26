package com.his.admin.service;

import java.util.List;

import com.his.admin.Model.PlanManagement;

public interface IPlanMangementService {

	public boolean saveOrUpdatePlan(PlanManagement plan);
	
	public List<PlanManagement> getPlans();
	
	public PlanManagement getPlanById(Integer Id);
	
	public boolean deletePlanById(Integer Id);
	
	public boolean deleteOrActivatePlan(Integer Id , String status);
}
