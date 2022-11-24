import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbebekQACaseSepeteUrunEkleme {
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Selenium/ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //siteye giriş
        driver.get("https://www.e-bebek.com");
        //arama butonunu bulma, tıklama, biberon yazma, ENTER'a basma
        WebElement search = driver.findElement(By.xpath("//*[@id=\"txtSearchBox\"]"));
        search.click();
        search.sendKeys("biberon");
        search.sendKeys(Keys.ENTER);

        //ilk biberonu bulma ve tıklama
        Thread.sleep(3000);
        WebElement biberon = driver.findElement(By.cssSelector(".col-6:nth-child(1) .product-item-anchor .product-item-content"));
        biberon.click();

        Thread.sleep(3000);
        WebElement sepeteEkle = driver.findElement(By.cssSelector(".btn[id=\"addToCartBtn\"]"));
        sepeteEkle.click();

        Thread.sleep(3000);
        WebElement sepetiGor = driver.findElement(By.id("btnShowCart"));
        sepetiGor.click();
    }
}
