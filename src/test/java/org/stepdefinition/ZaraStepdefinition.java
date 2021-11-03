package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;

import io.cucumber.java.en.*;

public class ZaraStepdefinition extends BaseClass{
	@Given("The user should launch the chromebrowser")
	public void the_user_should_launch_the_chromebrowser() {
	    Cucuchromelaunch();
	}

	@When("The user should type url")
	public void the_user_should_type_url() {
	    CucuLoadurl("https://www.zara.com/in/");
	}

	@When("The user should maximixe window")
	public void the_user_should_maximixe_window() {
	    CucuMax();
	}

	@When("The user should launch the application and click the help button")
	public void the_user_should_launch_the_application_and_click_the_help_button() {
	   WebElement open = driver.findElement(By.xpath("//span[text()='HELP']"));
	   CucuJavaBtn(open);
	}
	   
	@When("The user should click the payment button")
	public void the_user_should_click_the_payment_button() {
	   WebElement payment = driver.findElement(By.xpath("(//img[@class='lazy-image__image'])[3]"));
	   CucuClick(payment);
	   
	}

	@Then("The user should close browser")
	public void the_user_should_close_browser() throws InterruptedException {
		Thread.sleep(3000);
	    Cucuclose();
	}



}
