package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;

import io.cucumber.java.en.*;

public class FacebookLoginStepDefinition extends BaseClass{


@Given("The user should launch the chrome browser")
public void the_user_should_launch_the_chrome_browser() {
	Cucuchromelaunch();
}

@When("The user should type the url")
public void the_user_should_type_the_url() {
    CucuLoadurl("https://en-gb.facebook.com/");
}

@When("The user should maximixe the window")
public void the_user_should_maximixe_the_window() {
    CucuMax();
}

@When("The user should type the username and password")
public void the_user_should_type_the_username_and_password() {
    WebElement user = driver.findElement(By.id("email"));
    CucuJavaSpTxt(user, "qwerty");
    
    WebElement pass = driver.findElement(By.id("pass"));
    CucuJavaSpTxt(pass, "qwerty@12345");
    
}

@When("The user should type the username{string} and password {string}")
public void the_user_should_type_the_username_and_password(String s1, String s2) {
	 WebElement user = driver.findElement(By.id("email"));
	    CucuJavaSpTxt(user, s1 );
	    
	    WebElement pass = driver.findElement(By.id("pass"));
	    CucuJavaSpTxt(pass, s2);
}
@Then("The user should close the browser")
public void the_user_should_close_the_browser() throws InterruptedException {
	Thread.sleep(2000);
//    Cucuclose();
}




}
