package com.his.admin.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.his.admin.Entity.PlanManagementEntity;
import com.his.admin.Model.PlanManagement;
import com.his.admin.repository.PlanRepository;

@Service
public class PlanServiceManagementServiceImpl implements IPlanMangementService {
	
	@Autowired
	private PlanRepository planRepo;

	@Override
	public boolean saveOrUpdatePlan(PlanManagement plan) {
		PlanManagementEntity planEntity =new PlanManagementEntity();
		BeanUtils.copyProperties(plan, planEntity);
		PlanManagementEntity savedplanEntity = planRepo.save(planEntity);
		if(savedplanEntity!=null && savedplanEntity.getPlanId()>0) {
			return true;
		}
		return false;
	}

	@Override
	public List<PlanManagement> getPlans() {
		
		List<PlanManagementEntity> planEntityList = planRepo.findAll();
		List<PlanManagement> planList=new ArrayList<PlanManagement>();
		
		for(PlanManagementEntity entity:planEntityList) {
			PlanManagement plan=new PlanManagement();
			BeanUtils.copyProperties(entity, plan );
			planList.add(plan);
			
		}
		return planList;
	}

	@Override
	public PlanManagement getPlanById(Integer Id) {
                  
		Optional<PlanManagementEntity> planEntity = planRepo.findById(Id);
		PlanManagement plan=new PlanManagement();
		BeanUtils.copyProperties(planEntity.get(), plan);
		return plan;
	}

	@Override
	public boolean deletePlanById(Integer Id) {
		return false;
	}

	@Override
	public boolean deleteOrActivatePlan(Integer Id, String status) {
		int planId = planRepo.deleteOrActivatePlan(Id,status);
		if(planId>0)
			return true;
		return false;
	}

}
