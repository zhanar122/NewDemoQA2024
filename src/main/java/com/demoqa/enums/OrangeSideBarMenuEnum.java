package com.demoqa.enums;

import lombok.Getter;


@Getter
public enum OrangeSideBarMenuEnum {

    ADMIN("Admin"),
    PIM("PIM"),
    LEAVE("Leave"),
    TIME("Time"),
    RECRUITMENT("Recruitment"),
    MYINFO("My Info"),
    PERFORMANCE("Performance"),
    DASHBOARD("Dashboard"),
    DIRECTORY("Directory"),
    MAINTENANCE("Maintenance"),
    CLAIM("Claim"),
    BUZZ("Buzz");


    private final String menu;

    OrangeSideBarMenuEnum(String menu){
        this.menu=menu;
    }

}
