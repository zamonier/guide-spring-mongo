package ru.mercuriev.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.mercuriev.model.Customer;

import java.util.List;

public interface CustomerRepository extends MongoRepository<Customer, String> {

	Customer findByFirstName(String firstName);

	List<Customer> findByLastName(String lastName);
}