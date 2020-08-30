package com.his.admin.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.his.admin.Model.CaseWorker;
import com.his.admin.Model.CustomResponse;
import com.his.admin.service.CaseWorkerServiceImpl;

@RestController
public class CaseWorkerController {
	
	@Autowired
	private CaseWorkerServiceImpl caseWorkerService;
	
	@PostMapping("/saveAccount")
	public ResponseEntity<CustomResponse> saveCaseWorker(@RequestBody CaseWorker caseWorker) {
		Integer caseworkerId = caseWorkerService.saveOrUpdateCaseWorker(caseWorker);
		CustomResponse response= new CustomResponse();
		if(caseworkerId>0) {
			response.message="Successfully saved the  case worker Account with Id " + caseworkerId;
			response.status=HttpStatus.OK.value();
		}
		else {
			response.message="unable to save Accout";
		}
		return new ResponseEntity<CustomResponse>(response,HttpStatus.OK);
		
	}
	
	@GetMapping("/getAccountDetails")
	public List<CaseWorker> getCaseWorkers(){
		List<CaseWorker> caseWorkers = caseWorkerService.getCaseWorkers();
		return caseWorkers;
	}
	
	@GetMapping("/getAccountById/{id}")
	public CaseWorker getCaseWorker(@PathVariable("id") Integer id){
		CaseWorker caseWorkers = caseWorkerService.getCaseWorkersById(id);
		return caseWorkers;
	}
	
	@DeleteMapping("/deleteAccount/{id}")
	public String  deleteCaseWorker(@PathVariable("id") Integer id){
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
