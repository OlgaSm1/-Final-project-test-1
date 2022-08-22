import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Test2 {
    @Test
    public void Test2() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\olgas\\Desktop\\http\\chromedriver.exe");
        main2 cat1 =  new main2();
        String expectedURL =  "https://petstore.octoperf.com/actions/Catalog.action";
        String actualURL = cat1.openSite(expectedURL);
        Assert.assertEquals(actualURL,expectedURL);

        String[] openPage1;
        openPage1 = cat1.openPage();
        Assert.assertEquals(openPage1[0],openPage1[1]);
    }

}
