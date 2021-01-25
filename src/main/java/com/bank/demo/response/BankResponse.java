package com.bank.demo.response;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class BankResponse {

	String id;
	Integer statusCode;
	LocalDateTime timeStamp;
	String message;
}
