package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCamp {

    public HotelMyCamp() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()=\"Log in\"]")
    public WebElement login;

    @FindBy(xpath = "//input[@id=\"UserName\"]")
    public WebElement userName;

    @FindBy(xpath = "//input[@id=\"Password\"]")
    public WebElement password;

    @FindBy(id = "btnSubmit")
    public WebElement btnSubmit;

    @FindBy(xpath = "//span[text()=\"Try again please\"]")
    public WebElement tryAgain;

    @FindBy(xpath = "//li[text()=\"Username or password is incorrect, please correct them and try again\"]\n")
    public WebElement resultMsg;

    @FindBy (xpath = "//span[text()=\"ListOfUsers\"]")
    public WebElement listOfUser;


}
