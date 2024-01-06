package com.Imran.CSVReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Imran.CSVReader.service.CustomerService;

@RestController
public class Controller {
	
	@Autowired
	private CustomerService cs;
	
	@RequestMapping(path="feedCustomerData")
	public void setDataInDB() {
		cs.saveCustomerData();
		
	}
 
}
