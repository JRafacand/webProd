package pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FleetPage extends BasedPage{

    private String optionMenu = "//body/div[@id='j_idt125:0:j_idt140']/ul[1]";

    public FleetPage() {
        super(driver);

    }
        
    public List<String> returnPlanDropdownValues() {
        return getDropdownValues(optionMenu);
    }
    
}
