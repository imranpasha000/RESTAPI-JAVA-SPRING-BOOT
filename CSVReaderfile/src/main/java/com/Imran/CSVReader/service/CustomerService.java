package com.Imran.CSVReader.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Imran.CSVReader.model.Customer;
import com.Imran.CSVReader.repository.CustomerDTO;

@Service
public class CustomerService {

	@Autowired
	private CustomerDTO cdto;
	
	String line = " ";
	
	public void saveCustomerData() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/main/resources/CSVPostgre.csv"));
			while((line = br.readLine())!= null) {
				String [] data = line.split(",");
				Customer c = new Customer();
				c.setName(data[0]);
				c.setIssue(data[1]);
				c.setIssueID(data[2]);
			    c.setAge(data[3]);
			    cdto.save(c);
			    
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		
	}
}
