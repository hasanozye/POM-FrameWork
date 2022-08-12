package test.smoketest;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCamp;
import utilities.ConfigurationReader;
import utilities.Driver;

public class NegativeLoginTest {

    HotelMyCamp hotelMyCamp = new HotelMyCamp();


    //todo
    //  //1) smokeTest  paketi altinda yeni bir Class olustur: NegativeTest
    //        //3 Farkli test Methodunda 3 senaryoyu test et
    //        //                - yanlisSifre
    //        //                - yanlisKulllanici
    //        //                - yanlisSifreKullanici
    //        //test data yanlis username: manager1 , yanlis password : manager1
    //        //2) https://www.hotelmycamp.com/ adresine git

    @Test
    public void yanlisSifre() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("HMCurl"));
        hotelMyCamp.login.click();

        hotelMyCamp.userName.sendKeys(ConfigurationReader.getProperty("HMCValidUserName"));
        hotelMyCamp.password.sendKeys(ConfigurationReader.getProperty("HMCWrongPassword"));
        hotelMyCamp.btnSubmit.click();
        Assert.assertTrue(hotelMyCamp.tryAgain.isDisplayed());
    }

    @Test
    public void wrongUser() {
        Driver.getDriver().get(ConfigurationReader.getProperty("HMCurl"));
        hotelMyCamp.login.click();
        hotelMyCamp.userName.sendKeys(ConfigurationReader.getProperty("HMCWrongUserName"));
        hotelMyCamp.password.sendKeys(ConfigurationReader.getProperty("HMCValidPassword"));
        hotelMyCamp.btnSubmit.click();
        Assert.assertTrue(hotelMyCamp.resultMsg.isDisplayed());
    }

    @Test
    public void wrongUserWrongPass() {
        Driver.getDriver().get(ConfigurationReader.getProperty("HMCurl"));
        hotelMyCamp.login.click();
        hotelMyCamp.userName.sendKeys(ConfigurationReader.getProperty("HMCWrongUserName"));
        hotelMyCamp.password.sendKeys(ConfigurationReader.getProperty("HMCWrongPassword"));
        hotelMyCamp.btnSubmit.click();
        Assert.assertTrue(hotelMyCamp.resultMsg.isDisplayed());

    }


}

