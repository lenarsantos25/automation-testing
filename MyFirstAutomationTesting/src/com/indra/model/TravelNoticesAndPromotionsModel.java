package com.indra.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TravelNoticesAndPromotionsModel {

	@FindBy(xpath = "(//div[@id='carousel-wrapper']/div)[1]")
	public WebElement firstCard;
	
	@FindBy(xpath = "(//div[@id='carousel-wrapper']/div)[2]")
	public WebElement secondCard;
	
	@FindBy(xpath = "(//div[@id='carousel-wrapper']/div)[3]")
	public WebElement thirdCard;
	
	@FindBy(xpath = "(//div[@id='carousel-wrapper']/div)[4]")
	public WebElement fourthCard;
	
	@FindBy(xpath="(//div[@id='container-wrapper']/div)[2]")
	public WebElement secondPageButton;
	
	@FindBy(xpath = "(//div[@id='carousel-wrapper']/div)[5]")
	public WebElement fifthCard;
	
	@FindBy(xpath = "(//div[@id='carousel-wrapper']/div)[6]")
	public WebElement sixthCard;
	
	@FindBy(xpath = "(//div[@id='carousel-wrapper']/div)[7]")
	public WebElement seventhCard;
	
	@FindBy(xpath = "(//div[@id='carousel-wrapper']/div)[8]")
	public WebElement eightCard;

	@FindBy(id="wzrk-confirm")
	public WebElement allowBtnId;
}
