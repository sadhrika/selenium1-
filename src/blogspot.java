import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.tools.javac.util.List;



public class blogspot {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Sadhrika481\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(); 
	
         driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS );
       driver.manage().window().maximize();	
       String baseurl="https://only-testing-blog.blogspot.com/2014/01/textbox.html";        		
         driver.get(baseurl);
         
           driver.findElement(By.name("fname")).sendKeys("sadhrika");
         
         driver.findElement(By.name("Hidden")).sendKeys("kalamar");
         driver.findElement(By.id("check2")).click();
         driver.findElement(By.id("radio2")).click();
         driver.findElement(By.name("img")).sendKeys("E:\\Sadhrika481");
         WebElement element = driver.findElement(By.id("Carlist"));
         Select s= new Select(element);
          s.selectByValue("Audi Car");
          
WebElement  SelectedBox =driver.findElement(By.id("//select[@name='FromLB']"));

WebElement MoveOpt =driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
Select s1 =new Select(SelectedBox);
List<WebElement> li =s1.getOptions();

Thread.sleep(500);
MoveOpt.click();
Thread.sleep(100);


//WebElement  element2 =driver.findElement(By.id("//select[@name='ToLB']]"));
//Select s2= new Select(element1);

	}

}
