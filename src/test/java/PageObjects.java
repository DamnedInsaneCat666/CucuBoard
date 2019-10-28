import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class PageObjects {
   public static String URL = "http://www.ozon.ru";
   public static SelenideElement city = $(By.xpath("//div[@role = 'navigation']//button//span[2]"));
   public static SelenideElement cityWriter = $(By.xpath("//label//input"));
   public static SelenideElement cityIzhevsk = $(By.xpath("//a[contains(text(), 'Удмуртская')]"));
   public static SelenideElement  katalog = $(By.xpath("//button[@value = 'Каталог']"));
   public static SelenideElement sportItems = $(By.xpath("//span[contains(text() , 'Спортивные')]"));
   public static SelenideElement katalogSnowboards = $(By.xpath("//span[contains(text() , 'Сноуборды')]"));
   public static SelenideElement snowboardAndOthers = $(By.xpath("//a[@data-test-category-id='11158']"));
   public static SelenideElement snowboards = $(By.xpath("//a[@href = '/category/snoubordy-11159/' and @data-test-id='category-filter-item']"));

   //public static SelenideElement inputPrice = $(By.xpath("//input[@data-test-id='range-filter-from-input']")); //input[@id = 'from_3015']
   public static SelenideElement inputPrice = $(By.xpath("//div[@class = 'input-container']/div[1]/input[@class = 'input']"));
   public static SelenideElement forBetter = $(By.xpath("//span[@class = 'label-text' and contains(text(), 'прогресс')]"));
   public static SelenideElement nameBeforeCart = $(By.xpath("//div[@class = 'top-base-column-top']//div/h1"));
   public static SelenideElement toCart = $(By.xpath("//button[contains(text(), 'в корзину')]"));
   public static SelenideElement cart = $(By.xpath("//a[@href = '/cart']"));
   public static SelenideElement nameAfterCart = $(By.xpath("//a[@class = 'title']/span"));

   public static ElementsCollection collectSnowboard (){
        return $$(By.xpath("//div[@class = 'tiles']/div"));
    }

}
