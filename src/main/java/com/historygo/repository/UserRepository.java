package com.historygo.repository;

import com.historygo.model.Users;
import org.springframework.data.repository.CrudRepository;



public interface UserRepository extends CrudRepository<Users, Integer> {

}
