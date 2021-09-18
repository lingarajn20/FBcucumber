package com.stepdefinition.com;

import org.openqa.selenium.WebDriver;

import com.FBLogin.helper.FileReadManager;
import com.projectmaven.FBcucumber.BaseClass;
import com.projectmaven.FBcucumber.POMfbLogin;
import com.runnertest.com.RunTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass{

	public static WebDriver driver = RunTest.driver;
	
	POMfbLogin login = new POMfbLogin(driver);
	
	@Given("^user launch the application$")
	public void user_launch_the_application() throws Throwable {
	    String url = FileReadManager.getInstanceFR().getInstanceCR().getUrl();
	    BrowserUrlLaunch(url);;
	}

	@When("^user pass the correct username in \"([^\"]*)\"$")
	public void user_pass_the_correct_username_in(String username) throws Throwable {
	    passtheValues(login.getUsername(), username);
	}

	@When("^user  pass the correct password in \"([^\"]*)\"$")
	public void user_pass_the_correct_password_in(String password) throws Throwable {
	    passtheValues(login.getPassword(), password);
	}

	@Then("^FB login take place$")
	public void fb_login_take_place() throws Throwable {
	    clickthelement(login.getLoginBut());
	}

}
