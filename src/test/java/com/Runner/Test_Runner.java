package com.Runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.nov.Base_Class;
import com.pom.Home_Page;
import com.pom.Login_Page;

public class Test_Runner extends Base_Class {

	public static WebDriver driver = Base_Class.getBrowser("chrome"); // ----> null

	public static Home_Page hp = new Home_Page(driver);

	public static Login_Page login = new Login_Page(driver);

	public static void main(String[] args) {

		getURL("http://automationpractice.com/index.php");

		clickOnElement(hp.getSignin_Btn());

		inputValueElement(login.getEmail(), "emailid1710@gmail.com");

		inputValueElement(login.getPassword(), "Music1710");

		clickOnElement(login.getSignin_Btn());

		quit();

	}

}
