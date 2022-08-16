package test.day26;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.W3SchoolPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class W3SchoolTest {
    W3SchoolPage w3SchoolPage = new W3SchoolPage();

    @Test(groups = {"miniRegression","smoke"})
    public void schoolTest() {
        Driver.getDriver().get((ConfigurationReader.getProperty("W3")));

        Assert.assertTrue(w3SchoolPage.html.isDisplayed());

        w3SchoolPage.next.click();

        Assert.assertTrue(w3SchoolPage.borders.isDisplayed());
        System.out.println("w3SchoolPage.borders.getText() = " + w3SchoolPage.borders.getText());
    }
}
