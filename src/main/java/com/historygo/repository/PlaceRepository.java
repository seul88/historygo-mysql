package com.historygo.repository;

import com.historygo.model.Places;
import org.springframework.data.repository.CrudRepository;

public interface PlaceRepository extends CrudRepository<Places, Integer> {

}
