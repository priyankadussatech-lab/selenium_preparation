package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class with_out_select_class_custom_dropdown {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        WebElement dropdown=driver.findElement(By.xpath("//button[@fdprocessedid=\"w5e6re\"]"));
        Actions act=new Actions(driver);
        act .moveToElement(dropdown).build().perform();
        



    }
}
