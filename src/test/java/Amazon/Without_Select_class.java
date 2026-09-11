package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Without_Select_class {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("warangal");
        Thread.sleep(2000);
        List<WebElement> auto=driver.findElements(By.xpath("//ul[@class=\"G43f7e\"]/li"));
        int count=auto.size();
        System.out.println(count);
        auto.get(count-1).click();
       /* for(int i=0;i<count;i++){
            String text=auto.get(i).getText();
            System.out.println(text);
            if(text.equalsIgnoreCase("warangal weather")){
                auto.get(i).click();
                break;
            }*/



        }
    }

