package methooverloading;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "F:\\Practice\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.cleartrip.com/hotels");
List<WebElement> lst=driver.findElements(By.id("travellersOnhome"));
for(int i=0;i<lst.size();i++) {
	System.out.println("list elements are:"+lst.get(i).getText());
}
	
	
	
		 
		      
		      for (int i = 1; i <= 10; ++i) {
		         System.out.println("Line " + i);
		      }
		   }
		}


