package com.stepdefinition;

import java.time.Duration;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.adactinbookingconfirmpojo.AdactinBookingConfirmPojo;
import com.adactinbookinghotelpojo.AdactinBookingHotelPojo;
import com.adactinloginerrorpagepojo.AdactinLoginErrorPagePojo;
import com.adactinloginpojo.AdactinLoginPojo;
import com.adactinsearchhotelpojo.AdactinSearchHotelPojo;
import com.adactinselecthotelpojo.AdactinSelectHotelPojo;
import com.base.ReUsableClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class StepDefinitionClass extends ReUsableClass {

	public static WebDriver driver;
	
	
	private WebElement noOfRoomsDropdown;
	
	private WebElement adultsPerRoom;
	private WebElement hotelName;
	private WebElement ccType;
	private WebElement ccExpMonth;
	private WebElement ccExpYear;
	private WebElement orderNo;

	AdactinLoginPojo ALP;	
	AdactinSearchHotelPojo ASHP;
	public WebElement locationDropdown;
	public WebElement roomsDropdown;
	public WebElement adultsperRoom2;
	private String actualABHPUrl;
	private WebElement ccTypeDropdown;
	private WebElement monthDropdown;
	private WebElement yearDropdown;
private String OrderNo;


private List<Map<String, String>> asMaps;


private boolean contains;



	
	
	@Given("User launch Adactin Hotel web application")
	public void user_launch_Adactin_Hotel_web_application() {
		
		//These logics are written in HooksClass as @Before
		/*WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();*/
	    
	}
	
	@Then("User verify Adactin Hotel Login page is displayed")
	public void user_verify_Adactin_Hotel_Login_page_is_displayed() {
	   
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		/*String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://adactinhotelapp.com/";
		
		Assert.assertEquals(actualUrl, expectedUrl);
		System.out.println(actualUrl);*/
		
		waitImplicit(3);
		String actualUrl = getPageUrl();
		String expectedUrl = "https://adactinhotelapp.com/";
		
		Assert.assertEquals(actualUrl, expectedUrl);
		System.out.println(actualUrl);
		
	}

	/*@When("User enters valid username and valid password")
	public void user_enters_valid_username_and_valid_password() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.id("username")).sendKeys("Arjun01UG");
		driver.findElement(By.id("password")).sendKeys("arjun@UG");
		
		//The below methods are ReUsable methods
		waitImplicit(3);
		ALP = new AdactinLoginPojo();
		type(ALP.getTextUsername(),"Arjun01UG");
		type(ALP.getTextPassword(),"arjun@UG");
		
	}*/
	
	@When("User enters valid & invalid Credentials")
	public void user_enters_valid_invalid_Credentials(io.cucumber.datatable.DataTable dataTable) {
		
		//Using DataTable concept 2D with Header - asMaps()
		
		ALP = new AdactinLoginPojo();
		asMaps = dataTable.asMaps();
		type(ALP.getTextUsername(),asMaps.get(2).get("userName"));
		type(ALP.getTextPassword(),asMaps.get(2).get("passWord"));
	}
	
	
	@And("User clicks Login button")
	public void user_clicks_Login_button() {
		
		//driver.findElement(By.id("login")).click();
		
		ALP = new AdactinLoginPojo();
		btnClick(ALP.getButtonLogin());
	}
	
	@Then("User verifies the Invalid Login details page")
	public void user_verifies_the_Invalid_Login_details_page() {
	
		
		AdactinLoginErrorPagePojo ALEPP = new AdactinLoginErrorPagePojo();
		waitImplicit(5);
		String actualInvalid = text(ALEPP.getTextInvalid());
		contains = actualInvalid.contains("Invalid");
		System.out.println(contains);
		String expectedInvalid = "Invalid Login details or Your Password might have expired. Click here to reset your password";
		
		Assert.assertEquals(actualInvalid, expectedInvalid);
		System.out.println(actualInvalid);
	}


	/*@Then("User verify Search Hotel page is displayed")
	public void user_verify_Search_Hotel_page_is_displayed() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		String actualUrl1 = driver.getCurrentUrl();
		String expectedUrl1 = "https://adactinhotelapp.com/SearchHotel.php";
		
		Assert.assertEquals(actualUrl1, expectedUrl1);
		System.out.println(actualUrl1);
		
		waitImplicit(3);
		String actualUrl1 = getPageUrl();
		String expectedUrl1 = "https://adactinhotelapp.com/SearchHotel.php";
		
		Assert.assertEquals(actualUrl1, expectedUrl1);
		System.out.println(actualUrl1);
	   
	}

	@When("User select valid Location and No.of rooms, enters valid Check In & Check Out Date and select valid no. of Adults per Room")
	public void user_select_valid_Location_and_No_of_rooms_enters_valid_Check_In_Check_Out_Date_and_select_valid_no_of_Adults_per_Room() {
	    
	
		
		locationDropdown = driver.findElement(By.id("location"));
		Select s = new Select(locationDropdown);
		s.selectByValue("Sydney");
		
		noOfRoomsDropdown = driver.findElement(By.id("room_nos"));
		Select s1 = new Select (noOfRoomsDropdown);
		s1.selectByValue("4");
		
		driver.findElement(By.id("datepick_in")).sendKeys("15/02/2023");
		driver.findElement(By.id("datepick_out")).sendKeys("20/02/2023");
		
		adultsPerRoom = driver.findElement(By.id("adult_room"));
		Select s2 = new Select(adultsPerRoom);
		s2.selectByValue("3");
	
		
		ASHP = new AdactinSearchHotelPojo();
		locationDropdown = ASHP.getLocationDropdown();	
		selectingByValue(locationDropdown,"Sydney");
		
		roomsDropdown = ASHP.getRoomsDropdown();
		selectingByValue(roomsDropdown,"2");
		
		type(ASHP.getCheckIn(),"15/02/2023");
		type(ASHP.getCheckOut(),"20/02/2023");
		
		adultsperRoom2 = ASHP.getAdultsperRoom();
		selectingByValue(adultsperRoom2,"3");
	
	}

	@And("User clicks Search button")
	public void user_clicks_Search_button() {
	   
		//driver.findElement(By.id("Submit")).click();
		
		ASHP = new AdactinSearchHotelPojo();
		btnClick(ASHP.getButtonSearch());
		
	}

	@Then("User verify Select Hotel page is displayed")
	public void user_verify_Select_Hotel_page_is_displayed() {
		
		
	    hotelName = driver.findElement(By.xpath("//input[@value='Hotel Creek']"));
	    String actualTextHotel = hotelName.getAttribute("value");
	    String expTextHotel = "Hotel Creek";
	    boolean containsHotel = actualTextHotel.contains("Creek");
	    System.out.println(containsHotel);
	    
	    Assert.assertEquals(actualTextHotel, expTextHotel);
	    System.out.println(actualTextHotel);
		
		waitImplicit(5);
		AdactinSelectHotelPojo AslHP = new AdactinSelectHotelPojo();
		String actualText = valueAttribute(AslHP.getTextHotelCreek(),"value");
		String expectedText = "Hotel Hervey";
		
		Assert.assertEquals(actualText, expectedText);
		System.out.println(actualText);
		

	
	}

	@And("User select one of the valid hotels radio button and clicks continue button")
	public void user_select_one_of_the_valid_hotels_radio_button_and_clicks_continue_button() {
	    
		
		driver.findElement(By.id("radiobutton_2")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	    
		driver.findElement(By.id("continue")).click();
		
		AdactinSelectHotelPojo AslHP = new AdactinSelectHotelPojo();
		btnClick(AslHP.getHotelRadioButton());
		waitImplicit(2);
		btnClick(AslHP.getContinueButton());
		
	}

	@Then("User verify Book A Hotel page is displayed")
	public void user_verify_Book_A_Hotel_page_is_displayed() {
	    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String actualUrl2 = driver.getCurrentUrl();
		String expectedUrl2 = "https://adactinhotelapp.com/BookHotel.php";
		boolean bookHotel = actualUrl2.contains("BookHotel.php");
		System.out.println(bookHotel);
		
		Assert.assertEquals(actualUrl2, expectedUrl2);
		System.out.println(actualUrl2);
		
		AdactinBookingHotelPojo ABHP = new AdactinBookingHotelPojo();
		waitImplicit(3);
		actualABHPUrl = ABHP.getPageUrl();
		String expectedABHPUrl = "https://adactinhotelapp.com/BookHotel.php";
		
		Assert.assertEquals(actualABHPUrl, expectedABHPUrl);
		System.out.println(actualABHPUrl);
		
	}

	@When("User enters valid First Name, Last Name, Billing Address & Credit Card No., select the valid Credit Card Type, Expiry Date from Month and Year Dropdown and enters valid CVV Number")
	public void user_enters_valid_First_Name_Last_Name_Billing_Address_Credit_Card_No_select_the_valid_Credit_Card_Type_Expiry_Date_from_Month_and_Year_Dropdown_and_enters_valid_CVV_Number() {
	   
		
		driver.findElement(By.id("first_name")).sendKeys("Arjun");
		driver.findElement(By.id("last_name")).sendKeys("UmaGovindarajan");
		driver.findElement(By.id("address")).sendKeys("No.128/23, St.Louis lane, Melbourne.");
		driver.findElement(By.id("cc_num")).sendKeys("1234567890123456");
		
		ccType = driver.findElement(By.id("cc_type"));
		Select s3 = new Select(ccType);
		s3.selectByValue("MAST");
		
		ccExpMonth = driver.findElement(By.id("cc_exp_month"));
		Select s4 = new Select(ccExpMonth);
		s4.selectByValue("11");
	
		ccExpYear = driver.findElement(By.id("cc_exp_year"));
		Select s5 = new Select(ccExpYear);
		s5.selectByValue("2022");
		
		driver.findElement(By.id("cc_cvv")).sendKeys("3546");
		
		AdactinBookingHotelPojo ABHP = new AdactinBookingHotelPojo();
		type(ABHP.getFirstName(), "Arjun");
		type(ABHP.getLastName(), "UmaGovindarajan");
		type(ABHP.getTypeAddress(),"No.128/23, St.Louis lane, Melbourne.");
		type(ABHP.getCreditCardNo(), "1234567890123456");
		
		
		
		ccTypeDropdown = ABHP.getCcTypeDropdown();
		selectingByValue(ccTypeDropdown, "MAST");
		
		monthDropdown = ABHP.getMonthDropdown();
		selectingByValue(monthDropdown, "12");
		
		yearDropdown = ABHP.getYearDropdown();
		selectingByValue(yearDropdown, "2022");
		
		type(ABHP.getCvv(), "5656");
		
		
	
	}

	@And("User clicks Book now button")
	public void user_clicks_Book_now_button() {

		//driver.findElement(By.id("book_now")).click();
		AdactinBookingHotelPojo ABHP = new AdactinBookingHotelPojo();
		btnClick(ABHP.getButtonBookNow());
	}

	@Then("User verify Order No. is displayed")
	public void user_verify_Order_No_is_displayed() {
	   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		orderNo = driver.findElement(By.id("order_no"));
		String textOrderNo = orderNo.getAttribute("value");
		System.out.println("Order No. is "+textOrderNo);
		
		waitImplicit(5);
		AdactinBookingConfirmPojo ABCP = new AdactinBookingConfirmPojo(); 
		OrderNo = valueAttribute(ABCP.getOrderID(), "value");
		System.out.println("Order no is : "+OrderNo);
	}

	@When("User select valid {string} and {string}, enters valid {string} & {string} Date and select valid no. of {string}")
	public void user_select_valid_and_enters_valid_Date_and_select_valid_no_of(String HotelLocation, String Rooms, String CheckInDate, String CheckOutDate, String AdultsPerRoom) {
		
		
		locationDropdown = driver.findElement(By.id("location"));
		Select s = new Select(locationDropdown);
		s.selectByVisibleText(HotelLocation);
		
		noOfRoomsDropdown = driver.findElement(By.id("room_nos"));
		Select s1 = new Select (noOfRoomsDropdown);
		s1.selectByVisibleText(Rooms);
		
		driver.findElement(By.id("datepick_in")).sendKeys(CheckInDate);
		driver.findElement(By.id("datepick_out")).sendKeys(CheckOutDate);
		
		adultsPerRoom = driver.findElement(By.id("adult_room"));
		Select s2 = new Select(adultsPerRoom);
		s2.selectByVisibleText(AdultsPerRoom);
		
		
		AdactinSearchHotelPojo ASHP = new AdactinSearchHotelPojo();
		selectingByVisibleText(ASHP.getLocationDropdown(), HotelLocation);
		selectingByVisibleText(ASHP.getRoomsDropdown(), Rooms);
		type(ASHP.getCheckIn(), CheckInDate);
		type(ASHP.getCheckOut(), CheckOutDate);
		selectingByVisibleText(ASHP.getAdultsperRoom(), AdultsPerRoom);
	}

	@When("User enters valid {string}, {string}, {string} & {string}, select the valid {string}, Expiry Date from {string} and {string} Dropdown and enters valid {string} Number")
	public void user_enters_valid_select_the_valid_Expiry_Date_from_and_Dropdown_and_enters_valid_Number(String FirstName, String LastName, String Address, String CCNum, String CCType, String ExpMonth, String ExpYear, String CVV) {
		
		
		driver.findElement(By.id("first_name")).sendKeys(FirstName);
		driver.findElement(By.id("last_name")).sendKeys(LastName);
		driver.findElement(By.id("address")).sendKeys(Address);
		driver.findElement(By.id("cc_num")).sendKeys(CCNum);
		
		ccType = driver.findElement(By.id("cc_type"));
		Select s3 = new Select(ccType);
		s3.selectByVisibleText(CCType);
	
		
		ccExpMonth = driver.findElement(By.id("cc_exp_month"));
		Select s4 = new Select(ccExpMonth);
		s4.selectByVisibleText(ExpMonth);
	
		ccExpYear = driver.findElement(By.id("cc_exp_year"));
		Select s5 = new Select(ccExpYear);
		s5.selectByVisibleText(ExpYear);
		
		driver.findElement(By.id("cc_cvv")).sendKeys(CVV); 
		
		AdactinBookingHotelPojo ABHP = new AdactinBookingHotelPojo();
		
		type(ABHP.getFirstName(), FirstName);
		type(ABHP.getLastName(), LastName);
		type(ABHP.getTypeAddress(), Address);
		type(ABHP.getCreditCardNo(), CCNum);
		
		selectingByVisibleText(ABHP.getCcTypeDropdown(), CCType);
		selectingByVisibleText(ABHP.getMonthDropdown(), ExpMonth);
		selectingByVisibleText(ABHP.getYearDropdown(), ExpYear);
		
		type(ABHP.getCvv(), CVV);
		
}*/



		
}
