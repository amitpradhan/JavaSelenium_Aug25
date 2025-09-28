package stepdefinitions.automation_excercise_stepdefs;

import com.automation.utils.AutomationExercise;
import com.automation.utils.BaseAutomationExcercise;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static com.automation.utils.AutomationExercise.*;
import static com.automation.utils.AutomationExercise.validateItemQuantityInCart;

public class AutomationExcerciseSteps {

//    WebDriver driver;

    @Given("I am on Login page")
    public void i_am_login_page() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\JavaSelenium_Aug25\\src\\test\\resources\\webdriver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://automationexercise.com/login");
    }
    @When("I entered user and password")
    public void i_entered_user_and_password() {
        driver.findElement(By.name("email")).sendKeys("amitkp.2031@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Luck2025");
    }
    @When("Click on Login Button")
    public void click_on_login_button() {
        driver.findElement(By.xpath("//button[@type='submit' and text()='Login']")).click();
    }
    @When("I entered {string} and {string}")
    public void i_entered_and(String username, String password) {
        driver.findElement(By.name("email")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
    }

    @Then("The Login should be {string}")
    public void the_login_should_be(String statusMessage) {
        String successfulLoginStatusMsg = driver.findElement(By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[10]/a")).getText();
        System.out.println(successfulLoginStatusMsg);
        if(successfulLoginStatusMsg.contains(statusMessage))
            System.out.println("Login in Successful.");
        else {
            String failureLoginStatusMsg = driver.findElement(By.xpath("//*[@id='form']/div/div/div[1]/div/form/p")).getText();
            System.out.println("Login in not successful." +failureLoginStatusMsg);
            Assert.assertEquals(statusMessage, failureLoginStatusMsg);
        }


    }


    @Then("I should be logged in successfully.")
    public void i_should_be_logged_in_successfully() {
        WebElement logout = driver.findElement(By.xpath("//a[text()=' Logout']"));
        Assert.assertTrue("Test is failed..", logout.isDisplayed() );
    }

/******************************ADD To CART *******************************************************/


    @Given("I am logged into application")
    public void i_am_logged_into_application() {
        loginToAutomationExercise();
    }

    @When("Add the item to card")
    public void add_the_item_to_card() {
        addToCartFirstProduct();

    }
    @When("Then the item should be added successfully to the cart")
    public void then_the_item_should_be_added_successfully_to_the_cart() {
        Assert.assertTrue("Product not added successfully to cart..", checkProductAddedSuccessfullyToCart());
    }
    /******************************Remove from CART *******************************************************/

    @Then("remove items from the cart")
    public void remove_items_from_the_cart() {
        removeItemsFromCart();
    }

    @Then("the no of items in the cart should be {string}")
    public void the_no_of_items_in_the_cart_should_be(String expectedNoOfItemsInCart) {
        validateItemQuantityInCart(Integer.parseInt(expectedNoOfItemsInCart));
    }
    @Then("all items should be removed successfully")
    public void all_items_should_be_removed_successfully() {
        validateItemQuantityInCart(0);
    }

    @Then("I should be logged out of the application")
    public void i_should_be_logged_out_of_the_application() {
        logout();
    }
    @Then("I close the application")
    public void i_close_the_application() {
        closeApp();
    }



    @When("Add the item to card from category {string}")
    public void add_the_item_to_card_from_category(String category) {
        addItemFromCategory(category);
    }

}
