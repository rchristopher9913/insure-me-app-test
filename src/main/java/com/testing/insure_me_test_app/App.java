package com.testing.insure_me_test_app;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
	

    public static void main( String[] args ) throws InterruptedException
    {
//initialize the chrome driver
		ChromeOptions options = new ChromeOptions();
    	options.addArguments("--headless");
    	
	 	WebDriver driver = new ChromeDriver(options);
	 	
	 	//open the web application
        driver.get("http://18.222.0.17:8081/contact.html");
        
        
        String title = driver.getTitle();
        System.out.println(title);
        
        //1. Locate and Enter Name
        WebElement name = driver.findElement(By.id("inputName"));
        name.sendKeys("Shubham");
        
        String printName = driver.findElement(By.id("inputName")).getText();
        
        System.out.println();
        
        //2. Locate and Enter Contact
        WebElement number = driver.findElement(By.id("inputNumber"));
        number.sendKeys("999999999");
        System.out.println(number.getText().toString());
        
        //3. Locate Email and Enter Email
        WebElement mail = driver.findElement(By.id("inputMail"));
        mail.sendKeys("shubham@xyz.com");
        System.out.println(mail.getText());
        
        //4. Locate Message and Enter Message
        WebElement message = driver.findElement(By.id("inputMessage"));
        message.sendKeys("Hello, How are you ?");
        System.out.println(message.getText());
        
        Thread.sleep(2000);
        
        //5. Locate Send Button and click to send the message.
        WebElement sendButton = driver.findElement(By.id("my-button"));
        sendButton.click();
        Thread.sleep(2000);
        
        String response = driver.findElement(By.id("response")).getText();
        System.out.println(response);
        
        
        driver.quit();

        
    }
}
