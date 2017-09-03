package test;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

/**
 * Created by Acer on 03/09/2017.
 */
public class HomePage extends BasePage{
    static String email;
    static String enterPass;

    @FindBy(className = "ico-register")
    WebElement gotoRegistration;
    @FindBy(id ="gender-male")
    WebElement genderMale;
    @FindBy(id = "FirstName")
    WebElement enterFirstName;
    @FindBy(id = "LastName")
    WebElement enterLastName;
    @FindBy(name = "DateOfBirthDay")
    WebElement enterDay;
    @FindBy(name = "DateOfBirthMonth")
    WebElement enterMonth;
    @FindBy(name = "DateOfBirthYear")
    WebElement enterYear;
    @FindBy(id = "Email")
    WebElement enterEmailId;
    @FindBy(id = "Password")
    WebElement enterPassword;
    @FindBy(id = "ConfirmPassword")
    WebElement enterConfirmPassword;
    @FindBy(id = "register-button")
    WebElement clickOnRegistrationbtn;
    @FindBy(tagName = "body")
    WebElement registrationMsg;



    public void checkUrlAndTitle(){
        checkUrl();
        checkTitle();

    }

    private void checkTitle() {
        String title = driver.getTitle();
        System.out.println("Title is...."+title);
        Assert.assertEquals(title, "nopCommerce demo store");


    }

    private void checkUrl() {
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current Url is..."+currentUrl);
        Assert.assertTrue(currentUrl.contains("http://demo.nopcommerce.com"));

    }

    public void setGotoRegistration(){
        gotoRegistration.click();
        String registrationUrl = driver.getCurrentUrl();
        Assert.assertTrue(registrationUrl.contains("http://demo.nopcommerce.com/register"));
        System.out.println("User is on Registraion Page");

    }
    public void enterValidDetailForRegistration(){
        genderMale.click();
        enterFirstName.sendKeys("FirstName");
        enterLastName.sendKeys("LastName");

        Select day = new Select(enterDay);
        day.selectByVisibleText("30");

        Select month = new Select(enterMonth);
        month.selectByVisibleText("January");

        Select year = new Select(enterYear);
        year.selectByVisibleText("1980");

        email = (new Random().nextInt()+"monu@hotmail.com");
        enterEmailId.sendKeys(email);

        enterPass = "pass123";
        enterPassword.sendKeys(enterPass);
        enterConfirmPassword.sendKeys(enterPass);
        clickOnRegistrationbtn.click();

    }
    public void checkRegistrationSuccessfulMsg(){
        registrationIsCompletedMsg("Your registration completed");
    }

    private void registrationIsCompletedMsg(String text) {
        String yourRegistrationCompleted = registrationMsg.getText();
        Assert.assertTrue(yourRegistrationCompleted.contains("Your registration completed"));
        System.out.println("Msg......"+registrationMsg.getText().contains(text));



    }


}
