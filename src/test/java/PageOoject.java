import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class PageOoject {

    private WebDriver driver;

    @BeforeEach
    @DisplayName("Text box")
    public void navigateToTextBoxPage() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/links");
        driver.manage().timeouts().implicitlyWait(Duration.of(20, ChronoUnit.SECONDS));
        driver.manage().window().maximize();
    }

    @Test
    @DisplayName("Link")
    public void checkLink() {
        WebElement fileInput = driver.findElement(By.id("simpleLink"));
        fileInput.click();
    }

    @AfterEach
    @DisplayName("Exit from browser")
    public void exitBrowser() {
        // Закриття веб-драйвера
        driver.quit();

    }
}

