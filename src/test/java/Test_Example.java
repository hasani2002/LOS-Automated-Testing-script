import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Example extends TestBase{

    @Test

    public void test_Calculator1() throws InterruptedException {

        //create selenium webelement
        WebDriver driver = getDriver();

        //navigate to teh url
        driver.get("https://www.calculator.net/calorie-calculator.html");

        //clear data
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[5]/form/table[4]/tbody/tr[3]/td[2]/input[4]")).click();

        //enter age
        driver.findElement(By.id("cage")).sendKeys("40");

        //enter height
        driver.findElement(By.id("cheightmeter")).sendKeys("162");

        //enter weight
        driver.findElement(By.id("ckg")).sendKeys("60");

        //click on the calculate button
        driver.findElement(By.name("x")).click();

        //Assert Results
        String ExpectedTitle = "Result";
        WebElement titleElement = driver.findElement(By.xpath("//*[@id=\"content\"]/h2[1]"));
        String ActualTitle = titleElement.getText();

        //print expected and actual results
        System.out.println(ExpectedTitle);
        System.out.println(ActualTitle);

        //compare actual vs expected result
        Assert.assertEquals(ActualTitle,ExpectedTitle);
        Thread.sleep(10000);

        //close the browser window
        driver.quit();

        //WebDriver driver = getDriver();
        //driver.get("https://www.google.com");
        //driver.findElement (By.name("q")).sendKeys("Sri Lanka");
        //driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        //Thread.sleep(10000);
        //driver.quit();
    }

    @Test

    public void test_Calculator2() throws InterruptedException {

        //WebDriver driver = getDriver();
        //driver.get("https://www.google.com");
        //driver.findElement (By.name("q")).sendKeys("Sri Lanka");
        //driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        //Thread.sleep(10000);
        //driver.quit();
    }
}