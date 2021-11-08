package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class StepDefinitions {
	
WebDriver driver =null;

	

	@Given("the user opens the browser")
	public void the_user_opens_the_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	    

	@When("the user navigates to google")
	public void the_user_navigates_to_google() {
		driver. navigate(). to("https://mail.google.com");
	}

	@When("the user enters the search")
	public void the_user_enters_the_search() {
		System.out.println("Working");
	}

	@Then("the search results are displayed")
	public void the_search_results_are_displayed() {
		System.out.println("Working");
	}

}
