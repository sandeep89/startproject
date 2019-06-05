package com.practo.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practo.model.Person;
import com.practo.service.PersonService;

@RestController
@RequestMapping("/persons")
public class PersonController {

	@Autowired
	PersonService ps;
	
	@RequestMapping("/all")
	public ArrayList<Person> getAll(){
		return ps.getAll();
	}
	
	@RequestMapping("{id}")
	public Optional<Person> getPerson(@PathVariable("id") Long id) {
		return ps.getPerson(id);
	}
}
