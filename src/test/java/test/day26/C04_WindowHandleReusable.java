package test.day26;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.Set;

public class C04_WindowHandleReusable {
    //todo
    @Test
    public void wtf() {
        Driver.getDriver().get(" https://the-internet.herokuapp.com/windows");
        String ilkHandle = Driver.getDriver().getWindowHandle();
        Driver.getDriver().findElement(By.xpath("//a[text()=\"Click Here\"]")).click();
        Set<String> handles = Driver.getDriver().getWindowHandles();
        String ikinciHandle = "";
        for (String each : handles) {
            if (!each.equals(ilkHandle)) {
                ikinciHandle = each;
            }
        }
        Driver.getDriver().switchTo().window(ikinciHandle);

        String expTitle = "New Window";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertTrue(actualTitle.equals(expTitle), "actual is not matched with expected title.");

    }

    @Test
    public void windowHandle() throws InterruptedException, IOException {
        Driver.getDriver().get(" https://the-internet.herokuapp.com/windows");
        Driver.getDriver().findElement(By.xpath("//a[text()=\"Click Here\"]")).click();

        String expected = "The Internet";
        ReusableMethods.switchToWindow(Driver.getDriver().getTitle());
        Assert.assertEquals(Driver.getDriver().getTitle(), expected, "er isnt equal with ar");

        ReusableMethods.getScreenshot("WindowHandle");
        Driver.closeDriver();


    }

    @Test
    public void demoqa() throws IOException {
        Driver.getDriver().get("https://demoqa.com/browser-windows");
        Driver.getDriver().findElement(By.id("tabButton")).click();

        String expected = "ToolsQA";
        ReusableMethods.switchToWindow(Driver.getDriver().getTitle());
        Assert.assertEquals(Driver.getDriver().getTitle(),expected);

        ReusableMethods.getScreenshot("demoqa");

    }


}
