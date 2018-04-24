package smoke;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pageclass 
{
	public static WebDriver driver;
public void testone() throws Exception
{
	//System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\driver\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("http://10.216.8.47:8080/share/page");
	System.out.println("====Title before login ====" + driver.getTitle());
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("admin");
	driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-submit-button")).click();
	
	driver.findElement(By.linkText("Repository")).click();
	driver.findElement(By.xpath(".//*[@id='template_x002e_documentlist_v2_x002e_repository_x0023_default-fileUpload-button-button']")).click();
	Thread.sleep(5000);
	
	driver.findElement(By.id("template_x002e_dnd-upload_x002e_repository_x0023_default-file-selection-button-overlay")).click();
	Thread.sleep(30000);
	
	Runtime.getRuntime().exec("C:\\AutoIT\\FileUpload.exe");
	Thread.sleep(50000);
	System.out.println("=====title after login=== " + driver.getTitle());
}
	
public void logout()
{
	driver.findElement(By.xpath(".//*[@id='HEADER_USER_MENU_POPUP']/span[2]")).click();
	driver.findElement(By.xpath(".//*[@id='HEADER_USER_MENU_LOGOUT_text']")).click();
	System.out.println("===Title after log out====" + driver.getTitle());
}
}
