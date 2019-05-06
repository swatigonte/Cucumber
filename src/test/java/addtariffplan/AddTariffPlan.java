package addtariffplan;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class AddTariffPlan {
	static WebDriver driver;

	@Given("The user is in add tariff plan page")
	public void the_user_is_in_add_tariff_plan_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Greens-11\\Desktop\\swati\\Cucumber\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/index.html");
		
	}

	@Given("User navigate to click on add Tariff plan")
	public void user_navigate_to_click_on_add_Tariff_plan() {
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();

		
	}

	@When("The user fill in the Tariff plan details")
	public void the_user_fill_in_the_Tariff_plan_details() {
		driver.findElement(By.id("rental1")).sendKeys("1200");
		driver.findElement(By.id("local_minutes")).sendKeys("700");
		driver.findElement(By.id("inter_minutes")).sendKeys("400");
		driver.findElement(By.id("sms_pack")).sendKeys("60");
		driver.findElement(By.id("minutes_charges")).sendKeys("20");
		driver.findElement(By.id("inter_charges")).sendKeys("40");
		driver.findElement(By.id("sms_charges")).sendKeys("10");
		
	}

	@When("The user click the submit button")
	public void the_user_click_the_submit_button() {
		driver.findElement(By.name("submit")).click();

		
	}

	@Then("The user should see the customer id generated")
	public void the_user_should_see_the_customer_id_generated() {
		Assert.assertTrue(driver.getCurrentUrl().contains("addtariffplans"));
//		driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed();

		
	}
}
