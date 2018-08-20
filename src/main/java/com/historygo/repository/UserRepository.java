package com.historygo.repository;

import com.historygo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface UserRepository extends JpaRepository<Users, Integer> {

    Users findById(@Param("id") int id);

    @Query("SELECT u FROM Users u WHERE LOWER(u.name) = LOWER(:name)")
    Users findByName(@Param("name")  String name);
}
