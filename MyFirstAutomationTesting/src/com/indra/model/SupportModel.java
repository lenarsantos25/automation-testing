package com.indra.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SupportModel {
	
	@FindBy(linkText="Support")
	public WebElement supportLinkText;
	
	@FindBy(xpath="//input[contains(@role, 'combobox')]")
	public WebElement searchBox;
	
	@FindBy(xpath="//button[contains(text(), 'Search')]")
	public WebElement searchButton;
}
