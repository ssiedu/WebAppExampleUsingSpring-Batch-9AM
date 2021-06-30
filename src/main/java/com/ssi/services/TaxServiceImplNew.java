package com.ssi.services;

import org.springframework.stereotype.Service;

import com.ssi.models.TaxModel;

@Service
public class TaxServiceImplNew implements TaxService {
	public void computeTax(TaxModel model) {
		System.out.println("New Tax Service...!");
		int tax=0;
		if(model.getIncome()>=500000) {
			tax=model.getIncome()*30/100;
		}else {
			tax=model.getIncome()*20/100;
		}
		model.setTax(tax);
	}
}
