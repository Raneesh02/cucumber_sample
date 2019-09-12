package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import resources.base;

public class LoginSteps extends base {

	@Given("^User is on Home Page")
	public void user_is_on_homepage() throws IOException {

	}

	@When("^User Navigate to LogIn Page")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		System.out.println("Login");
	}

	@When("^User enters UserName and Password")
	public void user_enters_UserName_and_Password() throws Throwable {
		getDriver().findElement(By.id("log")).sendKeys("testuser_1");
		getDriver().findElement(By.id("pwd")).sendKeys("Test@123");
		getDriver().findElement(By.id("login")).click();
	}

	@Then("^Message displayed Login Successfully")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Login Successfully");
	}

	@When("^User LogOut from the Application")
	public void user_LogOut_from_the_Application() throws Throwable {
		getDriver().findElement(By.xpath(".//*[@id='account_logout']/a")).click();
	}

	@Then("^Message displayed LogOut Successfully")
	public void message_displayed_Logout_Successfully() throws Throwable {
		System.out.println("LogOut Successfully");
	}

	@And("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void userEntersAnd(String arg1, String arg2) throws Throwable {
		System.out.println("Name" + arg1 + " Pass" + arg2);
	}

	@And("^User enters credentials$")
	public void userEntersCredentials(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
		System.out.println(data.get(0).get(0) + " Paass" + data.get(0).get(1));
		List<Map<String, String>> data2 = arg1.asMaps(String.class, String.class);
		System.out.println(data2.get(0).get("Username") + " Paass " + data2.get(0).get("Password"));
	}

}
