import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\olgas\\Desktop\\http\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        driver.get("https://petstore.octoperf.com/actions/Catalog.action");
        Thread.sleep(1000);

        WebElement SignIn = driver.findElement(By.cssSelector(" #MenuContent > a:nth-child(3)"));
        SignIn.click();
        WebElement Register =driver.findElement(By.cssSelector("#Catalog > a"));
        Register.click();
        WebElement RegisterID = driver.findElement(By.name("username"));
        RegisterID.sendKeys("olgajk");
        WebElement RegisterPassword =driver.findElement(By.name("password"));
        RegisterPassword.sendKeys("oljfgdfg");
        WebElement RegisterPassword1 =driver.findElement(By.name("repeatedPassword"));
        RegisterPassword1.sendKeys("oljfgdfg");

        WebElement RegisterFirstName = driver.findElement(By.name("account.firstName"));
        RegisterFirstName.sendKeys("Olga");
        WebElement RegisterLastName = driver.findElement(By.name("account.lastName"));
        RegisterLastName.sendKeys("Sm");
        WebElement RegisterEmail = driver.findElement(By.name("account.email"));
        RegisterEmail.sendKeys("olga@mail.com");
        WebElement RegisterNumberPhone = driver.findElement(By.name("account.phone"));
        RegisterNumberPhone.sendKeys("4535756434");
        WebElement RegisterAddress1 = driver.findElement(By.name("account.address1"));
        RegisterAddress1.sendKeys("green");
        WebElement RegisterAddress2 = driver.findElement(By.name("account.address2"));
        RegisterAddress2.sendKeys("greenpo");
        WebElement RegisterCity = driver.findElement(By.name("account.city"));
        RegisterCity.sendKeys("Haifa");
        WebElement RegisterState = driver.findElement(By.name("account.state"));
        RegisterState.sendKeys("3423 ");
        WebElement RegisterZip = driver.findElement(By.name("account.zip"));
        RegisterZip .sendKeys("3556776");
        WebElement RegisterCountry = driver.findElement(By.name("account.country"));
        RegisterCountry .sendKeys("Israel");

        WebElement LanguagePreference = driver.findElement(By.cssSelector("#Catalog > form > table:nth-child(6) > tbody > tr:nth-child(1) > td:nth-child(2) > select > option:nth-child(2)"));
        LanguagePreference.click();
        WebElement FavouriteCategory = driver.findElement(By.cssSelector("#Catalog > form > table:nth-child(6) > tbody > tr:nth-child(2) > td:nth-child(2) > select > option:nth-child(2)"));
        FavouriteCategory.click();
        WebElement EnableMyList = driver.findElement(By.cssSelector("#Catalog > form > table:nth-child(6) > tbody > tr:nth-child(3) > td:nth-child(2) > input[type=checkbox]"));
        EnableMyList .click();
        WebElement EnableMyBanner = driver.findElement(By.cssSelector(" #Catalog > form > table:nth-child(6) > tbody > tr:nth-child(4) > td:nth-child(2) > input[type=checkbox]"));
        EnableMyBanner .click();

        WebElement SaveInformation =driver.findElement(By.cssSelector("#Catalog > form > input[type=submit]"));
        SaveInformation.click();


    }
}
