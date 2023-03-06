package com.erp.step_definitions;

import com.erp.pages.CalendarPage;
import io.cucumber.java.en.*;
import org.joda.time.DateTime;
import org.joda.time.LocalTime;
import org.junit.Assert;

import java.sql.Time;
import java.util.Timer;

public class US14_StepDefs {

    CalendarPage calendarPage = new CalendarPage();


    @When("the user is on the Calendar page")
    public void theUserIsOnTheCalendarPage() {
        calendarPage.calendarPageItself.click();
    }

    @Then("verify the time starts with 0:00")
    public void verify_the_time_starts_with() {

        String actualStart = ""+calendarPage.timeLine0_23List.get(0).getText();

        Assert.assertEquals(actualStart,"0:00");

    }
    @When("time increase by one hour")
    public void time_increase_by_one_hour() {


    }
    @Then("verify the time ends with 23:00")
    public void verify_the_time_ends_with() {
        String actualEnds = ""+calendarPage.timeLine0_23List.get(calendarPage.timeLine0_23List.size()-1).getText();

        Assert.assertEquals(actualEnds,"23:00");

    }


    @Then("verify time increase by one hour")
    public void verifyTimeIncreaseByOneHour() {

        //String actualEnds = ""+calendarPage.timeLine0_23List.get(calendarPage.timeLine0_23List.size()-1).getText();

        //System.out.println(actualEnds);




    }
}
