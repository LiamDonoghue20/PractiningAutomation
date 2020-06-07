package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

    public CheckoutPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"product_3_13_0_0\"]/td[2]/p/a")
    private WebElement itemTitle;

    @FindBy(id = "summary_products_quantity")
    private WebElement itemAmount;


    public void getItemName(){
        itemTitle.getText();
    }

    public void getItemAmount(){
        itemAmount.getText();
    }
}
