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

public class WebDriverUpload {

    private WebDriver driver;
    @BeforeEach
   @DisplayName("Enter in site")
    public void navigateToDownloadPage() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/upload-download");
        driver.manage().timeouts().implicitlyWait(Duration.of(20, ChronoUnit.SECONDS));
        driver.manage().window().maximize();
    }

    @Test
    @DisplayName("Upload File")
    public void downloadButton() {
        WebElement fileInput = driver.findElement(By.id("downloadButton"));
        fileInput.click();

    }

    @AfterEach
    @DisplayName("Exit from browser")
    public void exitBrowser() {
        // Закриття веб-драйвера
        driver.quit();
    }
}


