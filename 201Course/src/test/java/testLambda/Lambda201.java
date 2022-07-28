package testLambda;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import bsh.Capabilities;

class TestClass1 implements Runnable {
	public void run() {

		Hashtable<String, Object> capsHashtable = new Hashtable<String, Object>();
		capsHashtable.put("browserName", "Chrome");
		capsHashtable.put("version", "88.0");
		capsHashtable.put("platform", "Windows 10");
		capsHashtable.put("resolution", "1024x768");
		capsHashtable.put("build", "Lambdatest-201-Course");
		capsHashtable.put("name", "Test 1");
		capsHashtable.put("console", true);
		capsHashtable.put("network", true);
		capsHashtable.put("terminal", true);
		capsHashtable.put("visual", true);
		capsHashtable.put("video", true);

		Lambda201 r1 = new Lambda201();
		r1.executeScenario1(capsHashtable);
		r1.executeScenario2(capsHashtable);
		r1.executeScenario3(capsHashtable);

	}
}

class TestClass2 implements Runnable {
	public void run() {

		Hashtable<String, Object> capsHashtable = new Hashtable<String, Object>();
		capsHashtable.put("browserName", "MicrosoftEdge");
		capsHashtable.put("version", "87.0");
		capsHashtable.put("platform", "macOS Sierra");
		capsHashtable.put("resolution", "1024x768");
		capsHashtable.put("build", "Lambdatest-201-Course");
		capsHashtable.put("name", "Test 2");
		capsHashtable.put("console", true);
		capsHashtable.put("network", true);
		capsHashtable.put("terminal", true);
		capsHashtable.put("visual", true);
		capsHashtable.put("video", true);
		Lambda201 r2 = new Lambda201();
		r2.executeScenario1(capsHashtable);
		r2.executeScenario2(capsHashtable);
		r2.executeScenario3(capsHashtable);
	}
}

class TestClass3 implements Runnable {
	public void run() {

		Hashtable<String, Object> capsHashtable = new Hashtable<String, Object>();
		capsHashtable.put("browserName", "Firefox");
		capsHashtable.put("version", "82.0");
		capsHashtable.put("platform", "Windows 7");
		capsHashtable.put("resolution", "1024x768");
		capsHashtable.put("build", "Lambdatest-201-Course");
		capsHashtable.put("name", "Test 3");
		capsHashtable.put("console", true);
		capsHashtable.put("network", true);
		capsHashtable.put("terminal", true);
		capsHashtable.put("visual", true);
		capsHashtable.put("video", true);
		Lambda201 r3 = new Lambda201();
		r3.executeScenario1(capsHashtable);
		r3.executeScenario2(capsHashtable);
		r3.executeScenario4(capsHashtable);
	}
}

class TestClass4 implements Runnable {
	public void run() {
		// DesiredCapabilities capabilities = new DesiredCapabilities();
		//
		// capabilities.setCapability("console", true);
		// capabilities.setCapability("network", true);
		// capabilities.setCapability("terminal", true);
		Hashtable<String, Object> capsHashtable = new Hashtable<String, Object>();
		capsHashtable.put("browserName", "Internet Explorer");
		capsHashtable.put("version", "11.0");
		capsHashtable.put("platform", "Windows 10");
		capsHashtable.put("resolution", "1024x768");
		capsHashtable.put("build", "Lambdatest-201-Course");
		capsHashtable.put("name", "Test 4");
		capsHashtable.put("console", true);
		capsHashtable.put("network", true);
		capsHashtable.put("terminal", true);
		capsHashtable.put("visual", true);
		capsHashtable.put("video", true);
		Lambda201 r4 = new Lambda201();
		r4.executeScenario1(capsHashtable);
	}
}

public class Lambda201 {
	public static final String USERNAME = "kkrishnamohan.rao";
	public static final String AUTOMATE_KEY = "qktToOzEOUAyt2Xx6w7GpniFoRUmOElPPXR1ICeWArImHpKKVr";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.lambdatest.com/wd/hub";

	public static void main(String[] args) throws Exception {
		Thread object1 = new Thread(new TestClass1());
		object1.start();
		Thread object2 = new Thread(new TestClass2());
		object2.start();
		Thread object3 = new Thread(new TestClass3());
		object3.start();
	}

