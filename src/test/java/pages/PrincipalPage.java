package pages;


public class PrincipalPage  extends BasedPage{

    public PrincipalPage() {
        super(driver);
        
    }
    //Método para navegar a la página de galavail
    public void navegarGala() {
        navigateTo("https://develop.galavail.com/galavail-web/login.xhtml");
        clickElement("//span[@class='ui-button-text ui-c']");
    }
    
    
    
}
