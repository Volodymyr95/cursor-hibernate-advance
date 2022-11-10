package com.example.demo.repository;

import com.example.demo.entity.Passport;
import org.springframework.data.repository.CrudRepository;

public interface PasportRepository extends CrudRepository<Passport, Long> {
}