	public void executeScenario1(Hashtable<String, Object> capsHashtable) {
		String key;
		DesiredCapabilities caps = new DesiredCapabilities();
		// Iterate over the hashtable and set the capabilities
		Set<String> keys = capsHashtable.keySet();
		Iterator<String> itr = keys.iterator();
		while (itr.hasNext()) {
			key = itr.next();
			caps.setCapability(key, capsHashtable.get(key));
		}

		WebDriver driver;

		try {
			driver = new RemoteWebDriver(new URL(URL), caps);

			driver.get("https://www.lambdatest.com/selenium-playground");
			driver.findElement(By.xpath("//a[text()='Simple Form Demo']")).click();
			String message = "Welcome to LambdaTest";
			driver.findElement(By.xpath("//*[@id='user-message']")).sendKeys(message);
			driver.findElement(By.xpath("//*[@id='showInput']")).click();
			String textMessage = (driver.findElement(By.xpath("//p[text()='Welcome to LambdaTest']"))).getText();
			Assert.assertEquals(message, textMessage);

			driver.quit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void executeScenario3(Hashtable<String, Object> capsHashtable) {
		String key;
		DesiredCapabilities caps = new DesiredCapabilities();
		// Iterate over the hashtable and set the capabilities
		Set<String> keys = capsHashtable.keySet();
		Iterator<String> itr = keys.iterator();
		while (itr.hasNext()) {
			key = itr.next();
			caps.setCapability(key, capsHashtable.get(key));
		}
		// WebDriver driver;
		WebDriver driver;

		try {
			driver = new RemoteWebDriver(new URL(URL), caps);

			driver.get("https://www.lambdatest.com/selenium-playground");
			driver.findElement(By.linkText("Drag & Drop Sliders")).click();
			driver.findElement(By.xpath("//*[@id='slider3']/div/input")).click();

			// WebElement slider =
			// driver.findElement(By.xpath("//*[@id='slider3']/div/input"));
			// // slideUsingAactionClass
			// Actions action = new Actions(driver);
			// action.dragAndDropBy(slider, 95, 15).perform();
			WebElement slider = driver.findElement(By.xpath("//*[@value='15']"));
			// for (int i = 15; i <= 59; i=i+2) {
			for (int i = 15; i <= 59; i++) {
				slider.sendKeys(Keys.ARROW_RIGHT);

			}

			String dragValue = "95";
			String validate = driver.findElement(By.xpath("//output[text()='95']")).getText();
			Assert.assertEquals(dragValue, validate);
			driver.quit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void executeScenario4(Hashtable<String, Object> capsHashtable) {
		String key;
		DesiredCapabilities caps = new DesiredCapabilities();
		// Iterate over the hashtable and set the capabilities
		Set<String> keys = capsHashtable.keySet();
		Iterator<String> itr = keys.iterator();
		while (itr.hasNext()) {
			key = itr.next();
			caps.setCapability(key, capsHashtable.get(key));
		}
		WebDriver driver;

		try {
			driver = new RemoteWebDriver(new URL(URL), caps);

			driver.get("https://www.lambdatest.com/selenium-playground");
			driver.findElement(By.linkText("Drag & Drop Sliders")).click();
			driver.findElement(By.xpath("//*[@id='slider3']/div/input")).click();

			// WebElement slider =
			// driver.findElement(By.xpath("//*[@id='slider3']/div/input"));
			// // slideUsingAactionClass
			// Actions action = new Actions(driver);
			// action.dragAndDropBy(slider, 95, 15).perform();
			WebElement slider = driver.findElement(By.xpath("//*[@value='15']"));
			for (int i = 15; i <= 58; i++) {
				slider.sendKeys(Keys.ARROW_RIGHT);

			}

			String dragValue = "95";
			String validate = driver.findElement(By.xpath("//output[text()='95']")).getText();
			Assert.assertEquals(dragValue, validate);
			driver.quit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// public void slideUsingJQuery(WebDriver driver, int value) {
	// WebElement slider =
	// driver.findElement(By.cssSelector("input[type='range']"));
	// ((JavascriptExecutor) driver).executeScript("$(arguments[0]).val(" +
	// value + ").change()", slider);
	//
	// }

	public void executeScenario2(Hashtable<String, Object> capsHashtable) {
		String key;
		DesiredCapabilities caps = new DesiredCapabilities();

		// Iterate over the hashtable and set the capabilities
		Set<String> keys = capsHashtable.keySet();
		Iterator<String> itr = keys.iterator();
		while (itr.hasNext()) {
			key = itr.next();
			caps.setCapability(key, capsHashtable.get(key));
		}
		WebDriver driver;

		try {
			driver = new RemoteWebDriver(new URL(URL), caps);

			driver.get("https://www.lambdatest.com/selenium-playground");
			driver.findElement(By.linkText("Input Form Submit")).click();
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			String errorMsg = "Please fill out this field.";
			String errorMessage = driver.findElement(By.id("name")).getAttribute("validationMessage");
			Assert.assertEquals(errorMsg, errorMessage);

			driver.findElement(By.id("name")).sendKeys("Krishna User1");
			driver.findElement(By.id("inputEmail4")).sendKeys("abcd@gmail.com");
			driver.findElement(By.name("password")).sendKeys("user1paSSword");
			driver.findElement(By.xpath("//*[@id='company']")).sendKeys("Private");
			driver.findElement(By.xpath("//*[@id='websitename']")).sendKeys("www.google.com");
			driver.findElement(By.id("inputCity")).sendKeys("Gargantua");
			driver.findElement(By.id("inputAddress1")).sendKeys("Nasa1");
			driver.findElement(By.id("inputAddress2")).sendKeys("007");
			driver.findElement(By.id("inputState")).sendKeys("TX");
			driver.findElement(By.id("inputZip")).sendKeys("51321");
			Select cnty = new Select(driver.findElement(By.xpath("//*[@id='seleniumform']/div[3]/div[1]/select")));
			cnty.selectByVisibleText("United States");
			driver.findElement(By.xpath("//*[@id='seleniumform']/div[6]/button")).click();

			String succesMsg = "Thanks for contacting us, we will get back to you shortly.";
			String actualSuccessMsg = driver
					.findElement(By.xpath("//*[@id='__next']/div/section[3]/div/div/div[2]/div/p")).getText();

			Assert.assertEquals(succesMsg, actualSuccessMsg);

			driver.quit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
