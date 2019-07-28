package OneALvTest.Pages;

import OneALvTest.Helper.Common;
import org.openqa.selenium.By;

public class OrderPage extends Common {


    private By firstName = By.id("order_main_data_name"); //поле для ввода имени
    private By lastName = By.id("order_main_data_surname"); //поле для ввода Фамилии
    private By email = By.id("order_main_data_email"); //поле для ввода мыла
    private By mobile = By.id("order_main_data_contact_phone_number"); //поле для ввода номера телефона
    private By selectList = By.xpath("//a[@role='button']"); //выбор на список
    private By selectSomething = By.id("ui-id-79"); //выбор из списка
    private By checkBox = By.id("accept_purchase_agreement"); //указатель на чекбокс
    private By selectPlaceToTakeProduct = By.id("//img[@src='/images/delivery_type_self_delivery_dpd_warehouse_icon.png']"); //выбор места доставки продукта
    private By saveOrderDelivery = By.xpath("//a[@href='/order/save_delivery']"); //переход к продолжению покупки
    private By paymentType = By.xpath("//a[@payment_type='CASH_INDIVIDUAL_PERSON']"); //выбор вида оплаты
    private By getPriceInTheEnd = By.xpath("//strong[@class='price']"); //указатель на цену товара

    public String getLastPrice() {
        return lastPrice;
    }

    private String lastPrice; //передаем цены товара


    public void setFirstLastName(String first, String last) { //метод заполнения имени и фамилии
        driver.findElement(firstName).sendKeys(first);
        driver.findElement(lastName).sendKeys(last);
    }

    public void setEmailAndMob(String mail, String mob) { //метод заполнения мыла и номера телефона
        driver.findElement(email).sendKeys(mail);
        driver.findElement(mobile).sendKeys(mob);
    }

    public void setSelectList() { //метод выбора элемента из списка
        driver.findElement(selectList).click();
        driver.findElement(selectSomething).click();
    }

    public void setCheckBox() { //метод нажатия на чекбокс
        driver.findElement(checkBox).click();
    }

    public void setPlace() { //метод выбора места доставки продукта
        driver.findElement(selectPlaceToTakeProduct).click();
    }

    public void goNext() { //метод перехода к продолжению покупки товара
        driver.findElement(saveOrderDelivery).click();
    }

    public void setPaymentType() { //метод выбора вида оплаты
        driver.findElement(paymentType).click();
    }

    public void setLastPrice(){ //метод передаем цену товара в переменную
        lastPrice = driver.findElement(getPriceInTheEnd).getText();
    }
}
