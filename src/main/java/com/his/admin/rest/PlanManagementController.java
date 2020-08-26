package com.his.admin.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.his.admin.Model.PlanManagement;
import com.his.admin.service.PlanServiceManagementServiceImpl;

@RestController
public class PlanManagementController {
	@Autowired
	private PlanServiceManagementServiceImpl planService;
	
	@RequestMapping("/savePlan")
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

}
