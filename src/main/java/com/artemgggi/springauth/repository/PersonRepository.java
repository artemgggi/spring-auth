package com.artemgggi.springauth.repository;

import com.artemgggi.springauth.domain.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
}
