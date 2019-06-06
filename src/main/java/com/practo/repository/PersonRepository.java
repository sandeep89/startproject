package com.practo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.practo.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {}
