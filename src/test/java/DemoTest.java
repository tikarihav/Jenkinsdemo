import static org.junit.Assert.assertEquals;

import java.nio.file.Paths;
import java.util.regex.Pattern;

import org.junit.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class DemoTest {
     @Test
     public void testOne() {
    	 try (Playwright playwright = Playwright.create()) {
             Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(5));
             Page page = browser.newPage();
             page.navigate("http://stg.sso.dnb.com");
             page.locator("#idp-discovery-username").fill("fs18regression@dnbiemailtest.org");
             page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("D:\\playwright.png")));
             assertThat(page).hasTitle(Pattern.compile("dnb-stg - Sign In"));
         }
        //assertEquals(6, sum);
     }
     
     @Test
     public void testTwo() {
    	 try (Playwright playwright = Playwright.create()) {
             Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(5));
             Page page = browser.newPage();
             page.navigate("http://stg.sso.dnb.com");
             page.locator("#idp-discovery-username").fill("fs18regression@dnbiemailtest.org");
             page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("D:\\playwright1.png")));
             assertThat(page).hasTitle(Pattern.compile("Dun and Bradstreet"));
         }
        //assertEquals(6, sum);
     }
}
