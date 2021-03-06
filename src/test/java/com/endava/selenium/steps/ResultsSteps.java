package com.endava.selenium.steps;

import com.endava.selenium.pages.ResultsPage;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

public class ResultsSteps {

    @Autowired
    private ResultsPage resultsPage;

    @Then("^the links are displayed on the results page$")
    public void theLinksAreDisplayedOnTheResultsPage() {
        resultsPage.assertLinksArea();
    }
}
