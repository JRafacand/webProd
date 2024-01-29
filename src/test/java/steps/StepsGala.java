package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.PrincipalPage;

public class StepsGala {
    PrincipalPage landingpage = new PrincipalPage();

    @Given ("Navitage to the login page")
    public void navegarGala() {
        landingpage.navegarGala();
    }

    @When("I go to a section usign the navigation bar")
    public void navigationBar() {
        landingpage.navigationBar();
    }
    
}
