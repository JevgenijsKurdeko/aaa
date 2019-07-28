package OneALvTest.Pages;

import OneALvTest.Helper.Common;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HomePage extends Common {

    private By searchField = By.id("search_products_text_field"); //Поле ввода для поиска
    private By searchButton = By.xpath("//input[@type='submit']"); //Кнопка поиска
    //private By searchMonitors = By.xpath("//a[@href='/search/datortehnika_preces_birojam/personalie_datori_monitori_ups/led_monitori/search-text/led_monitori/opened/1']");
    private By brand = By.xpath("//a[text()='Ražotājs']"); //Список бренда товара
    private By brandSelect = By.xpath("//label[@for='s796']"); //Выбор какого то бренда из списка
    private By rating = By.xpath("//a[@class='select-opener select-add-info']"); //Список фильтра выбора товара
    private By ratingSelect = By.xpath("//li[@rel='4']"); //Выбор сортировки по райтингу звезд
    private By productFirstSelect = By.xpath("//img[@alt='Samsung LU28E590DS/EN']"); //выбор первого продукта
    private By addToCart = By.id("add_product_to_shopping_cart_button_top"); //добавить продукт/товар в корзину
    private By goToCart = By.id("//a[@href='/order/shopping_cart']"); //переход в корзину
    private By goToLogin = By.xpath("//a[@href='/order/login']"); //переход к авторизации
    private By goToDelivery = By.xpath("//a[@href='/order/delivery']"); //переход к доставке
    private By getPriceInTheStart = By.xpath("//div[@class='price']"); //указатель на цену товара

    public String getFirstPrice() {
        return firstPrice;
    }

    private String firstPrice ; //передаем цены товара


public void searchSelect(String name){ //метод поиска товара
    driver.findElement(searchField).sendKeys(name);
    //driver.findElement(searchField).sendKeys(Keys.ENTER);
    driver.findElement(searchButton).click();
    //driver.findElement(searchMonitors).click();
}

public void selectBrand(){ //метод для выбора бренда товара
    driver.findElement(brand).click();
    driver.findElement(brandSelect).click();
}

public void selectRating(){ //метод для выбора товара по фильтру
    driver.findElement(rating).click();
    driver.findElement(ratingSelect).click();
}

public void selectProduct(){ //метод выбора первого продукта
    driver.findElement(productFirstSelect).click();
}

public void addAndGoToCart(){ //метод добавления продукта в корзину и переход в корзину
    driver.findElement(addToCart).click();
    driver.findElement(goToCart).click();
}

public void goToLoginAndDelivery(){ //метод для перехода к выбору авторизации и доставки
    driver.findElement(goToLogin).click();
    driver.findElement(goToDelivery).click();
}

public void setFirstPrice(){ //метод передачи цены товара в переменную
    firstPrice = driver.findElement(getPriceInTheStart).getText();
}

}
