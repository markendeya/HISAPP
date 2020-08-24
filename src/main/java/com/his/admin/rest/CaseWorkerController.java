package com.his.admin.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.his.admin.Model.CaseWorker;
import com.his.admin.service.ICaseWorkerService;

@RestController
public class CaseWorkerController {
	
	@Autowired
	private ICaseWorkerService caseWorkerService;
	
	@RequestMapping("/saveAccount")
	public String saveCaseWorker(@RequestBody CaseWorker caseWorker) {
		String response="";
		Integer caseworkerId = caseWorkerService.saveOrUpdateCaseWorker(caseWorker);
		if(caseworkerId>0) {
			response="Successfully saved the  case worker Account with Id"+ caseworkerId;
		}
		else {
			response="unable to save Accout";
		}
		return response;
		
	}
	
	@GetMapping("/getCaseWorks")
	public List<CaseWorker> getCaseWorkers(){
		List<CaseWorker> caseWorkers = caseWorkerService.getCaseWorkers();
		return caseWorkers;
	}
	
	@GetMapping("/getCaseWorkById")
	public CaseWorker getCaseWorker(@RequestParam("id") Integer id){
		CaseWorker caseWorkers = caseWorkerService.getCaseWorkersById(id);
		return caseWorkers;
	}
	
	@GetMapping("/deleteCaseWorker")
	public String  deleteCaseWorker(@RequestParam("id") Integer id){
		String msg="";
		boolean deleteCaseWorker = caseWorkerService.deleteCaseWorker(id);
		if(deleteCaseWorker) {
			msg="deleted Account successfully";
		}
		else {
			msg="some error cannot delete account ";
		}
		return msg;
	}

}
