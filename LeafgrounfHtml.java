package assignment.week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgrounfHtml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Get the count of number of rows
		int row = driver.findElements(By.xpath("//table//tr")).size();
		System.out.println("No.of rows: "+row);
		//Get the count of number of columns
		int columns = driver.findElements(By.xpath("//table//th")).size();
		System.out.println("No.of columns: "+columns);
		//Get the progress value of 'Learn to interact with Elements'

		for (int i = 3; i <=5; i++) {
		List<WebElement> columnsize= driver.findElements(By.xpath("//table//tr["+i+"]//td"));
		int size = columnsize.size();
		for (int j = 1; j <size; j++) {
		String text2 = driver.findElement(By.xpath("//table//tr["+i+"]//td["+j+"]")).getText();
		System.out.println(text2);
				
			}
		//Check the vital task for the least completed progress.
			List<WebElement> leastprogress = driver.findElements(By.tagName("tr"));	
			
			System.out.println("The least completed progress:"+leastprogress.get(i).getText());
		}

	
}
	}


