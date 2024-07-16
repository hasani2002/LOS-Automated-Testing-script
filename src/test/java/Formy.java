import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Formy extends TestBase {

    @Test

    public void form1() throws InterruptedException {

        //create selenium webelement
        WebDriver driver = getDriver();

        //navigate to the url
        driver.get("https://formy-project.herokuapp.com/keypress");

        WebElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("Hasani Welagedara");

        WebElement button = driver.findElement(By.id("button"));
        button.click();

        Thread.sleep(10000);

        driver.quit();
    }

    @Test

    public void form2() throws InterruptedException {

        //create selenium webelement
        WebDriver driver = getDriver();

        //navigate to the url
        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name = driver.findElement(By.id("name"));
        Actions actions = new Actions (driver);
        actions.moveToElement(name);
        name.sendKeys("Hasani Welagedara");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("03/01/2003");

        Thread.sleep(10000);

        driver.quit();
    }

    @Test

    public void form3() throws InterruptedException {

        //create selenium webelement
        WebDriver driver = getDriver();

        //navigate to the url
        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newWindow = driver.findElement(By.id("new-tab-button"));
        newWindow.click();

        String originalHandle = driver.getWindowHandle();

        for (String handle1: driver.getWindowHandles()) {
            driver.switchTo().window(handle1);
        }

        Thread.sleep(2000);

        driver.switchTo().window(originalHandle);

        Thread.sleep(10000);

        driver.quit();
    }

    @Test

    public void form4() throws InterruptedException {

        //create selenium webelement
        WebDriver driver = getDriver();

        //navigate to the url
        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement alert = driver.findElement(By.id("alert-button"));
        alert.click();

        Alert altert = driver.switchTo().alert();

        Thread.sleep(2000);

        altert.accept();

        Thread.sleep(10000);

        driver.quit();
    }

    @Test

    public void form5() throws InterruptedException {

        //create selenium webelement
        WebDriver driver = getDriver();

        //navigate to the url
        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement modal = driver.findElement(By.id("modal-button"));
        modal.click();

        WebElement close = driver.findElement(By.id("close-button"));

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", close);

        Thread.sleep(10000);

        driver.quit();
    }

    @Test

    public void form6() throws InterruptedException {

        //create selenium webelement
        WebDriver driver = getDriver();

        //navigate to the url
        driver.get("https://formy-project.herokuapp.com/dragdrop");

        WebElement image = driver.findElement(By.id("image"));

        Thread.sleep(1000);

        WebElement box = driver.findElement(By.id("box"));

        Thread.sleep(1000);

        Actions actions = new Actions (driver);

        actions.dragAndDrop(image,box).build().perform();

        Thread.sleep(10000);

        driver.quit();
    }


}


