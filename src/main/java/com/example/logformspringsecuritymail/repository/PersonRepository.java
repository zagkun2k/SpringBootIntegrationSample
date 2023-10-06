package com.example.logformspringsecuritymail.repository;

import com.example.logformspringsecuritymail.model.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
}
