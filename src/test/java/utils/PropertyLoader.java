package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyLoader {

  private static Properties prop = new Properties();

  public Properties getProperties(String loadPropertyFile) {
    FileInputStream file = null;
    try {
      file = new FileInputStream("src/test/resources/" + loadPropertyFile);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    try {
      prop.load(file);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return prop;
  }
}
