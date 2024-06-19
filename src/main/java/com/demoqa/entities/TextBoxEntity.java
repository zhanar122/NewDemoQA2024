package com.demoqa.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder

public class TextBoxEntity {

    private String firstName;
    private String lastName;
    private String email;
    private String userNumber;
    private String text;
    private String currentAddress;
    private String pic;
    private String state;
    private String city;
    private String permanentAddress;
    private String fullName;

}