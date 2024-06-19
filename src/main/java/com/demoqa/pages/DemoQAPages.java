package com.demoqa.pages;

import lombok.*;
import org.testng.annotations.BeforeClass;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Builder

public class DemoQAPages {

    protected PracticeFormPage practiceFormPage;
    protected AlertPage alertPage;
    protected ButtonsPage buttonsPage;
    protected MenuPage menuPage = new MenuPage();
    protected ProgressBarPage progressBarPage;
    protected SelectMenuPage selectMenuPage;
    protected WebTablesPage webTablesPage;
    protected CalendarPage calendarPage;
    protected OrangeLoginPage orangeLoginPage;
    protected OrangeAdminPage orangeAdminPage;





    @BeforeClass(alwaysRun = true)
    public void setUp() {

        alertPage = new AlertPage();
        buttonsPage = new ButtonsPage();
        menuPage = new MenuPage();
        progressBarPage = new ProgressBarPage();
        practiceFormPage = new PracticeFormPage();
        selectMenuPage = new SelectMenuPage();
        webTablesPage = new WebTablesPage();
        calendarPage = new CalendarPage();
        orangeLoginPage = new OrangeLoginPage();
        orangeAdminPage  = new OrangeAdminPage();


    }

}
