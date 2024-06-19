package com.demoqa.utils;


import com.demoqa.entities.*;
import com.demoqa.pages.WebTablesPage;
import com.github.javafaker.Faker;

public class RandomUtils {

    Faker faker = new Faker();

    public TextBoxEntity generateRandomTextBoxEntity(){
        TextBoxEntity textBoxEntity = new TextBoxEntity();

        textBoxEntity.setFullName(faker.name().fullName());
        textBoxEntity.setEmail(faker.internet().emailAddress());
        textBoxEntity.setCurrentAddress(faker.address().fullAddress());
        textBoxEntity.setPermanentAddress(faker.address().secondaryAddress());
        return textBoxEntity;
    }

    public PracticeFormEntity generateRandomPracticeFormEntity() {
        PracticeFormEntity practiceFormEntity = new PracticeFormEntity();

        practiceFormEntity.setFirstName(faker.name().firstName());
        practiceFormEntity.setLastName(faker.name().lastName());
        practiceFormEntity.setEmail(faker.internet().emailAddress());
        practiceFormEntity.setMobileNumber(faker.phoneNumber().subscriberNumber(10));
        practiceFormEntity.setSubjects("Maths");
        practiceFormEntity.setSubjects2("Chemistry");
        practiceFormEntity.setUploadPicture("D:\\Downloads\\tigr.png");
        practiceFormEntity.setCurrentAddress(faker.address().fullAddress());
        return practiceFormEntity;

    }

    public SelectMenuEntity generateRandomSelectMenuEntity() {
        SelectMenuEntity selectMenuEntity = new SelectMenuEntity();

        selectMenuEntity.setGroup1Input("Group 1");
        selectMenuEntity.setOption1Input("Group 1, option 1");
        selectMenuEntity.setOption2Input("Group 1, option 2");
        selectMenuEntity.setGroup2Input("Group 2");
        selectMenuEntity.setOption11Input("Group 2, option 1");
        selectMenuEntity.setOption22Input("Group 2, option 2");
        selectMenuEntity.setRootInput("A root option");
        selectMenuEntity.setAnotherRootInput("Another root option");
        selectMenuEntity.setSelectTitleInput("Select Title");
        selectMenuEntity.setDrInput("Dr.");
        selectMenuEntity.setMrInput("");
        selectMenuEntity.setMrsInput("Mr.");
        selectMenuEntity.setMsInput("Mrs.");
        selectMenuEntity.setProfInput("Ms.");
        selectMenuEntity.setOtherInput("Prof.");
        selectMenuEntity.setSelectMenu("Other");
        return selectMenuEntity;
    }

    public Employee createMockEmployee(){
        Employee employee = new Employee();

        employee.setFirstname(faker.name().firstName());
        employee.setLastname(faker.name().lastName());
        employee.setAge(faker.number().numberBetween(18,100));
        employee.setEmail(faker.internet().emailAddress());
        employee.setSalary(faker.number().numberBetween(100000L,20000000L));
        employee.setDepartment(faker.job().position());
        return employee;
    }


    public OrangeLoginEntity createOrangeLogin(){
        OrangeLoginEntity orange = new OrangeLoginEntity();
        orange.setUserName("Admin");
        orange.setPassword("admin123");
        return orange;
    }



}

