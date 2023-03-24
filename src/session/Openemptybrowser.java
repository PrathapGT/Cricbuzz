package session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Openemptybrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "‪‪‪‪‪‪‪‪C:\\Users\\home\\Desktop\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com\r\n"
				 );
		driver.manage().window().maximize();
	}

}
