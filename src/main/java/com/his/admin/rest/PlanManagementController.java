package com.his.admin.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.his.admin.Model.PlanManagement;
import com.his.admin.service.PlanServiceManagementServiceImpl;

@RestController
public class PlanManagementController {
	@Autowired
	private PlanServiceManagementServiceImpl planService;
	
	@PostMapping("/savePlan")
	public String savePlan(@RequestBody PlanManagement plan) {
		
		boolean saveOrUpdatePlan = planService.saveOrUpdatePlan(plan);
		
		if(saveOrUpdatePlan) {
			return "successly plan created";
		}
		
		return "failed to create";
	}
	
	@GetMapping("/getAllPlans")
	public List<PlanManagement> getPlans(){
		List<PlanManagement> plans = planService.getPlans();
		
		return plans;
	}
	
	@GetMapping("/getPlan")
	public PlanManagement getPlanById(Integer id){
	PlanManagement plan = planService.getPlanById(id);
		
		return plan;
	}
	
	@PostMapping("/deletePlan")
	public String delete(Integer id ,String status){
	boolean plan = planService.deleteOrActivatePlan(id, status);
		if(plan && status=="n") {
			return "successfully deleted ";
		} else if(plan && status=="y") {
			return "successfully activated";
		}
		return "failed to delete";
	}

}
