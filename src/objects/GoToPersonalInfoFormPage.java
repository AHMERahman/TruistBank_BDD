package objects;


import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import commons.Commons;
import utils.PersonalInfoData;

public class GoToPersonalInfoFormPage {

	WebDriver driver;
	Commons commons;

	public GoToPersonalInfoFormPage(WebDriver driver, Commons commons) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.commons = commons;
	}

	@FindBy(xpath = "(//button[@class='tru-core-button tru-core-button-secondary'])[2]")
	WebElement noElement;

	@FindBy(xpath = "//*[@id=\"tru-core-radio-button-label-2\"]/tru-core-form-field-label")
	WebElement getSubheadingElement;

	@FindBy(xpath = "//*[@id=\"tru-core-input-1\"]")
	WebElement zipCodeElement;

	@FindBy(xpath = "//button[@class=\"tru-core-button tru-core-button-primary\"]")
	WebElement continueElement;

	@FindBy(xpath = "//h1")
	WebElement subheadingElement2;
	
	
	public void getTitle() {
		commons.getCurrentUrl(driver);
	}

	public void clickNo() {
		commons.click(noElement);
	}

	public void getSubheading(String expectedSubheading) {
		assertEquals(commons.getText(getSubheadingElement), expectedSubheading);
	}

	public void inputZipcode(String value) {
		commons.inputValue(zipCodeElement, value);
	}

	public void clickContinue() {
		commons.click(continueElement);
	}

	public void getSubheading2(String expected2) {
		assertEquals(commons.getText(subheadingElement2).replaceAll("[^a-zA-Z]",""), expected2.replaceAll("[^a-zA-Z]",""));
	}

	public void goToPersonalInfoFormPageSteps(String expectedSubheading, String value, String expected2) {
		clickNo();
		getSubheading(expectedSubheading);
		inputZipcode(value);
		clickContinue();
		getSubheading2(expected2);
	}
	
	public void goToPersonalInfoFormPageSteps(PersonalInfoData personalInfoData) {
		clickNo();
		getSubheading(personalInfoData.getExpectedSubHeading());
		inputZipcode(personalInfoData.getZipCode());
		clickContinue();
		getSubheading2(personalInfoData.getExpectedSubheading2());
	}

}
