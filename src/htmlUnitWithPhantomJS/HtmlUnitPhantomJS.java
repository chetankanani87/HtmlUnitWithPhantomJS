package htmlUnitWithPhantomJS;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.*;

import lib.ScreenshotUtility;

public class HtmlUnitPhantomJS {
	
	@Test
	public void VerifyFacebookTitle() {
		File src = new File("C:\\Chetan\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		System.setProperty("phantomjs.binary.path", src.getAbsolutePath());

		WebDriver driver = new PhantomJSDriver();
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		ScreenshotUtility.CaptureScreenshot(driver, "PhantomJSDriverScrShot");
	}
}
