package pagesObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import java.util.List;

public class CalculatorPage extends BasePage {

  public CalculatorPage(AppiumDriver<MobileElement> driver) {
    super(driver);
  }

  @AndroidFindBy(id = "com.android.calculator2:id/display")
  public MobileElement pageContainer;

  @AndroidFindBy(className = "android.widget.Button")
  public List<MobileElement> calcButtons;

  @AndroidFindBy(id = "com.android.calculator2:id/op_add")
  public MobileElement addButton;

  @AndroidFindBy(id = "com.android.calculator2:id/eq")
  public MobileElement resultButton;

  @AndroidFindBy(id = "com.android.calculator2:id/result")
  public MobileElement result;
}
