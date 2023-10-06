package com.example.logformspringsecuritymail.common.utils;

import com.example.logformspringsecuritymail.model.dto.PersonDto;
import com.example.logformspringsecuritymail.model.entity.PersonEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonMapper {

    @Autowired
    private ModelMapper modelMapper;

    private PersonDto PersonEntityToDto (PersonEntity entity) {

        PersonDto dto = modelMapper.map(entity, PersonDto.class);
        return dto;

    }

    private PersonEntity PersonDtoToEntity (PersonDto dto) {

        PersonEntity entity = modelMapper.map(dto, PersonEntity.class);
        return entity;

    }
}
