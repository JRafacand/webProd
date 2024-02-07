package steps;

import io.cucumber.java.en.*;
import io.cucumber.java.en.And;
import pages.PrincipalPage;


public class StepsGala {
    PrincipalPage landingpage = new PrincipalPage();

    @Given ("Navitage to the login page")
    public void navegarGala() {
        landingpage.navegarGala();
    }

    @When ("I go to a section using the navigation bar")
    public void navigationBar() {
        landingpage.navigationBar();
    }
    //When <section> navigate link
    @And ("I go to a {string} in navigate link")
    public void navigationBarLeft(String section) {
        landingpage.navigationBarLeft(section);
    }
    
}
