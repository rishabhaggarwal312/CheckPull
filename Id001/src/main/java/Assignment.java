import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Searchtext ="jalan technologies";
	    System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		
			driver.get("http://www.google.com");
			driver.manage().window().maximize();	
			driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Searchtext);
			driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
			///Check result is displaying same Text as searched in search box of result page
			if (Searchtext.equals(driver.findElement(By.xpath("//input[@aria-label='Search']")).getAttribute("value")))
					{
					System.out.println("Displaying same text as searched");
					}
			
			//Check Result is displaying total number of record and time taken in result page and find out the timing to check if it took more time 
			if(driver.findElement(By.xpath("//div[@id='result-stats']")).isDisplayed())
			{
				System.out.println("Number of record and time taken to search is displayed");
			}
			
			System.out.println(driver.findElement(By.xpath("//div[@id='result-stats']")).getText());
			
			//Check clear button is visible or not  in search result page
			
			if(driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[1]/div[1]/div[2]/div/div[3]/div[1]/span[1]")).isDisplayed())
					{
				System.out.println("clear button is present in searched Page");
					}
				
			//Check search by voice  button is visible or not  in search result page
			
			
					if(driver.findElement(By.xpath("//div[@aria-label='Search by voice']")).isDisplayed())
							{
						System.out.println("search by voice is present");
							}

	}

}
