package com.bank.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.bank.demo.constants.URIConstants;
import com.bank.demo.model.Amount;
import com.bank.demo.model.BankAccount;
import com.bank.demo.response.BankResponse;
import com.bank.demo.service.BankService;

@Controller
public class BankController {
	
	@Autowired
	private BankService bankService;
	
	@PostMapping(URIConstants.CREATE_BANKACCOUNT)
	public ResponseEntity<BankAccount> createBankAccount(@Validated BankAccount account) {
		return null;
		
	}
	
	@PutMapping(URIConstants.UPDATE_BANKACCOUNT)
	public ResponseEntity<BankAccount> updateBankAccount(@Validated BankAccount account, @PathVariable("id") String id){
		return null;
		
	}
	
	@GetMapping(URIConstants.GET_BANKACCOUNT)
	public BankAccount getBankAccount(@PathVariable("id") String id) {
		return null;
		
	}
	
	@PostMapping(URIConstants.DEPOSIT_AMOUNT)
	public ResponseEntity<BankResponse> depositAmount(@Validated Amount amount, @PathVariable("id") String id){
		return null;
	}
	
	@PostMapping(URIConstants.WITHDRAW_AMOUNT)
	public ResponseEntity<BankResponse> withdrawAmount(@Validated Amount amount, @PathVariable("id") String id){
		return null;
	}

}
