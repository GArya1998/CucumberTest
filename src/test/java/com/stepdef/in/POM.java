package com.stepdef.in;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {
public static WebDriver driver;

@FindBy(name="first_name")
private WebElement firstname;

@FindBy(name="last_name")
private WebElement lastname;

@FindBy(name="business_name")
private WebElement businessname;

@FindBy(name="email")
private WebElement email;

@FindBy(xpath="//button[@id='demo']")
private WebElement submit;


public POM(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver2, this);

}

public WebElement getFirstname() {
	return firstname;
}

public WebElement getLastname() {
	return lastname;
}

public WebElement getBusinessname() {
	return businessname;
}

public WebElement getEmail() {
	return email;
}

public WebElement getSubmit() {
	return submit;
}



}
