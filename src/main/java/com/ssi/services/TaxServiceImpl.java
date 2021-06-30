package com.ssi.services;

import com.ssi.models.TaxModel;

//@Service
public class TaxServiceImpl implements TaxService {
	public void computeTax(TaxModel model) {
		System.out.println("Old Tax Service...!");
		int tax=0;
		if(model.getIncome()>=500000) {
			tax=model.getIncome()*20/100;
		}else {
			tax=model.getIncome()*10/100;
		}
		model.setTax(tax);
	}
}
