package com.example.logformspringsecuritymail.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
public class PersonEntity implements Serializable {

    @Id
    @SequenceGenerator(
            name = "person_sequence",
            sequenceName = "person_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "person_sequence"
    )
    private Long Id;
    private String name;
    private String address;
    private int age;
    private String phone;

    public PersonEntity(String name, String address, int age, String phone) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phone = phone;
    }
}
