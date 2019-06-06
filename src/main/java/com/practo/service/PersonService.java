package com.practo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practo.model.Person;
import com.practo.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	
	public PersonService() {}
	
	public Person addPerson() {
		Person p = new Person();
		p.setId(1l);
		p.setAge(21);
		p.setFirstName("Steve");
		p.setLastName("Smith");
		personRepository.save(p);

		return p;
	}
	public Optional<Person> getPerson(Long id) {
	    return personRepository.findById(id);
	}
	public List<Person> getAll() {
		return (List<Person>) personRepository.findAll();
	}
}
