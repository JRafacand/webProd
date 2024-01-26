package steps;

import io.cucumber.java.en.Given;
import pages.PrincipalPage;

public class StepsGala {
    PrincipalPage landingpage= new PrincipalPage();

    @Given ("Navitage to the login page")
    public void navegarGala() {
        landingpage.navegarGala();
    }
}
