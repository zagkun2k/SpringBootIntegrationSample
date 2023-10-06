package com.example.logformspringsecuritymail.common;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperObject {

    @Bean
    public ModelMapper modelMapper() {

        return new ModelMapper();

    }
}
