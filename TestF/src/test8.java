import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.android.AndroidDriver;

public class test8 {

	public static void main(String args[]) throws InterruptedException{
		
		//模拟QQ自动点赞

        
		WebDriver driver = new AndroidDriver();
		driver.get("http://ui.ptlogin2.qzone.com/cgi-bin/login?style=9&appid=549000929&daid=147&pt_no_auth=1&s_url=http%3A%2F%2Fm.qzone.com%2Finfocenter%3Fg_f%3D");
		
		
		
		//Thread.sleep(5000);
		
		/*WebElement button = driver.findElement(By.id("guideSkip"));
        
        button.click();
        
        Thread.sleep(100000);
        
        
        /*driver.findElement(By.linkText("赞")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("guideSkip")).click();
		//Thread.sleep(1000);
	    driver.findElement(By.id("u")).clear();
	    driver.findElement(By.id("u")).sendKeys("");
	    driver.findElement(By.id("p")).clear();
	    driver.findElement(By.id("p")).sendKeys("");
	    driver.findElement(By.id("go")).click();
	    Thread.sleep(2000);*/
	    
	    driver.findElement(By.id("guideSkip")).click();
	    
	    driver.findElement(By.id("u")).clear();
	    driver.findElement(By.id("u")).sendKeys("your account");
	    driver.findElement(By.id("p")).clear();
	    driver.findElement(By.id("p")).sendKeys("your password");
	    driver.findElement(By.id("go")).click();
	    Thread.sleep(10000);
	    
	    int i = 0;
	    
	    /*driver.findElement(By.linkText("赞")).click();
	   
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("赞")).click();*/
	    
	    //driver.findElement(By.xpath("(//a[contains(text(),'赞')])[3]")).click();
	    //Thread.sleep(1000);
	    driver.findElement(By.xpath("(//a[contains(text(),'赞')])[2]")).click();

	    //Thread.sleep(1000);
	    driver.findElement(By.xpath("(//a[contains(text(),'赞')])[1]")).click();
	    //Thread.sleep(1000);
	    
	    for(i=3;i<10;i++){
	    WebElement w3 =  driver.findElement(By.xpath("(//a[contains(text(),'赞')])"+"["+i+"]"));
	    
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", w3);
	    
	    w3.click();
	    
	    //Thread.sleep(500);
	    }
	}
	
}
