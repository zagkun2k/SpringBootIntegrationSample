package com.example.logformspringsecuritymail.serviceimpl;

import com.example.logformspringsecuritymail.repository.PersonRepository;
import com.example.logformspringsecuritymail.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;
}
