package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;

public class HotelMyCamp {

    /*public void login(){
        Driver.getDriver().get(ConfigurationReader.getProperty("HMCurl"));
        hotelMyCamp.login.click();
        hotelMyCamp.userName.sendKeys(ConfigurationReader.getProperty("HMCValidUserName"));
        hotelMyCamp.password.sendKeys(ConfigurationReader.getProperty("HMCValidPassword"));
        hotelMyCamp.btnSubmit.click();
    }

     */

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

    @FindBy (xpath = "//*[text()=\"Hotel Management\"]")
    public WebElement hotelManagement;

    @FindBy (xpath = "(//i[@class=\"icon-calendar\"])[2]")
    public WebElement hotelCalendar;

    @FindBy (xpath = "//*[text()=\"Add Hotel \"]")
    public WebElement addHotel;

    @FindBy (xpath = "//input[@name=\"Code\"]")
    public WebElement code;

    @FindBy (xpath = "//select[@id=\"IDGroup\"]")
    public WebElement dropDown;

    @FindBy (xpath = "//button[@type=\"submit\"]")
    public WebElement lastSubmitButton;

    @FindBy (xpath = "//*[text()=\"OK\"]")
    public WebElement alert;

    @FindBy (xpath = "//div[@class=\"bootbox-body\"]")
    public WebElement alertText;


}
