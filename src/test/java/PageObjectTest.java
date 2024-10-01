import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.SneakyThrows;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PageObjectTest {
    BePaid bePaid;
    PayForm.PaymentDetails paymentDetails;
    ChromeOptions options = new ChromeOptions();
    public static WebDriver driver;
    Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    @BeforeAll
    public static void setupAll() {
        WebDriverManager.chromedriver().setup();
    }

    @SneakyThrows
    @BeforeEach
    public void setup() {
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
//        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.mts.by/");
    }

    @AfterAll
    public static void сloseAll() {
        driver.quit();
    }

    @SneakyThrows
    @Test
    public void test() {
        PayForm payForm = new PayForm(driver);
        paymentDetails = payForm.generateValidPayment();
        bePaid = payForm.communicationServices(paymentDetails);
        WebElement iframePay = driver.findElement(By.xpath("/html/body/div[8]/div/iframe"));
        driver.switchTo().frame(iframePay);
        BePaid.PayDiscription discription = bePaid.getPayDiscription();
        BePaid.CardInfo cardInfo = bePaid.getCardInfo();
        assertAll(() -> assertEquals(paymentDetails.getAmount(), bePaid.getCostInfo()),
                () -> assertEquals("375" + paymentDetails.getCustomer(), discription.getNumber()),
                () -> assertEquals("Услуги связи", discription.getPayFor()),
                () -> assertEquals("Номер карты", cardInfo.getNumber()),
                () -> assertEquals(3, bePaid.getCardsBrands().size()),
                () -> assertEquals("Срок действия", cardInfo.getValidPeriod()),
                () -> assertEquals("CVC", cardInfo.getCvc()),
                () -> assertEquals("Имя держателя (как на карте)", cardInfo.getName()),
                () -> assertEquals(paymentDetails.getAmount(), bePaid.getButtonInfo()));
    }
}
