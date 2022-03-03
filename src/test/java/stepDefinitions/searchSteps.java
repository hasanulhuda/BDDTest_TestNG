package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class searchSteps {

    WebDriver driver = null;

    @Given("open the Browser")
    public void open_the_browser() {
        System.out.println("inside step = Browser is open");
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @And("user is on Google search page")
    public void user_is_on_google_search_page() {
        System.out.println("inside step = user is on google searcch page");
        driver.get("https://google.com");
    }

    @When("user enters a text in google search")
    public void user_enters_a_text_in_google_search() {
        System.out.println("inside step = user enters a text in search box");
        driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
    }

    @And("hits Enter")
    public void hits_enter(){
        System.out.println("inside step = hits Enter");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @Then("user is navigated to search result")
    public void user_is_navigated_to_search_result() {
        System.out.println("inside step = user is navigated to search result");
        driver.getPageSource().contains("Online Coursesssss");


        driver.close();
        driver.quit();
    }
}
