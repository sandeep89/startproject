package com.practo.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practo.model.Person;
import com.practo.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	
	public PersonService() {
		Person p = new Person();
		p.setAge(21);
		p.setFirstName("Steve");
		p.setLastName("Smith");
		personRepository.save(p);

		p = new Person();
		p.setAge(25);
		p.setFirstName("Tom");
		p.setLastName("Brown");
		personRepository.save(p);
	}
	public Optional<Person> getPerson(Long id) {
	    return personRepository.findById(id);
	}
	public ArrayList<Person> getAll() {
		return (ArrayList<Person>) personRepository.findAll();
	}
}
