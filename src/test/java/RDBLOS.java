import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RDBLOS extends TestBase {

    @Test

    public void form1() throws InterruptedException {

        //create selenium webelement
        WebDriver driver = getDriver();

        Login login = new Login(driver);

        login.run();

        //lead hover
        WebElement lead = driver.findElement(By.id("menu_0"));
        Actions actions = new Actions (driver);
        actions.moveToElement(lead).perform();

        Thread.sleep(3000);

        //Create Lead
        driver.findElement(By.id("submenu_0")).click();

        Thread.sleep(3000);

        WebElement nic = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div/div[2]/div[2]/div/div/input"));

        Actions actions1 = new Actions(driver);
        actions1.moveToElement(nic).click().sendKeys("787171451V").perform();

        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div/div[3]/div/button[1]")).click();

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[3]/div/div[4]/button")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/div/div/div")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"mui-17\"]/li[4]")).click();

        driver.findElement(By.xpath("//*[@id=\"mui-19\"]")).sendKeys("Hasani Chalalochana");

        driver.findElement(By.xpath("//*[@id=\"mui-20\"]")).sendKeys("Welagedara");

        driver.findElement(By.xpath("//*[@id=\"mui-21\"]")).sendKeys("Hasani");

        driver.findElement(By.xpath("//*[@id=\"mui-22\"]")).sendKeys(" H C");

        driver.findElement(By.xpath("//*[@id=\"mui-26\"]")).sendKeys("0716193758");

        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div[2]/div[4]/div/div/div[1]/div/div/div")).click().sendKeys("Colombo");

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"mui-29\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div/div")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"mui-31\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div[2]/div[6]/div[2]/button[2]")).click();

        Thread.sleep(10000);

        driver.quit();

    }
}