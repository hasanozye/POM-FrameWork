package test.day26;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C06_FacebookTestiReport extends TestBaseRapor {
    FacebookPage facebookPage = new FacebookPage();

    @Test(groups = "miniRegression")
    public void facebookTest() throws InterruptedException {
        extentTest = extentReports.createTest("facebook", "Fake isimle girişin test edilmesi");


        Driver.getDriver().get(ConfigurationReader.getProperty("fb"));
        extentTest.info("facebook sayfasına gidildi");

        Thread.sleep(2000);

        facebookPage.signUp.click();
        extentTest.info("facebook giriş bilgileri faker ile dolduruldu");


        Faker faker = new Faker();
        Actions actions = new Actions(Driver.getDriver());
        String email = faker.internet().emailAddress();
        String psw = faker.internet().password();


        actions.sendKeys(facebookPage.firstName, faker.name().firstName(), Keys.TAB).
                sendKeys(faker.name().lastName(), Keys.TAB).
                sendKeys(email, Keys.TAB).
                sendKeys(email, Keys.TAB).
                sendKeys(psw, Keys.TAB).perform();


        actions.sendKeys(Keys.TAB).perform();


        Select select = new Select(facebookPage.bday);
        Select select1 = new Select(facebookPage.month);
        Select select2 = new Select(facebookPage.year);

        select.selectByVisibleText("15");
        select1.selectByVisibleText("May");
        select2.selectByVisibleText("1994");

        actions.sendKeys(Keys.TAB, Keys.TAB).perform();

        facebookPage.gender.click();
        facebookPage.signupFast.click();
    }

}
