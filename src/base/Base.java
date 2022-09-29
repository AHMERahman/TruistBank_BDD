package base;


import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import commons.CommonWaits;
import commons.Commons;
import io.github.bonigarcia.wdm.WebDriverManager;
import objects.GoToPersonalInfoFormPage;
import objects.OpenAccountPage;
import objects.PersonalInfoPage;
import utils.Configuration;

public class Base {
	public Configuration configuration = new Configuration(null);

	public static WebDriver driver;
	public static WebDriverWait wait;
	static CommonWaits waits;
	

	protected static Commons commons;
	protected static OpenAccountPage openAccountPage;
	protected static GoToPersonalInfoFormPage goToPersonalInfoFormPage;
	protected static PersonalInfoPage personalInfoPage;


	public void setUp(String browser1) {
		driver = localDriver(browser1);
		driver.get(configuration.getConfiguration("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts()
				.pageLoadTimeout(Duration.ofSeconds(Integer.parseInt(configuration.getConfiguration("pageloadWait"))));
		driver.manage().timeouts()
				.implicitlyWait(Duration.ofSeconds(Integer.parseInt(configuration.getConfiguration("implicitWait"))));
		wait = new WebDriverWait(driver,
				Duration.ofSeconds(Integer.parseInt(configuration.getConfiguration("explicitWait"))));
		initClasses();

	}
	
		private WebDriver localDriver(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("safaridriver")) {
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
		} else {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		return driver;
	}

	public static void initClasses() {
		waits = new CommonWaits(wait);
		commons = new Commons(driver, waits);
		openAccountPage = new OpenAccountPage(driver, commons);
		goToPersonalInfoFormPage = new GoToPersonalInfoFormPage(driver, commons);
		personalInfoPage = new PersonalInfoPage(driver, commons);

	}

//	protected WebDriver getDriver() {
//		return driver;
//	}

	
public void tearDown() {
	driver.quit();
}
	

}
