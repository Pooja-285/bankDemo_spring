package com.bank.demo.constants;

public interface URIConstants {
	
	String CREATE_BANKACCOUNT = "/api/v1/bankAccount";
	String UPDATE_BANKACCOUNT = "/api/v1/bankAccount/{id}";
	String GET_BANKACCOUNT = "/api/v1/bankAccount/{id}";
	String DEPOSIT_AMOUNT = "/api/v1/bankAccount/deposit/{id}";
	String WITHDRAW_AMOUNT = "/api/v1/bankAccount/withdraw/{id}";

}
