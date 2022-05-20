package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public ResultPage() {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy (xpath = "//h1[@class='search-header__title']")
    WebElement results;
    public String setResults() {
        log.info("getting result text from "+results.toString());

        return getTextFromElement(results);
    }

}
