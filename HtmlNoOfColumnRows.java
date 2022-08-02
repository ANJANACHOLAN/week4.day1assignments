package assignment.week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HtmlNoOfColumnRows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://html.com/tags/table/");// Launch the url
		
		// Table1&2: Get the count of number of rows
		
		List<WebElement> totalnoOfrows = driver.findElements(By.tagName("tr"));
		int rowsize = totalnoOfrows.size();
		System.out.println("Total no.of rows size:" +rowsize);
		
		
		// Table1&2: Get the count of number of columns
		
		List<WebElement> totalnoOfcolmns = driver.findElements(By.tagName("th"));
		int colsize = totalnoOfcolmns.size();
		System.out.println("Total no.of column size:"+colsize);
		

	}

}

