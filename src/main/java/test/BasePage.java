package test;

import org.openqa.selenium.support.PageFactory;
import utils.BrowserFactory;

/**
 * Created by Acer on 03/09/2017.
 */
public class BasePage extends BrowserFactory {

    BasePage(){
        PageFactory.initElements(driver, this);
    }



}
