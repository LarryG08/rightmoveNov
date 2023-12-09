package co.uk.rightmove.pages;

import co.uk.rightmove.common.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static co.uk.rightmove.common.DriverManager.driver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        DriverManager.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(name = "typeAheadInputField")
    private WebElement searchField;

    @FindBy(xpath = "//button[text()='For Sale']")
    private WebElement forSaleButton;

    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElement acceptCookies;

    @FindBy(id = "signInWidget_callToAction__3w5j1")
    private WebElement signInOrCreateAccountButton;

    public void enterLocation(String location) {
        searchField.sendKeys(location);
    }
    public SearchCriteriaPage clickForSaleButton(){
        forSaleButton.click();
        return new SearchCriteriaPage(driver);
    }

    public void clickAcceptCookies(){

        acceptCookies.click();
    }

    public  void clickSignInOrCreateAccountButton(){
        signInOrCreateAccountButton.click();
    }

}


