package com.his.admin.service;

import java.util.List;

import com.his.admin.Model.CaseWorker;

public interface ICaseWorkerService {
	
public List<CaseWorker> getCaseWorkers();
	
	public CaseWorker getCaseWorkersById(Integer id);
	
	public Integer saveOrUpdateCaseWorker(CaseWorker CaseWorker);
	
	public boolean deleteCaseWorker(Integer id);

}
