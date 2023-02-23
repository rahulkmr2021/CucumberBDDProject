package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjecs.PageObject;

public class StepDef extends BaseClass {



	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		obj = new PageObject(driver);
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	}

	@When("User enters Url as {string}")
	public void user_enters_url_as(String url) throws InterruptedException {
		Thread.sleep(3000);
		driver.get(url);
	}

	@When("User Enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String user, String pass) throws InterruptedException {
		Thread.sleep(3000);
		obj.login(user, pass);
		
		
	}

	@When("Click on Login")
	public void click_on_login() throws InterruptedException {
	
		
	}

	@When("User clicks on Add Firm")
	public void user_clicks_on_add_firm() throws InterruptedException {
		Thread.sleep(3000);
		obj.Add_Firm();
	}

	@When("User Enters {string}, {string}, {string}, {string},{string},{string} and {string}")
	public void user_enters_and(String string, String string2, String string3, String string4, String string5, String string6, String string7) throws InterruptedException {
		Thread.sleep(4000);
		obj.Firm_Name(string);
		obj.Firm_Type();
		obj.Street_Address01(string2);
		obj.Street_Address02(string3);
		obj.City(string4);
		obj.State();
		obj.Zip(string5);
		obj.WebSite(string6);
		obj.Phone(string7);
	}

	@When("click on Save button")
	public void click_on_save_button() throws InterruptedException {
		Thread.sleep(3000);
		obj.Firm_Save();
	}

	@Then("User click search button")
	public void user_click_search_button() throws InterruptedException {
		Thread.sleep(3000);
		obj.Search();
	}

	@Then("Click to Export all data to Excel button")
	public void click_to_export_all_data_to_excel_button() throws InterruptedException {
		Thread.sleep(3000);
		obj.Export_File();
	}

	@When("User clicks on Edit Firm")
	public void user_clicks_on_edit_firm() throws InterruptedException {
		Thread.sleep(3000);
		obj.Edit_Firm();
	}

	@When("Enters update details {string}, {string}, {string}, {string},{string},{string} and {string}")
	public void enters_update_details_and(String string, String string2, String string3, String string4, String string5, String string6, String string7) throws InterruptedException {
	     Thread.sleep(4000);
		obj.Firm_Name01(string);
		obj.Firm_Type01();
		obj.StreetAdrs01(string2);
		obj.StreetAdrs02(string3);
		obj.City01(string4);
		obj.States01();
		obj.Zip01(string5);
		obj.WebSite01(string6);
		obj.Phone01(string7);
	}

	@Then("User click on Save button")
	public void click_on_save_button01() throws InterruptedException {
		Thread.sleep(3000);
		obj.Firm_Update();
	}

	@When("User click on Edit Button")
	public void user_click_on_edit_button() throws InterruptedException {
		Thread.sleep(3000);
		obj.Edit_Contact();
	}

	@When("Click on Contacts")
	public void click_on_contacts() throws InterruptedException {
		Thread.sleep(3000);
		obj.Contact();
	}

	@When("Click on Add Contacts")
	public void click_on_add_contacts() throws InterruptedException {
		Thread.sleep(3000);
		obj.Add_Contact();
	}

	@Then("User Enters  Contact Details {string}, {string},{string},{string},{string},{string},{string} and {string}")
	public void user_enters_contact_details_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) throws InterruptedException {
		
		Thread.sleep(4000);
		obj.First_Name(string);
		obj.Last_Name(string2);
		obj.Title(string3);
		obj.EmailAdd(string4);
		obj.Phn_Num(string5);
		obj.Extension(string6);
		obj.mobile(string7);
		obj.Contact_Notes(string8);
	}

	@Then("Click on Save button")
	public void click_on_save_button02() throws InterruptedException {
		Thread.sleep(3000);
		obj.contact_save();
	}

	@When("User click on update Edit Button")
	public void user_click_on_update_edit_button() throws InterruptedException {
		Thread.sleep(3000);
		obj.Edit_Contactt();
	}

	@When("Enters  Contact Details {string}, {string},{string},{string},{string} ,{string},{string} and {string}")
	public void enters_contact_details_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) throws InterruptedException {
          Thread.sleep(5000);
		obj.First_Name01(string);
		obj.Last_Name01(string2);
		obj.Title01(string3);
		obj.EmailAdd01(string4);
		obj.Phone001(string5);
		obj.Exten01(string6);
		obj.Mobile01(string7);
		obj.Contact_Notes01(string8);
	}

	@Then("Click on update Save button")
	public void click_on_update_save_button() throws InterruptedException {
		Thread.sleep(3000);
		obj.Contact_Update();
	}
}




