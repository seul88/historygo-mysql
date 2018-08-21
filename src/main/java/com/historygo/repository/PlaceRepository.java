package com.historygo.repository;

import com.historygo.model.Places;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;


public interface PlaceRepository extends JpaRepository<Places, Integer> {

    Places findByName(@Param("name")  String name);

}
