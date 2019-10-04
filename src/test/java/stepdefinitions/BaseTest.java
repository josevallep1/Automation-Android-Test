package stepdefinitions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.TestContext;

public class BaseTest {

  public static AppiumDriver<MobileElement> driver;
  private static String androidProperties = "properties/android.properties";

  private static TestContext testContext = new TestContext();

  @Before
  public void beforeScenario() throws Exception {
    DesiredCapabilities capabilities = testContext.setCapabilities(androidProperties);
    setAndroidDriver(capabilities);
  }

  @After
  public void afterScenario(Scenario scenario) {
    testContext.takesScreenshot(scenario);
    testContext.stopDriver();
  }

  private static void setAndroidDriver(DesiredCapabilities capabilities) {
    try {
      driver = new AppiumDriver<MobileElement>(
          new URL(testContext.getAppiumServerUrl()), capabilities);
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
    System.out.print("WebDriver Created....");
  }

  public AppiumDriver<MobileElement> getDriver() {
    return driver;
  }
}
