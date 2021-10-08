package selenium1;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Company {
public static void main(String[] args) throws IOException{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium1\\dri\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver .manage().window().maximize();
	driver.get("https://fb.com/");
	driver.manage().window().maximize();
	TakesScreenshot tk =(TakesScreenshot)driver;
	File src= tk.getScreenshotAs(OutputType.FILE);
	File desk = new File("C:\\Users\\admin\\eclipse-workspace\\selenium1\\scrn\\test.png");
	FileUtils.copyFile(src,desk);
	
	
	
}
}
