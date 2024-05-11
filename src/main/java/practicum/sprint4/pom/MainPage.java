package practicum.sprint4.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MainPage {
    private WebDriver driver;

    // Кнопка "Заказать"
    private By orderButton = By.className("Button_Button__ra12g");
    // "Вопрос о важном"
    private By accordionButton = By.className("accordion__button");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    //Нажать кнопку "Заказать"
    public MainPage pressOrderButton(){
        driver.findElement(orderButton).click();
        return this;
    }

    public MainPage getAllAccordionButtons(){
        List<WebElement> elements = driver.findElements(accordionButton);
       return this;
    }




    // Нажать на один из "Вопросов о важном"
    public MainPage pressAccordionButton(){
        // Скролл до кнопки
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(accordionButton));
        // Нажатие
        driver.findElement(accordionButton).click();
        return this;
    }

    public void dsfs(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(accordionButton));
        int abuttons = driver.findElements(accordionButton).size();
        System.out.println(abuttons);
    }



}
