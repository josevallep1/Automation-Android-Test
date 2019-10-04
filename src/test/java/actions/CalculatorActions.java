package actions;

import io.appium.java_client.MobileElement;
import java.util.NoSuchElementException;
import pagesObjects.CalculatorPage;
import stepdefinitions.BaseTest;

public class CalculatorActions {

  CalculatorPage calculatorPage = new CalculatorPage(BaseTest.driver);

  public boolean isCalculatorOpened() {
    return calculatorPage.pageContainer.isDisplayed();
  }

  public String sumOf(String a, String b) {
    inputDigit(a);
    tapAddButton();
    inputDigit(b);
    tapResultButton();
    return getResult();
  }

  private void inputDigit(String digit) {
    String[] ary = digit.split("");
    for (String num : ary) {
      getButton(num).click();
    }
  }

  private void tapAddButton() {
    calculatorPage.addButton.click();
  }

  private void tapResultButton() {
    calculatorPage.resultButton.click();
  }

  private String getResult() {
    return calculatorPage.result.getText();
  }

  private MobileElement getButton(String buttonText) {
    return calculatorPage.calcButtons.stream().
        filter(item -> item.getText().equalsIgnoreCase(buttonText)).findAny().
        orElseThrow(() -> new NoSuchElementException(
            String.format("No button with text '%s' found", buttonText)));
  }
}
