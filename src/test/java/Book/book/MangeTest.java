package Book.book;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MangeTest {

	@Test
	public void run() throws InterruptedException {
//	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("profile.default_content_setting_values.notifications", 1);
		// 1-Allow, 2-Block, 0-default
		options.setExperimentalOption("prefs", prefs);
		WebDriverManager.chromedriver().setup();
//		/usr/bin/google-chrome  /usr/share/man/man1/google-chrome.1.gz
	//	System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		// System.setProperty("webdriver.chrome.driver",
		// "D:\\ed\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.get("https://dev.managemedias.com/login");
		driver.findElement(By.name("email")).sendKeys("vishwas.panke@selftech.in");
		driver.findElement(By.name("password")).sendKeys("12345678");
		driver.findElement(By.xpath("(//div[@class=\"col-lg-12 col-md-12\"])[3]/div/button")).click();
		driver.findElement(By.id("page-header-user-dropdown")).click();
		driver.findElement(By.xpath("//div[@class=\"dropdown-menu dropdown-menu-end show\"]/a")).click();
		driver.findElement(By.xpath("//div[@class=\"card\"]/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("(//div[@class=\"row mb-3\"])[1]/div[2]/a")).click();
		driver.findElement(By.id("email")).sendKeys("parag.wadyalkar@selftech.in");
		driver.findElement(By.id("pass")).sendKeys("parag@1234");
		driver.findElement(By.id("loginbutton")).click();
		driver.findElement(By.xpath("(//span[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft'])[2]"))
				.click();

		driver.findElement(By.id("vertical-menu-btn")).click();
		driver.findElement(By.xpath("//div[@id=\"sidebar-menu\"]/ul/ul/li/a")).click();
		driver.findElement(By.xpath("//div[@id=\"sidebar-menu\"]/ul/ul/li/ul/li/a")).click();
		driver.findElement(By.xpath("(//div[@class=\"container-fluid\"])[1]/div[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.name("name")).sendKeys("Demo");
		driver.findElement(By.id("message")).sendKeys("20% offer on each product");

		WebElement upload_file = driver.findElement(By.id("image"));
		upload_file.sendKeys("C:\\Users\\AVITA\\Desktop\\Image\\download (2).jpg");

		driver.findElement(By.xpath("(//div[@class=\"modal-footer\"])/button[2]")).click();
		driver.close();

	}

}
