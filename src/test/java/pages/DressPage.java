package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressPage {


    public DressPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "layered_category_9")
    private WebElement casualDressCheckbox;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]")
    private WebElement addDressToCart;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span/text()")
    private WebElement proceedToCheckout;

    public void filterDresses(){
        casualDressCheckbox.click();
    }

    public void addToCart(){
        addDressToCart.click();
    }

    public void checkoutDress(){
        proceedToCheckout.click();
    }

}
