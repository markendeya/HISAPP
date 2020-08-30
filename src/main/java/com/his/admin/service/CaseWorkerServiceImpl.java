package com.his.admin.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.his.admin.Entity.CaseWorkerEntity;
import com.his.admin.Model.CaseWorker;
import com.his.admin.repository.CaseWorkerRepo;

@Service
public class CaseWorkerServiceImpl implements ICaseWorkerService{
	
	@Autowired
	private CaseWorkerRepo caseWorkerRepo;
	
	

	@Override
	public List<CaseWorker> getCaseWorkers() {
		List<CaseWorkerEntity> caseWorkers = caseWorkerRepo.findAll();
		List<CaseWorker> caseWorkerList=new ArrayList<CaseWorker>();
		for(CaseWorkerEntity caseWorkerEntity:caseWorkers) {
			CaseWorker caseWorker=new CaseWorker();
			BeanUtils.copyProperties(caseWorkerEntity, caseWorker);
			caseWorkerList.add(caseWorker);
		}
		
		return caseWorkerList;
	}

	@Override
	public CaseWorker getCaseWorkersById(Integer id) {
		Optional<CaseWorkerEntity> caseWorkerEntity = caseWorkerRepo.findById(id);
		CaseWorker caseWorker=new CaseWorker();
		BeanUtils.copyProperties(caseWorkerEntity.get(), caseWorker);
		return caseWorker;
	}

	@Override
	public Integer saveOrUpdateCaseWorker(CaseWorker CaseWorker) {
		CaseWorkerEntity caseWorkerEntity=new CaseWorkerEntity();
		BeanUtils.copyProperties(CaseWorker, caseWorkerEntity);
		CaseWorkerEntity caseWorkerDetails = caseWorkerRepo.save(caseWorkerEntity);
		return caseWorkerDetails.getAccountId();
	}


	@Override
	public boolean deleteCaseWorker(Integer id) {
		
		caseWorkerRepo.deleteById(id);
		return true;
	}

}
