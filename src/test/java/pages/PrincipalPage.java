package pages;

public class PrincipalPage extends BasedPage {

    // private String sectionLink = "//a[normalize-space()='Fleet Management' and @href]";
    private String sectionLink = "//a[normalize-space()='%s' and @href]";

    public PrincipalPage() {
        super(driver);

    }

    // Método para navegar a la página de galavail
    public void navegarGala() {
        navigateTo("https://develop.galavail.com/galavail-web/login.xhtml");
        writeText("//input[@id='name']", "averdezoto@galavail.com");
        clickElement("//span[@class='ui-button-text ui-c']");
        dropDownIndex("//select[@id='j_idt17']", "46");
        writeText("//input[@id='password']", "6093Anita");
        clickElement("//span[@class='ui-button-text ui-c']");
        clickElement("//span[@class='fa fa-bars']");
        sleepForSeconds(5);
    }

    public void navigationBar() {
        // reemplazar marcador %s por nombre de la sección
        clickElement("//span[@class='fa fa-bars']");
        sleepForSeconds(5);
    }

    public void navigationBarLeft(String section) {
        // reemplazar marcador %s por nombre de la sección
        System.out.println(section + " section");
        if (section != ("Log-out")) {
            clickElement("//span[@class='fa fa-bars']");
            String xpathSection = String.format(sectionLink, section);
            clickElement(xpathSection);
            sleepForSeconds(2);
            clickElement("//span[@class='fa fa-bars']");
            sleepForSeconds(2);
        } else {
            logOut();
        }
        
        
    }

    public void logOut() {
        clickElement("//span[@class='fa fa-bars']");
        sleepForSeconds(2);
        clickElement("//span[@class='fa fa-sign-out']");
        sleepForSeconds(2);
    }

}
