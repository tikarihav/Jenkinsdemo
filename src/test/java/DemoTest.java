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
             page.navigate("https://practice.automationtesting.in/");             
             assertThat(page).hasTitle(Pattern.compile("Automation Practice Site"));
         }        
     }     
}
