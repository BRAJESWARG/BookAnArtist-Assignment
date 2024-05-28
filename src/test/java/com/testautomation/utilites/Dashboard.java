package com.testautomation.utilites;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dashboard {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://hireanartist.com.au/post-a-job");

		Thread.sleep(3000);

		WebElement projectName = driver.findElement(By.id("project_name"));
		projectName.isDisplayed();
		projectName.isEnabled();
		projectName.sendKeys("Public Window Mural – Canada.");
//		projectName.sendKeys(Keys.TAB);
//		projectName.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		WebElement selectKindofArt = driver.findElement(By.xpath("//*[@id=\"category_id\"]/label[1]/span[2]"));
		selectKindofArt.click();
		Thread.sleep(3000);

		WebElement selectMuralGo = driver.findElement(By.xpath("//*[@id=\"mural_on\"]/div/div[1]/label/span[1]/input"));
		selectMuralGo.click();
		Thread.sleep(3000);

		WebElement setWidth = driver.findElement(By.id("width"));
		setWidth.sendKeys("5");
		Thread.sleep(3000);

		WebElement setHeight = driver.findElement(By.id("height"));
		setHeight.sendKeys("5");
		Thread.sleep(3000);

		WebElement setUnitofSize = driver.findElement(By.xpath("//*[@id=\"unit\"]/label[2]"));
		setUnitofSize.click();
		Thread.sleep(3000);
		setUnitofSize.click();
		Thread.sleep(3000);

//		WebElement clickLocation= driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/form/div[1]/div[5]/div/div/div/div/div/div/span/input"));
//		clickLocation.sendKeys("Canada Bay NSW, Australia");
//		WebElement setLocation= driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/form/div[1]/div[5]/div/div/div/div/div/div/span/input"));
//		setLocation.click();
//		Thread.sleep(3000);

//		Select objSelect =new Select(driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/form/div[1]/div[5]/div/div/div/div/div/div/span/input")));
//		objSelect.selectByVisibleText("Canada Bay NSW, Australia");

		WebElement setPropertyType = driver.findElement(By.xpath("//*[@id=\"property_type\"]/label[3]"));
		setPropertyType.click();
		Thread.sleep(3000);

		WebElement clickSubmit = driver.findElement(By.xpath(
				"//button[@class=\"ant-btn css-6rzz9k ant-btn-primary custom-btn custom-btn__long btn__solid-primary\"]"));
		clickSubmit.click();
		Thread.sleep(3000);
		clickSubmit.click();
		Thread.sleep(3000);

		Thread.sleep(3000);
		driver.quit();

	}

}