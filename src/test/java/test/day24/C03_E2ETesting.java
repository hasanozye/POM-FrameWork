package test.day24;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCamp;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.Reusable_Methods;

import java.util.Properties;

public class C03_E2ETesting {

    HotelMyCamp hotelMyCamp = new HotelMyCamp();

    //todo
    //Tests packagenin altına class olusturun: CreateHotel
    //Bir metod olusturun: createHotel
    //https://www.hotelmycamp.com/ adresine git.
    //Username textbox ve password metin kutularını locate edin ve asagidaki verileri
    //Username : manager
    //Password : Manager1!
    //Login butonuna tıklayın.
    //Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
    //Açılan sayfadaki tum metin kutularına istediğiniz verileri girin.
    //Save butonuna tıklayın.
    //Hotel was inserted successfully” textinin görunduğunu test edin.
    //OK butonuna tıklayın.
    @Test
    public void createHotel() throws InterruptedException {
        Faker faker = new Faker();
        Driver.getDriver().get(ConfigurationReader.getProperty("HMCurl"));
        hotelMyCamp.login.click();
        hotelMyCamp.userName.sendKeys(ConfigurationReader.getProperty("HMCValidUserName"));
        hotelMyCamp.password.sendKeys(ConfigurationReader.getProperty("HMCValidPassword"));
        hotelMyCamp.btnSubmit.click();
        hotelMyCamp.hotelManagement.click();

        Thread.sleep(4000);

        hotelMyCamp.hotelCalendar.click();
        hotelMyCamp.addHotel.click();

        Actions actions = new Actions(Driver.getDriver());
        Select select = new Select(hotelMyCamp.dropDown);

        actions.sendKeys(hotelMyCamp.code, "08ARTVİNULAN", Keys.TAB).
                sendKeys(faker.name().firstName(), Keys.TAB).
                sendKeys(faker.address().fullAddress(), Keys.TAB).
                sendKeys(faker.phoneNumber().cellPhone(), Keys.TAB).
                sendKeys(faker.internet().emailAddress(), Keys.TAB).perform();

        select.selectByVisibleText("Hotel Type1");
        hotelMyCamp.lastSubmitButton.click();

        //actions.click(hotelMyCamp.alert).perform();


    }


}
