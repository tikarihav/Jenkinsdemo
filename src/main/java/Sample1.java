import java.nio.file.Paths;

import com.microsoft.playwright.*;


public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(5));
            Page page = browser.newPage();
            page.navigate("http://stg.sso.dnb.com");
            page.locator("#idp-discovery-username").fill("fs18regression@dnbiemailtest.org");
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("D:\\playwright.png")));
        }

	}

}
