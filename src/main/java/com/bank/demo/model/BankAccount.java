package com.bank.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class BankAccount {

	private String accountId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String accountNumber;
	private Double amount;
	private AccountType accountType;
}
