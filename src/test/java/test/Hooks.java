package test;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.BrowserFactory;

/**
 * Created by Acer on 03/09/2017.
 */
public class Hooks {
    @Before

    public static void setUp(){
        BrowserFactory.openBrowser();
    }

    @After
    public static void tearDown(){
        BrowserFactory.closeBrowser();
    }
}
