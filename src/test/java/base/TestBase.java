package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase{

public static Properties prop;
public static WebDriver driver;
public TestBase() {
	prop =new Properties();
	String path="src//test//resources//configFiles/config.properties";
	FileInputStream fin;
	try {
		fin=new FileInputStream(path);
		try {
			prop.load(fin);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public static void initialize()
{
	String strBrowser=prop.getProperty("browser");
	if(strBrowser.equalsIgnoreCase("chrome"))
			{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();	
			}
	driver.get(prop.getProperty("url"));
}

}
