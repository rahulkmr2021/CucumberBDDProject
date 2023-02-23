package pageObjecs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageObject  {
	WebDriver ldriver;
	

	public PageObject(WebDriver rDriver)
	{
		ldriver=rDriver;

		PageFactory.initElements(rDriver, this);
		ldriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@FindBy(xpath="//input[@type='email']")
	WebElement Email;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement Password;
	
	@FindBy(xpath = "//button[@class='btn-submit']")
	WebElement LoginBtn;
	
	@FindBy(xpath="//button[@class='Add-button']")
	WebElement add_firm;
	
	@FindBy(xpath="//input[@placeholder='Firm Name']")
	WebElement firm_Name;
	
	@FindBy(xpath="(//select[@class='form-select'])[1]")
	WebElement firm_Type;
	
	@FindBy(xpath="(//input[@id='inputAddress'])[1]")
	WebElement street_ads01;
	
	@FindBy(xpath="(//input[@name='street_address_2'])[1]")
	WebElement street_ads02;
	
	@FindBy(xpath="(//input[@id='inputCity'])[1]")
	WebElement city;
	
	@FindBy(xpath="(//select[@id='states'])[1]")
	WebElement state;
	
	@FindBy(xpath="(//input[@id='inputZip'])[1]")
	WebElement zip;
	
	@FindBy(xpath="(//input[@placeholder='Website'])[1]")
	WebElement  website;
	
	@FindBy(xpath="(//input[@id='validationCustom03'])[1]")
	WebElement phone;
	
	@FindBy(xpath="(//button[normalize-space()='Save'])[1]")
	WebElement firm_save;
	
	@FindBy(xpath="(//input[@aria-label='Search in the data grid'])[1]")
	WebElement search;
	
	@FindBy(xpath="(//i[@class='dx-icon dx-icon-xlsxfile'])[1]")
	WebElement export_file;
	
	@FindBy(xpath="(//a[normalize-space()='Yoga'])[1]")
	WebElement edit_firm;
	
	@FindBy(xpath="(//input[@placeholder='Firm Name'])[1]")
	WebElement firm_Name01;
	
	@FindBy(xpath="(//select[@id='firmType'])[1]")
	WebElement firm_Type01;
	
	@FindBy(xpath="(//input[@id='inputAddress'])[1]")
	WebElement streetadrs01;
	
	@FindBy(xpath="(//input[@name='street_address_2'])[1]")
	WebElement streetadrs02;
	
	@FindBy(xpath="(//input[@id='inputCity'])[1]")
	WebElement city01;
	
	@FindBy(xpath="(//select[@id='states'])[1]")
	WebElement states01;
	
	@FindBy(xpath="(//input[@id='inputZip'])[1]")
	WebElement zip01;
	
	@FindBy(xpath="(//input[@placeholder='Website'])[1]")
	WebElement website01;
	
	@FindBy(xpath="(//input[@id='validationCustom03'])[1]")
	WebElement phone01;
	
	@FindBy(xpath="(//button[normalize-space()='Update'])[1]")
	WebElement firm_update;
	
	@FindBy(xpath="(//a[normalize-space()='Yoga'])[1]")
	WebElement Editcontact;
	
	@FindBy(xpath="(//button[normalize-space()='Contacts'])[1]")
	WebElement contact;

	
	@FindBy(xpath="(//button[normalize-space()='Add Contacts'])[1]")
	WebElement add_contact;
	
	@FindBy(xpath="(//input[@id='firstName'])[1]")
	WebElement first_name;
	
	@FindBy(xpath="(//input[@id='lastName'])[1]")
	WebElement last_name;
	
	@FindBy(xpath="(//input[@id='title'])[1]")
	WebElement title;
	
	@FindBy(xpath="(//input[@id='email'])[1]")
	WebElement emailAdd;
	
	@FindBy(xpath="(//input[@id='phone'])[1]")
	WebElement phn;
	
	@FindBy(xpath="(//input[@id='extension'])[1]")
	WebElement exten;
	
	@FindBy(xpath="(//input[@id='mobile'])[1]")
	WebElement mobile;
	
	@FindBy(xpath="(//textarea[@id='contactNotes'])[1]")
	WebElement contact_notes;
	
	@FindBy(xpath="(//button[@type='submit'][normalize-space()='Save'])[1]")
	WebElement contact_save;
	
	@FindBy(xpath="(//a[@class='anchorId'])[1]")
	WebElement edit_contact;
	
	@FindBy(xpath="(//input[@id='firstName'])[1]")
	WebElement first_name01;
	
	@FindBy(xpath="(//input[@id='lastName'])[1]")
	WebElement last_name01;
	
	@FindBy(xpath="(//input[@id='title'])[1]")
	WebElement title01;
	
	@FindBy(xpath="(//input[@id='email'])[1]")
	WebElement emailAdd01;
	
	@FindBy(xpath="(//input[@id='phone'])[1]")
	WebElement phn01;
	
	@FindBy(xpath="(//input[@id='extension'])[1]")
	WebElement exten01;
	
	@FindBy(xpath="(//input[@id='mobile'])[1]")
	WebElement mobile01;
	
	
	@FindBy(xpath="(//textarea[@id='contactNotes'])[1]")
	WebElement contact_notes01;
	
	@FindBy(xpath="(//button[@type='submit'][normalize-space()='Update'])[2]")
	WebElement contact_update;
	
	

	
	/*public void enterEmail(String emailAdd) throws InterruptedException {
		Thread.sleep(3000);
		Email.sendKeys(emailAdd);
	}
	
	public void enterPassword(String pwd) throws InterruptedException {
		Thread.sleep(3000);
		Password.sendKeys(pwd);
	}
	
	public void clickLogin() throws InterruptedException {
		Thread.sleep(3000);
		LoginBtn.click();
	}   */
	public void login(String email,String pass) {
		
       Email.sendKeys(email);
       Password.sendKeys(pass);
       LoginBtn.click();
       
	}
	
	public void Add_Firm() throws InterruptedException {
		Thread.sleep(3000);
		add_firm.click();
	}
	
	public void Firm_Name(String name) throws InterruptedException {
		Thread.sleep(3000);
		
		firm_Name.sendKeys(name);
	}
	
	public void Firm_Type() throws InterruptedException {
		Thread.sleep(3000);
		Select S = new Select(firm_Type);
		S.selectByIndex(4);
	}
	
	public void Street_Address01(String add01) throws InterruptedException {
		Thread.sleep(3000);
		street_ads01.sendKeys(add01);
	}
	
	public void Street_Address02(String add02) throws InterruptedException {
		Thread.sleep(3000);
		street_ads02.sendKeys(add02);
	}
	
	public void City(String cit) throws InterruptedException {
		Thread.sleep(3000);
		city.sendKeys(cit);
	}
	
	public void State() throws InterruptedException {
		Thread.sleep(3000);
		Select S2 = new Select(state);
		S2.selectByValue("4");
		
	}
	
	public void Zip(String zp) throws InterruptedException {
		Thread.sleep(3000);
		zip.sendKeys(zp);
		
	}
	
	public void WebSite(String web) throws InterruptedException {
		Thread.sleep(3000);
		website.sendKeys(web);
	}
	
	public void Phone(String phn) throws InterruptedException {
		Thread.sleep(3000);
		phone.sendKeys(phn);
	}
	
	public void Firm_Save() throws InterruptedException {
		Thread.sleep(3000);
		firm_save.click();
	}
	
	public void Search() {
		search.click();
		
	}
	
	public void Export_File() {
		export_file.click();
	}
	
	public void Edit_Firm() {
		edit_firm.click();
	}
	
	public void Firm_Name01(String name1) {
		firm_Name01.clear();
		firm_Name01.sendKeys(name1);
	}
	
	public void Firm_Type01() {
		Select S3 = new Select(firm_Type01);
	//S3.deselectAll();
	S3.selectByIndex(5);
	}
	
	public void StreetAdrs01(String adrs1) {
		streetadrs01.clear();
		streetadrs01.sendKeys(adrs1);
	}
	
	public void StreetAdrs02(String adrs2) {
		streetadrs02.clear();
		streetadrs02.sendKeys(adrs2);
	}
	
	public void City01(String cit1) {
		city01.clear();
		city01.sendKeys(cit1);
	}
	
	public void States01() {
		Select S4 = new Select(states01);
		//S4.deselectAll();
		S4.selectByIndex(6);
	}
	
	public void Zip01(String zp1) {
		zip01.clear();
		zip01.sendKeys(zp1);
	}
	
	public void WebSite01(String web01) {
		website01.clear();
		website01.sendKeys(web01);
	}
	
	public void Phone01(String phn01) {
		phone01.clear();
		phone01.sendKeys(phn01);
	}
	
	public void Firm_Update() {
		firm_update.click();
	}
	
	public void Edit_Contact() {
		Editcontact.click();
	}
	
	public void Contact() {
		contact.click();
	}
	
	public void Add_Contact() {
		add_contact.click();
	}
	
	public void First_Name(String fname) {
		first_name.sendKeys(fname);
		
	}
	
	public void Last_Name(String lname) {
		last_name.sendKeys(lname);
	}
	
	public void Title(String til) {
		title.sendKeys(til);
	}
	
	public void EmailAdd(String eadd) {
		emailAdd.sendKeys(eadd);
	}
	
	public void Phn_Num(String phn1) {
		phn.sendKeys(phn1);
	}
	
	public void Extension(String ext) {
		exten.sendKeys(ext);
	}
	
	public void mobile(String mob) {
		mobile.sendKeys(mob);
	}
	
	public void Contact_Notes(String contact) {
		contact_notes.sendKeys(contact);
	}
	
	public void contact_save() {
		contact_save.click();
	}
	
	public void Edit_Contactt() {
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click",edit_contact);
		
	}
	
	public void First_Name01(String fname1){
		first_name01.clear();
		first_name01.sendKeys(fname1);
	}
	
	public void Last_Name01(String lname1) {
		last_name01.clear();
		last_name01.sendKeys(lname1);
	}
	
	public void Title01(String til1) {
		title01.clear();
		title01.sendKeys(til1);
	}
	
	public void  EmailAdd01(String eadd1) {
		emailAdd01.clear();
		emailAdd01.sendKeys(eadd1);
	}
	
	public void Phone001(String phn2) {
		phn01.click();
		phn01.sendKeys(phn2);
	}
	
	public void Exten01(String ext01) {
		exten01.clear();
		exten01.sendKeys(ext01);
	}
	
	public void Mobile01(String mob1) {
		mobile01.clear();
		mobile01.sendKeys(mob1);
	}
	
	public void Contact_Notes01(String notes1) {
		contact_notes01.clear();
		contact_notes01.sendKeys(notes1);
	}
	
	public void Contact_Update() {
		contact_update.click();
	}
	
	
	///////////////////////////////
	
	
	
	
	
	
	

}
	


