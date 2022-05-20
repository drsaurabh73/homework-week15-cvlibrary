package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobtitlefield;


    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='e.g. town or postcode']")
    WebElement location;


    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distance;


    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moresearch;


    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryminimum;


    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement maximumsalary;


    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salarytype;


    @CacheLookup
    @FindBy(xpath = "//select[@class='hp-jobtype form__select']")
    WebElement jobtype;


    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findjob;

    @CacheLookup
    @FindBy(xpath = "//*[contains(text(),'Accept')]")
    WebElement cookies;


    public void setJobtitle(String jobtitle) {
        log.info("sending  text from jobtitle/job ref " + jobtitlefield.toString());
        sendTextToElement(jobtitlefield, jobtitle);
    }


    public void setLocation(String text) {
        log.info("sending  text from location ref " + jobtitlefield.toString());
        sendTextToElement(location, text);
    }


    public void setDistance(String text) {
        log.info("Selecting distance from location" + distance + " from dropdown " + distance.toString());
        selectByVisibleTextFromDropDown(distance, text);
    }


    public void clickOnMoreSearchOption() {
        log.info("Clicking on more search option" + moresearch.toString());
        clickOnElement(moresearch);
    }


    public void setSalaryminimum(String text) {
        log.info("Selecting Minumum salary from location" + salaryminimum + " from dropdown " + salaryminimum.toString());
        sendTextToElement(salaryminimum, text);
    }


    public void setMaximumsalary(String text) {
        log.info("Selecting Maximum salary from location " + maximumsalary + " from dropdown " + maximumsalary.toString());
        sendTextToElement(maximumsalary, text);
    }


    public void setSalarytype(String text) {
        log.info("Selecting salary type " + salarytype + " from dropdown " + salarytype.toString());
        selectByValueFromDropDown(salarytype, text);
    }


    public void setJobtype(String text) {
        log.info("Selecting Job type " + text + " from dropdown " + jobtype.toString());
        selectByValueFromDropDown(jobtype, text);
    }


    public void clickOnFindJobButton() {
        log.info("Clicking on findjob" + findjob.toString());
        clickOnElement(findjob);
    }


    public void clickOnAcceptCookie() {
        log.info("Clicking on Accept Cookies : " + cookies.toString());
        switchToiFrame("gdpr-consent-notice");
        clickOnElement(cookies);
    }


}
