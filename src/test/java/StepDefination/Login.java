package StepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    WebDriver driver;
    @Given("^User able to open Browser$")
    public void user_able_to_open_Browser() {
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("^Enter an Url$")
    public void enter_an_Url()  {
        driver.get("https://demo.nopcommerce.com/");
    }

    @When("^User click on Login Link$")
    public void user_click_on_Login_Link()  {
        driver.findElement(By.className("ico-login")).click();
    }

    @When("^User on Login Page and Verify Login page Title$")
    public void user_on_Login_Page_and_Verify_Login_page_Title()  {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("nopCommerce demo store. Login",title);
    }


}
