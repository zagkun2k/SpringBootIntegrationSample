package com.example.logformspringsecuritymail.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PersonDto {

    private static final Long serialVersionUID = 1L;
    private String name;
    private String address;
    private int age;
    private String phone;

    public PersonDto(String name, String address, int age, String phone) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phone = phone;
    }
}
