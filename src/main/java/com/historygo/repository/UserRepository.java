package com.historygo.repository;

import com.historygo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import java.util.List;
import java.util.Set;


public interface UserRepository extends JpaRepository<Users, Integer> {

    Users findById(@Param("id") int id);

    Users findByName(@Param("name")  String name);

    List<Users> findByPointsGreaterThanEqual(@Param("points") int points);

    List<Users> findByCountry(String country);

    List<Users> findByEmail(String email);

}
