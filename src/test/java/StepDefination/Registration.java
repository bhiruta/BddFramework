package StepDefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {
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

    @When("^User Click on Register Button$")
    public void user_Click_on_Register_Button()  {driver.findElement(By.className("ico-register")).click();
        // Write code here that turns the phrase above into concrete actions

    }
    @When("^User enter Firstname and Lastname$")
    public void user_enter_Firstname_and_Lastname(){
            driver.findElement(By.id("FirstName")).sendKeys("dhara");
            driver.findElement(By.id("LastName")).sendKeys("pnchal");
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^User enter Date of Birth Day$")
    public void user_enter_Date_of_Birth_Day()  {driver.findElement(By.id("DateOfBirthDay")).sendKeys("21");
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^User enter Date of Month$")
    public void user_enter_Date_of_Month() {driver.findElement(By.id("DateOfBirthMonth")).sendKeys("Feb");
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^User enter Date of year$")
    public void user_enter_Date_of_year() {driver.findElement(By.id("DateOfBirthYear")).sendKeys("1981");
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^User enter email$")
    public void user_enter_email()  {driver.findElement(By.id("Email")).sendKeys("dharapanchal@gmail.com");
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^User enter Companyname$")
    public void user_enter_Companyname()  {driver.findElement(By.id("Company")).sendKeys("ABCD");
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^User click on Newsletter field$")
    public void user_click_on_Newsletter_field()  {driver.findElement(By.id("Newsletter")).sendKeys("TRUE");
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^User enter password$")
    public void user_enter_password()  {driver.findElement(By.id("Password")).sendKeys("123456");
        // Write code here that turns the phrase above into concrete actions

    }
    @When("^User enter confirm password$")
    public void user_enter_confirm_password() {driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^User Click on Submit button$")
    public void user_Click_on_Submit_button()  {driver.findElement(By.id("register-button")).sendKeys("register");
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^User should see a welcome page$")
    public void user_should_see_a_welcome_page()  {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("^User close the browser$")
    public void user_close_the_browser()  {
        driver.close();
    }
}





