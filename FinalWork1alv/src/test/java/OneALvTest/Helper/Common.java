package OneALvTest.Helper;

import org.openqa.selenium.chrome.ChromeDriver;

public class Common {

    protected static ChromeDriver driver;

    public void startBrowser2(){
        String driverpath = "C:/Users/ZhekaSan/IdeaProjects/aaa/src/main/resources/";
        System.setProperty("webdriver.chrome.driver", driverpath + "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.janisroze.lv/");
    }

    public void stopBrowser2(){
        driver.quit();
    }
}
