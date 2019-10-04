package utils;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.core.api.Scenario;
import java.util.Properties;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;
import stepdefinitions.BaseTest;

public class TestContext {

  private static String appiumProperties = "properties/appium.properties";
  BaseTest baseTest = new BaseTest();

  public DesiredCapabilities setCapabilities(String propertiesFile) throws Exception {
    Properties prop;
    PropertyLoader propertyLoader = new PropertyLoader();
    DesiredCapabilities capabilities = new DesiredCapabilities();
    prop = propertyLoader.getProperties(propertiesFile);

    capabilities
        .setCapability(MobileCapabilityType.PLATFORM_NAME, prop.getProperty("platform.name"));
    capabilities
        .setCapability(MobileCapabilityType.PLATFORM_VERSION, prop.getProperty("platform.version"));
    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, prop.getProperty("device.name"));
    capabilities.setCapability(MobileCapabilityType.UDID, prop.getProperty("device.udid"));
    capabilities.setCapability(MobileCapabilityType.NO_RESET, prop.getProperty("noReset"));
    capabilities.setCapability(MobileCapabilityType.FULL_RESET, prop.getProperty("fullReset"));

    capabilities
        .setCapability(AndroidMobileCapabilityType.APP_PACKAGE, prop.getProperty("app.package"));
    capabilities
        .setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, prop.getProperty("app.activity"));
    return capabilities;
  }


  public void takesScreenshot(Scenario scenario) {
    if (scenario.isFailed()) {
      try {
        byte[] screenshot =
            ((TakesScreenshot) baseTest.getDriver())
                .getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png");
      } catch (WebDriverException wde) {
        System.err.println(wde.getMessage());
      } catch (ClassCastException cce) {
        cce.printStackTrace();
      }
      System.out.println("Inside After" + Thread.currentThread().getId());
    }
  }

  public void stopDriver() {
    baseTest.getDriver().quit();
    System.out.print("WebDriver Quit....");
  }

  public String getAppiumServerUrl() {
    Properties prop;
    PropertyLoader propertyLoader = new PropertyLoader();
    prop = propertyLoader.getProperties(appiumProperties);

    return String.format("http://%s:%s/wd/hub",
        prop.getProperty("appium.server.ip"), prop.getProperty("appium.server.port"));
  }
}
