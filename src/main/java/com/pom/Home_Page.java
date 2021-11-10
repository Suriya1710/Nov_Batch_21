package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	public WebDriver driver; // ----> null

	@FindBy(xpath = "//a[@class='login']")
	private WebElement signin_Btn;

	public Home_Page(WebDriver abc) {

		this.driver = abc; // this.driver = From Test Runner Driver;

		PageFactory.initElements(driver, this);

	}

	public WebElement getSignin_Btn() {
		return signin_Btn;
	}

}
