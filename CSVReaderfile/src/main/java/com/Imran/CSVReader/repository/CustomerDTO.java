package com.Imran.CSVReader.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Imran.CSVReader.model.Customer;

@Repository
public interface CustomerDTO extends CrudRepository<Customer, Integer>{
	

}
