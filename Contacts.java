package Final;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Contacts {
		
		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver  = new ChromeDriver();
			
			driver.get("https://demo.vtiger.com/vtigercrm/");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.findElement(By.xpath("//button[text()='Sign in']")).click();
			
			driver.findElement(By.xpath("(//div[@class='row app-navigator'])[1]")).click();
			Thread.sleep(1000);
			
			Actions a = new Actions(driver);
			
			WebElement sys = driver.findElement(By.xpath("//span[text()=' SALES']"));
			a.moveToElement(sys).perform();
			
			Thread.sleep(1000);
			
			//driver.findElement(By.xpath("(//span[text()=' Contacts'])[1]")).click();
			
			driver.findElement(By.xpath("(//a[@title='Contacts'])[2]")).click();
			
			driver.findElement(By.id("Contacts_listView_basicAction_LBL_ADD_RECORD")).click();
			
			driver.findElement(By.id("s2id_autogen1")).click();
			driver.findElement(By.xpath("//div[text()='Mr.']")).click();
			
			driver.findElement(By.id("Contacts_editView_fieldName_firstname")).sendKeys("Viraj");
			
			driver.findElement(By.id("Contacts_editView_fieldName_lastname")).sendKeys("Mali");
			
			driver.findElement(By.id("Contacts_editView_fieldName_phone")).sendKeys("409247109");
			
			driver.findElement(By.id("Contacts_editView_fieldName_mobile")).sendKeys("123456789");
			
			driver.findElement(By.id("s2id_autogen3")).click();
			driver.findElement(By.xpath("//div[text()='Existing Customer']")).click();
			
			driver.findElement(By.id("Contacts_editView_fieldName_homephone")).sendKeys("987654321");
			
			driver.findElement(By.id("Contacts_editView_fieldName_title")).sendKeys("Title");
			
			driver.findElement(By.id("Contacts_editView_fieldName_otherphone")).sendKeys("910912793");
			
			driver.findElement(By.id("Contacts_editView_fieldName_department")).sendKeys("Department");
			
			driver.findElement(By.id("Contacts_editView_fieldName_fax")).sendKeys("FAX");
			
			driver.findElement(By.id("Contacts_editView_fieldName_email")).sendKeys("abc@gmail.com");
			
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,300)");
			
			driver.findElement(By.id("Contacts_editView_fieldName_birthday")).sendKeys("07-07-1999");
			
			driver.findElement(By.xpath("(//td[text()='1'])[1]")).click();
			
			driver.findElement(By.id("Contacts_editView_fieldName_assistant")).sendKeys("Assistant");
			
			driver.findElement(By.id("Contacts_editView_fieldName_secondaryemail")).sendKeys("pqr@gmail.com");
			
			driver.findElement(By.id("Contacts_editView_fieldName_emailoptout")).click();
			
			driver.findElement(By.id("Contacts_editView_fieldName_donotcall")).click();
			
			driver.findElement(By.id("Contacts_editView_fieldName_reference")).click();
			
			jse.executeScript("window.scrollBy(0,300)");
			
			driver.findElement(By.id("s2id_autogen5")).click();
			driver.findElement(By.xpath("//div[text()='Marketing Group']")).click();
			
			driver.findElement(By.id("Contacts_editView_fieldName_notify_owner")).click();
			
			driver.findElement(By.id("Contacts_editView_fieldName_portal")).click();
			
			jse.executeScript("window.scrollBy(0,300)");
			
			driver.findElement(By.name("mailingstreet")).sendKeys("Nagaon,Mali Lane");
			
			driver.findElement(By.name("otherstreet")).sendKeys("Kolhapur");
			
			driver.findElement(By.id("Contacts_editView_fieldName_mailingpobox")).sendKeys("Box1");
			
			driver.findElement(By.id("Contacts_editView_fieldName_otherpobox")).sendKeys("Box2");
			
			driver.findElement(By.id("Contacts_editView_fieldName_mailingcity")).sendKeys("city1");
			
			driver.findElement(By.id("Contacts_editView_fieldName_othercity")).sendKeys("city2");
			
			driver.findElement(By.id("Contacts_editView_fieldName_mailingstate")).sendKeys("MH-09");
			
			driver.findElement(By.id("Contacts_editView_fieldName_otherstate")).sendKeys("KA-23");
			
			driver.findElement(By.id("Contacts_editView_fieldName_mailingzip")).sendKeys("416122");
			
			driver.findElement(By.id("Contacts_editView_fieldName_otherzip")).sendKeys("654321");
			
			driver.findElement(By.id("Contacts_editView_fieldName_mailingcountry")).sendKeys("India");
			
			driver.findElement(By.id("Contacts_editView_fieldName_othercountry")).sendKeys("India");
			
			driver.findElement(By.name("description")).sendKeys("Thanking You");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[text()='Save']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//span[@class='fa fa-user']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.linkText("Sign Out")).click();
			
			}

			
			
			

}
