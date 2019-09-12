package common;

import java.io.IOException;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import resources.base;

public class Hooks extends base {
	@Before(order = 1)
	public void initializeTest() throws IOException {
		System.out.println("Before execuetd");
		Runtime.getRuntime().exec("taskkill /f /im chromedriver.exe");
		initializeDriver();
		getDriver().manage().window().maximize();
		getDriver().get(projectProperties.getProperty("url"));

	}

	@After(order = 1)
	public void tearDownTest() {
		System.out.println("After execuetd");
	}

	@Before(order = 2)
	public void initializeTestOrder() throws IOException {
		System.out.println("Before 2 execuetd");
	}

	@After(order = 2)
	public void tearDownTestOrder() {
		System.out.println("After Order 2 execuetd");
		getDriver().close();
		getDriver().quit();
	}
}
