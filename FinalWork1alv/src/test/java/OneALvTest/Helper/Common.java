package OneALvTest.Helper;

import org.openqa.selenium.chrome.ChromeDriver;

public class Common {

    protected static ChromeDriver driver;

    public void startBrowser(){
        String driverpath = "C:/Users/ZhekaSan/IdeaProjects/aaa/FinalWork1alv/src/main/resources/";
        System.setProperty("webdriver.chrome.driver", driverpath + "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.1a.lv/");
    }

    public void stopBrowser(){
        driver.quit();
    }
}
