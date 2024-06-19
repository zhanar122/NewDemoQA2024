package com.demoqa.entities;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder

public class SelectMenuEntity {

    private String group1Input;
    private String option1Input;
    private String option2Input;
    private String group2Input;
    private String option11Input;
    private String option22Input;
    private String rootInput;
    private String anotherRootInput;
    private String selectTitleInput;
    private String DrInput;
    private String MrInput;
    private String MrsInput;
    private String MsInput;
    private String ProfInput;
    private String OtherInput;
    private String selectMenu;
    private String color;


    public SelectMenuEntity() {

    }
}
