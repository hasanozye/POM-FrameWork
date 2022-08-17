package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (xpath = "//*[@data-testid=\"open-registration-form-button\"]")
    public WebElement signUp;

    @FindBy (xpath = "(//input[@type=\"text\"])[2]")
    public WebElement firstName;

    @FindBy (xpath = "//select[@name=\"birthday_day\"]")
    public WebElement bday;

    @FindBy (xpath = "//select[@name=\"birthday_month\"]")
    public WebElement month;

    @FindBy (xpath = "//Select[@name=\"birthday_year\"]")
    public WebElement year;

    @FindBy (xpath = "//input[@name=\"sex\"]")
    public WebElement gender;

    @FindBy (xpath = "(//button[@type=\"submit\"])[2]")
    public WebElement signupFast;





}
