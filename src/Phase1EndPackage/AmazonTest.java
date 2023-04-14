package Phase1EndPackage;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		WebElement searchBar = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		searchBar.sendKeys("samsung mobile");
		
		//click on search
		WebElement clickSearch = driver.findElement(By.xpath("//input[@value='Go']"));
		clickSearch.click();
		
		//print mobile names
		List<WebElement> mobNames = driver.findElements(By.xpath("//div[@class='a-section']//h2//span"));
		List<WebElement> mobPrice = driver.findElements(By.xpath("//div[@class='a-section']//a//span[@class='a-price-whole']"));
		List<WebElement> currency = driver.findElements(By.xpath("//div[@class='sg-row']//span[@class='a-price-symbol']"));
		
		
		for(int i=0; i< mobNames.size();i++)
		{
			System.out.println("Product:" +mobNames.get(i).getText());
			System.out.println("Price:" +currency.get(i).getText()+ " "  +mobPrice.get(i).getText());
			
		}
		
		
		/*for (WebElement mobileNames: mobNames) {
			System.out.println(mobileNames.getText());
		} */
		

		

	}

}
