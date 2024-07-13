package org.step;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	WebDriver driver;

	@Given("User should be on login page")
	public void user_should_be_on_login_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	@When("User enter username and password")
	public void user_enter_username_and_password(io.cucumber.datatable.DataTable dataTable) {
		
		List<Map<String,String>> asMaps = dataTable.asMaps();
		
		Map<String, String> map = asMaps.get(1);
		
		String email = map.get("Username");
		
		driver.findElement(By.id("email")).sendKeys(email);
		
		String pass = map.get("Password");
		
		driver.findElement(By.id("pass")).sendKeys(pass);
	}




	@When("User clicks On login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.name("login")).click();
	}
	@Then("User gets the Error message")
	public void user_gets_the_error_message() {
		System.out.println("Error message");
		driver.quit();
	}



}
