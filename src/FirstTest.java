import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class FirstTest {
    private AppiumDriver driver;

    @Before
    public void setUp() throws Exception
    {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "AndroidTestDevice");
        capabilities.setCapability("platformVersion", "10.0");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("appPackage", "ru.sravni.android.bankproduct.debug");
        capabilities.setCapability("appActivity", "ru.sravni.android.bankproduct.presentation.main.view.MainActivity");
        capabilities.setCapability("app", "/Users/galina.khozyaykina/learn/Sravni/apks/sravni.apk");

        driver = new AndroidDriver(new URL("http:127.0.0.1:4723/wd/hub"), capabilities);
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void firstTest()  {
        System.out.println("First Test Run");
    }

}

