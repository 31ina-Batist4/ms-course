package com.elina.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.elina.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		return new Payment("Elina", 200.0, days);
	}
}
