package com.erp.step_definitions;

import com.erp.pages.CalendarPage;
import io.cucumber.java.en.*;
import org.joda.time.DateTime;
import org.joda.time.LocalTime;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

        List<String> expectedHoursList = new ArrayList<>(Arrays.asList("0:00","1:00","2:00","3:00","4:00","5:00","6:00","7:00","8:00","9:00","10:00","11:00","12:00","13:00","14:00","15:00","16:00","17:00","18:00","19:00","20:00","21:00","22:00","23:00"));

        List<String> actualHoursList = new ArrayList<>();

        for (WebElement each : calendarPage.timeLine0_23List) {
            actualHoursList.add(each.getText());
        }

        Assert.assertEquals(actualHoursList, expectedHoursList);

    }
}
