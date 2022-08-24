package test.crossBrowserTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utilities.CrossDriver.driver;

public class C02_BasicAuthetications {
    @Test
    public void authenticationTesti() {
        //2- https://the-internet.herokuapp.com/basic_auth sayfasina gidin
        // driver.get("https://the-internet.herokuapp.com/basic_auth%22);
        //3- asagidaki yontem ve test datalarini kullanarak authentication’i yapin
        //
        //  Html komutu : https://url/
        //  Username     : admin
        //  password      : admin
        //  basic authentication isteyen web servisleri bize nasil ve hangi bilgilerle authentication
        // yapabilecegimiz bilgisini de vermek zorundadir.
        // bi de bize tarif edilen yontem ve bize verilen bilgileri birebir uygulayarak
        // istedigimiz webservise giris saglayabiliriz

        driver.get("https://the-internet.herokuapp.com/basic_auth");
        //4- Basarili sekilde sayfaya girildigini dogrulayin
        WebElement congratMesajElementi = driver.findElement(By.tagName("p"));
        Assert.assertTrue(congratMesajElementi.isDisplayed());
    }
}
