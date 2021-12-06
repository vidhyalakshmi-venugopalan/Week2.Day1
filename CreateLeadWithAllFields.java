package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadWithAllFields {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
		
		//Enter First Name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Preethi");
		
		//Enter Last Name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vidhya");
		
		//Select Source
		WebElement eleDropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select select = new Select(eleDropdown);
		select.selectByVisibleText("Employee");
		
		//Select Makketing campaign
		WebElement marDropDown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marsel = new Select(marDropDown);
		marsel.selectByValue("CATRQ_CARNDRIVER");
		
		//Enter First Name Local
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Vid");
		
		//Enter Last Name Local
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Rahul");
		
		//Enter Salutation
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mrs");
		
		//Enter Birth Date
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("01/12/1991");
		
		//Enter Title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Dr");
		
		//Enter Department
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Engineer");
		
		//Enter Annual Revenue
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("12L");
		
		//Select Preferred currency
		WebElement curDropDown = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select cursel = new Select(curDropDown);
		cursel.selectByIndex(2);
		
		//Select Industry
		WebElement indDropdown = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select indsel = new Select(indDropdown);
		indsel.selectByVisibleText("Computer Software");
		
		//Enter No of Employees
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("500");
		
		//Select Ownership
		WebElement ownDropDown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownsel = new Select(ownDropDown);
		ownsel.selectByIndex(4);
		
		//Enter SIC code
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("60500");
		
		//Enter Ticket Symbol
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("---");
		
		//Enter Description
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Create Lead form");
		
		//Enter Important Note
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Important Note");
		
		//Enter Country Code
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("1");
		
		//Enter Area Code
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("123");

		//Enter Phone number
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9677292546");
		
		//Enter Extension
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("+91");
		
		//Enter Person to Ask for
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Preethi");
		
		//Enter Email address
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("preethi.vidhya@yahoo.com");
		
	    //Enter Web URL
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("preethi@amazon.com");
		
		//Enter To Name
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Preethi");
		
		//Enter Attention Name
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Pre");
		
		//Enter Address Line 1
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No:10 Lake Avenue");
		
		//Enter Address Line 2
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("AZ");
		
		//Enter City
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Dallas");
		
		//Select State
		WebElement stateDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select statedsel = new Select(stateDropdown);
		statedsel.selectByVisibleText("Texas");
		
		//Enter Zip code
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("10001");
		
		//Select Country
		WebElement counDropdown = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select coundsel = new Select(counDropdown);
		coundsel.selectByVisibleText("United States");
		
		//Enter postal code extension
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("12");
		
		driver.findElement(By.name("submitButton")).click();

		//Get First Name
		String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("The First Name is " + firstName);
		
		//Get Ttitle
		String title = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		System.out.println("The Title is " + title);
	}

}
