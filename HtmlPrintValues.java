package assignment.week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HtmlPrintValues {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement libraryname = driver.findElement(By.xpath("((//table)[1]//tr)[2]/td[1]"));
		String library1 = libraryname.getText();
		System.out.println(library1);
		List<String> valuesofmarket = new ArrayList<String>();
		for (int i = 2; i <= 4; i++) {
			String ms = driver.findElement(By.xpath("((//table)[1]//tr)[2]/td[" + i + "]")).getText();
			valuesofmarket.add(ms);
		}
		System.out.println("Values are: " + valuesofmarket);
		WebElement libraryname2 = driver.findElement(By.xpath("((//table)[1]//tr)[3]/td[1]"));
		String library2 = libraryname2.getText();
		System.out.println(library2);
		List<String> valuesofabsoluteusage = new ArrayList<String>();
		for (int j = 2; j <= 4; j++) {
			String library21 = driver.findElement(By.xpath("((//table)[1]//tr)[3]/td[" + j + "]")).getText();
			valuesofabsoluteusage.add(library21);
		}
		System.out.println("Values are : " + valuesofabsoluteusage);
	}

}