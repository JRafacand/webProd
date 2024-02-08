package steps;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;

import com.beust.ah.A;

import io.cucumber.java.en.*;
import pages.FleetPage;
import pages.PrincipalPage;


public class StepsGala {
    PrincipalPage landingpage = new PrincipalPage();
    FleetPage fleetpage = new FleetPage();

    @Given ("Navitage to the login page")
    public void navegarGala() {
        landingpage.navegarGala();
    }

    @When ("I go to a section using the navigation bar")
    public void navigationBar() {
        landingpage.navigationBar();
    }
    @Then ("I go to navigate section Fleet Management")
    public void navigationBarLeft() {
        landingpage.navigationBarLeft("Fleet Management");
    }

    @When ("I click in Action menu")
    public void actionMenu() {
        landingpage.actionMenu();
    }

    @Then ("I should see the following options")
    public void actionMenuOptions() {
        List<String> options = fleetpage.returnPlanDropdownValues();
        List<String> expectedOptions = Arrays.asList("SEO", "Availability", "My Activity", "Additional Services", "General Info", "Detailed Info","Boat Cover", "Remove", "Itinerary");
        Assert.assertEquals(expectedOptions, options);    
    }


    //When <section> navigate link
    /* @And ("I go to a {string} in navigate link")
    public void navigationBarLeft(String section) {
        landingpage.navigationBarLeft(section);
    } */
    
}
