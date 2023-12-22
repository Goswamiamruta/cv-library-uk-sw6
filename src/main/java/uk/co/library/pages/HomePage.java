package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//button[@id='save']")
    WebElement acceptAllCookies;
    @CacheLookup
    @FindBy(id = "keywords")
    WebElement jobtitle;
    @CacheLookup
    @FindBy(id = "location")
    WebElement locationSelect;
    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(id = "toggle-hp-search")
    WebElement moreSearchOptions;
    @CacheLookup
    @FindBy(id = "salarymin")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(id = "salarymax")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(id = "salarytype")
    WebElement salaryType;
    @CacheLookup
    @FindBy(id = "tempperm")
    WebElement jobtype;
    @CacheLookup
    @FindBy(id = "hp-search-btn")
    WebElement findJobs;

    public void acceptCookies()  {
        log.info("Accept All Cookies " + acceptAllCookies.toString());

        driver.switchTo().frame("gdpr-consent-notice");
        clickOnElement(acceptAllCookies);


    }
    public void enterJobTitle(String jobTitle){
        log.info("Enter Job Title" + jobtitle.toString());


        sendTextToElement(jobtitle,jobTitle);
    }
    public void enterLocation(String location){
        log.info("Enter Location" + locationSelect.toString());

        sendTextToElement(locationSelect,location);
    }
    public void selectDistance(String distance){
        log.info("selectDistance" +distanceDropDown.toString());

        selectByVisibleTextFromDropDown(distanceDropDown,distance);
    }
    public void clickOnMoreSearchOptionLink(){
        log.info("Search Option" +moreSearchOptions.toString());

        clickOnElement(moreSearchOptions);
    }
    public void enterMinSalary(String minSalary){
        log.info("Min Salary" +salaryMin.toString());

        sendTextToElement(salaryMin,minSalary);
    }
    public void enterMaxSalary(String maxSalary){
        log.info("Max Salary" +salaryMax.toString());

        sendTextToElement(salaryMax,maxSalary);
    }
    public void selectSalaryType(String sType){
        log.info("Type Of Salary" +salaryType.toString());

        selectByVisibleTextFromDropDown(salaryType,sType);
    }
    public void selectJobType(String jobType){
        log.info("Job Type" +jobType.toString());


        selectByVisibleTextFromDropDown(jobtype,jobType);
    }
    public void clickOnFindJobsButton(){
        log.info("Job Button" +findJobs.toString());


        clickOnElement(findJobs);
    }


}
