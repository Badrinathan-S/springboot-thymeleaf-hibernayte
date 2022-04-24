package com.springboot.app;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface HotelRepository extends CrudRepository<Hotels, Integer> {
}
