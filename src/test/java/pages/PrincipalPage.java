package pages;


public class PrincipalPage  extends BasedPage{

    private String sectionLink = "//span[@class='ui-button-text ui-c']";
    public PrincipalPage() {
        super(driver);
        
    }
    //Método para navegar a la página de galavail
    public void navegarGala() {
        navigateTo("https://galavail.com/galavail-web/login.xhtml");
        writeText("//input[@id='name']", "averdezoto@galavail.com");
        clickElement("//span[@class='ui-button-text ui-c']");

    }


    public void navigationBar() {
        clickElement("//span[@class='fa fa-bars']");
    }
    
    
    
}
