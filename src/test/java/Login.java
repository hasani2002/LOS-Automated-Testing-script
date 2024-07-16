import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    WebDriver driver;
    Login(WebDriver driver) {
        this.driver = driver;
    }

    public void run() throws InterruptedException {
        driver.get("https://rdb.xgencredit.com");

        Thread.sleep(15000);

        //enter username
        driver.findElement(By.id("username")).sendKeys("xgenadmin");

        //enter height
        driver.findElement(By.id("password")).sendKeys("Los@123");

        driver.findElement(By.id("mui-1")).click();

        Thread.sleep(15000);
    }
}
