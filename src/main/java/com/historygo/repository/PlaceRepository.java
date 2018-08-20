package com.historygo.repository;

import com.historygo.model.Places;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PlaceRepository extends JpaRepository<Places, Integer> {

}
