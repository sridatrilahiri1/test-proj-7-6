package com.sridatri.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class FirstPageTest {

	
WebDriver driver;

@Test
public void testIt() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sayantan\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();

	driver.manage().window().maximize();
	
	driver.get("https://www.dbs.com.sg/personal/marketplace/travel");
	
//Travel
	WebElement Travel = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div/div/div[2]/div[2]/div[1]/div/div[1]/div[3]/a"));
	Travel.click();
	
//Flights
	WebElement Flights = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[1]/div[2]/div[2]/div[1]/div/button[1]"));
	Flights.click();
	
//Radiobuttons for round trip and onwway trip	
	WebElement RoundTripRadioButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[1]/div[2]/div[2]/div[2]/form/div[1]/label[1]"));
			RoundTripRadioButton.isSelected();
			
	
	WebElement OneWayTripRadioButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[1]/div[2]/div[2]/div[2]/form/div[1]/label[2]"));
	OneWayTripRadioButton.click();
	
//Source	
	//Action action = new Actions(driver)
	//WebElement From = driver.findElement(By.xpath("//*[@id=\"locationOrigin-input\"]"));
	//From.isSelected();
	
	WebElement From = driver.findElement(By.xpath("//*[@id=\"locationOrigin-input\"]"));
	From.sendKeys("Berlin - TXL");
	From.click();
	//Select Fr = new Select(From);
	//Fr.selectByVisibleText("Berlin - TXL");
//Destination	
	
	WebElement To = driver.findElement(By.xpath("//*[@id=\"locationDestination-input\"]"));
	To.sendKeys("Kolkata - CCU");
	//Select Tr = new Select(To);
	//Tr.selectByVisibleText("Kolkata - CCU");
	
//clicking Datepicker Departing date
	WebElement DatePicker = driver.findElement(By.xpath("//*[@id=\"SingleDatePicker-undefined\"]"));
	DatePicker.click();
	
	/*
	 * //changing months in datepickernext month
	 * 
	 * WebElement DatePickerNextBtn = driver.findElement(By.xpath("//*[@id="app"]/div/div[2]/div/div[1]/div[2]/div[2]/div[2]/form/div[2]/div[2]/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div[1]/div[2]/img"));
	 * DatePickerNextBtn.click();
	 * 
	 * //Select the particular date
	 *  WebElement DatePickerSelectDt = driver.findElement(By.xpath("//*[@id="app"]/div/div[2]/div/div[1]/div[2]/div[2]/div[2]/form/div[2]/div[2]/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[3]/td[3]"));
	 * DatePickerSelectDt.click();
	 * 
	 * 
	 * } //Class 
	 * 
	 * WebElement Class = driver.findElement(By.xpath("//*[@id="app"]/div/div[2]/div/div[1]/div[2]/div[2]/div[2]/form/div[2]/div[3]/div/div/div/div/input"));
	 * Class.isSelected();
	 * 
	 *  //AdultPassengers 
	 *  //*[@id="app"]/div/div[2]/div/div[1]/div[2]/div[2]/div[2]/form/div[2]/div[3]/div/div/div/div/div/div[2]/div[2]/div[1]
	 *  
	 *  WebElement AdultPassengers = driver.findElement(By.xpath("//*[@id="app"]/div/div[2]/div/div[1]/div[2]/div[2]/div[2]/form/div[2]/div[3]/div/div/div/div/div/div[2]/div[2]/div[1]/span[2]/div[2]/img"));
	 *  AdultPassengers.click();
	 *  
	 *  //ChildPassengers
	 *  
	 *  WebElement ChildPassengers = driver.findElement(By.xpath("//*[@id="app"]/div/div[2]/div/div[1]/div[2]/div[2]/div[2]/form/div[2]/div[3]/div/div/div/div/div/div[2]/div[2]/div[2]/span[2]/div[2]));
	 *  ChildPassengers.click();
	 *  
	 *  //ClassAndPassengers
	 *   
	 *  WebElement ClassAndPassengers = driver.findElement(By.xpath("//*[@id="app"]/div/div[2]/div/div[1]/div[2]/div[2]/div[2]/form/div[2]/div[3]/div/div/div/div/input"));
	 * ClassAndPassengers.isSelected();
	 * 
	 *  //SelectFlight
	 *  
	 *  WebElement SelectFlightBtn = driver.findElement(By.xpath("//*[@id="app"]/div/div[2]/div/div[1]/div[2]/div[2]/div[2]/form/input"));
	 *  SelectFlightBtn.click();
	 */
	}

}
