package com.tejaClasses.DMS.repository;

import java.util.List;


import org.springframework.data.repository.CrudRepository;

import com.tejaClasses.DMS.Models.Dog;


/**
 * @author S564149
 */
public interface DogRepository extends CrudRepository<Dog,Integer> {
	List<Dog> findByName(String name);
}
