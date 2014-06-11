package com.seleniumwebapp;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class TestWebapp {

	private WebDriver driver;

	@Before
	public void setUp() {
		// Create a new instance of the html unit driver
		driver = new HtmlUnitDriver();

		//Navigate to desired web page
		//driver.get("http://localhost:6060/WebApplication4Selenium");
		//http://localhost:8080/SeleniumWebapp/
		driver.get("http://localhost:8080/SeleniumWebapp/");
	}

	@Test
	public void shouldBeAbleEnterUserNameAndClickSubmitToVerifyWelcomeMessage() 
	{
		// verify title of index page
		verifyTitle("Enter your name");
		//verify header of index page
		verifyHeaderMessage("Please enter your name");
		//enter user name as Allen
		enterUserName("Allen");
		//verify title of welcome page
		verifyTitle("Welcome Page");
		//verify header of welcome page
		verifyHeaderMessage("Welcome Allen!!!");
		//verify back link and click on it
		backToPreviousPage("go back");  
		//verify title of index page again to make sure link is working
		verifyTitle("Enter your name");
	}

	private void verifyTitle(String expectedTitle) {
		//get the title of the page
		String actualTitle = driver.getTitle();

		// verify title
		assertThat(actualTitle, equalTo(expectedTitle));
	}

	private void verifyHeaderMessage(String expectedHeaderMessage) {
		// find header element
		WebElement element = driver.findElement(By.tagName("h3"));

		String actualHeaderMessage = element.getText();

		// verify header text
		assertThat(actualHeaderMessage, equalTo(expectedHeaderMessage));
	}

	private void enterUserName(String userName) {
		// find the input text box
		WebElement element = driver.findElement(By.name("userName"));

		// set the user name in input text box
		element.sendKeys(userName);

		// submit form
		element.submit();
	}

	private void backToPreviousPage(String expectedLinkText) {
		// find the link by its id
		//WebElement element = driver.findElement(By.id("back"));
		WebElement element = driver.findElement(By.tagName("a"));
		//get the actual link text
		String actualLinkText = element.getText(); 

		//verify link text with expected like text
		assertThat(actualLinkText, equalTo(expectedLinkText));

		// click the link
		element.click();
	}
}