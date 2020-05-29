package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;
import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class SignInPage {

    private static final String BUTTONOFCREATIONACCOUNTSUBMIT = "createAccountSubmit";
    private static final String SignInLocator = "//span[@class = 'nav-line-2 ']";

    WebDriver driver;
    public SignInPage(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(id = BUTTONOFCREATIONACCOUNTSUBMIT)
    private WebElement buttonSubmitToSignInPage;

    @FindBy(xpath = SignInLocator)
    private WebElement signInLocator;

    public void open(){
        driver.get("https://www.amazon.com/ref=nav_logo");
    }
    public void goToSignInPage() throws InterruptedException {
        signInLocator.click();
        buttonSubmitToSignInPage.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        sleep(1000);
    }
}
