import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class main2 {
    WebDriver driver = new ChromeDriver();


    public main2() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    public String openSite(String URL) {
        this.driver.get(URL);
        return this.driver.getCurrentUrl();
    }
    public String [] openPage() throws InterruptedException {
        String [] openPage1 = new String[2];
        WebElement cPCat = driver.findElement(By.cssSelector(" #MainImageContent > map > area:nth-child(5)"));
        cPCat.click();
        openPage1[0] = this.driver.getCurrentUrl();
        Thread.sleep(2000);
        WebElement frontPage = driver.findElement(By.cssSelector(" #LogoContent > a > img"));
        frontPage.click();
        Thread.sleep(2000);
        WebElement cCat = driver.findElement(By.cssSelector("#QuickLinks > a:nth-child(7) > img"));
        cCat.click();
        openPage1[1] = this.driver.getCurrentUrl();

        return openPage1;


    }
}
