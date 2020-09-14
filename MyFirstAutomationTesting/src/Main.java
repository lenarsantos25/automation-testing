
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Classes.LoginClass;
import Classes.MyBookingsClass;
import Classes.CheckInClass;
import Classes.FlightStatus;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String baseURL = "https://www.airasia.com/en/gb";
		System.setProperty("webdriver.chrome.driver", "D:\\Test\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		LoginClass lgClass = new LoginClass();
		
		// Login Incorrect Credentials
		lgClass.IncorrectLogin(driver);
		
		// Forgot Password
//		lgClass.ForgotPassword(driver);
		
		// Login with Facebook
//		lgClass.LoginWithFacebook(driver);
		
		// Login with Google
//		lgClass.LoginWithGoogle(driver);
		
		// Login with WeChat
//		lgClass.LoginWithWeChat(driver);
		
		// Sign Up
//		lgClass.SignUp(driver);
		
		
		MyBookingsClass myBooking = new MyBookingsClass();
		// FlightTab
//		myBooking.FlightTab(driver);
		// HotelTab
//		myBooking.HotelTab(driver);
		// Retrieve Button
//		myBooking.RetrieveBooking(driver);
		
		CheckInClass checkIn = new CheckInClass();
		// Check in Page
//		checkIn.CheckInPage(driver);
		
		FlightStatus flightStatus = new FlightStatus();
//		flightStatus.FlightStatusPage(driver);
	
	}
}
