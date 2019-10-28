import com.codeborne.selenide.Configuration;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Pa;
import org.openqa.selenium.Keys;

import java.util.Random;

import static com.codeborne.selenide.Selenide.open;

public class YesThisIsManyStepdefs {

    String s1;
    String s2;
    Random rnd = new Random();

    @Given("^site ozon$")
    public void siteOzon() {
        Configuration.startMaximized = true;
        Configuration.timeout = 4000;
        open(PageObjects.URL);
    }

    @Then("^choose izh$")
    public void chooseIzh() {
        PageObjects.city.click();
        PageObjects.cityWriter.sendKeys("Ижевск");
        PageObjects.cityIzhevsk.click();
    }

    @When("^open the catalog$")
    public void openTheCatalog() {
        PageObjects.katalog.click();
    }

    @And("^hold sports items$")
    public void holdSportsItems() {
        PageObjects.sportItems.hover();
    }

    @And("^click on the snowboards and other$")
    public void clickOnTheSnowboardsAndOther() {
        PageObjects.katalogSnowboards.click();

    }

    @Then("^click on snowboards$")
    public void clickOnSnowboards() {
        PageObjects.snowboards.click();

    }

    @And("^set price from (\\d+)$")
    public void setPriceFrom(int arg0)throws InterruptedException {
        PageObjects.inputPrice.scrollTo();
        Thread.sleep(2000);
        PageObjects.inputPrice.sendKeys(Keys.CONTROL + "a");
        PageObjects.inputPrice.sendKeys(Keys.DELETE);
        PageObjects.inputPrice.sendKeys("25000");
        PageObjects.inputPrice.pressEnter();
        Thread.sleep(3000);
    }

    @And("^set level$")
    public void setLevel() {
        PageObjects.forBetter.scrollTo();
        PageObjects.forBetter.click();

    }

    @Then("^click on random snow$")
    public void clickOnRandomSnow() {
        int randomSnowNumber = rnd.nextInt(PageObjects.collectSnowboard().size());
        PageObjects.collectSnowboard().get(randomSnowNumber).click();
        System.out.println("количество досок на странице " + PageObjects.collectSnowboard().size());
        System.out.println("Выбрана доска под номером "+ randomSnowNumber);
    }

    @And("^remember it$")
    public void rememberIt() {
        s1 = PageObjects.nameBeforeCart.text();

    }

    @Then("^add it to cart$")
    public void addItToCart() throws InterruptedException{
        PageObjects.toCart.click();
        Thread.sleep(2000);
    }

    @Then("^go to cart$")
    public void goToCart() {
        PageObjects.cart.click();

    }

    @Then("^check if there is a snowboard$")
    public void checkIfThereIsASnowboard() {
        s2 = PageObjects.nameAfterCart.text();
    }

    @Then("^check if it is what we wanted$")
    public void checkIfItIsWhatWeWanted() {
        if(s1.equals(s2))
            System.out.println("GREAT");
    }


}
