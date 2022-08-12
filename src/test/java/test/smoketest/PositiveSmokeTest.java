package test.smoketest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HotelMyCamp;
import utilities.ConfigurationReader;
import utilities.Driver;

public class PositiveSmokeTest {
    HotelMyCamp hotelMyCamp = new HotelMyCamp();


    @Test
public void positiveLoginTest() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("HMCurl"));
        hotelMyCamp.login.click();

        hotelMyCamp.userName.sendKeys(ConfigurationReader.getProperty("HMCValidUserName"));
        hotelMyCamp.password.sendKeys(ConfigurationReader.getProperty("HMCValidPassword"));

        hotelMyCamp.btnSubmit.click();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(hotelMyCamp.listOfUser.isDisplayed(),"login unsuccesfull");

        softAssert.assertAll();






    }


}
