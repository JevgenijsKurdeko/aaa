package OneALvTest;

import OneALvTest.Helper.Common;
import OneALvTest.Models.Customer;
import OneALvTest.Models.Product;
import OneALvTest.Pages.HomePage;
import OneALvTest.Pages.OrderPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OneATest {
    private Common web = new Common();
    private HomePage homePage = new HomePage();
    private OrderPage orderPage = new OrderPage();
    private Customer customer = new Customer();
    private Product product = new Product();

    @Before
    public void setUp() {

        web.startBrowser();

        customer.setName("Jevgenijs");
        customer.setSurName("Kurdeko");
        customer.setMobile("26894307");
        customer.setEmail("garrilase@inbox.lv");

    }

    @Test
    public void test() {

        homePage.searchSelect("Monitori");
        homePage.selectBrand();
        homePage.selectRating();
        homePage.selectProduct();
        homePage.addAndGoToCart();
        homePage.goToLoginAndDelivery();
        homePage.setFirstPrice();
        product.setPrice(homePage.getFirstPrice());

        //little pause

        try {
            Thread.sleep((3000)); //создаем паузу для проверки правельности заполнения или работы теста
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        orderPage.setFirstLastName(customer.getName(), customer.getSurName());
        orderPage.setEmailAndMob(customer.getEmail(), customer.getMobile());
        orderPage.setSelectList();
        orderPage.setCheckBox();
        orderPage.setPlace();
        orderPage.goNext();
        orderPage.setPaymentType();
        orderPage.setLastPrice();
        //assertThat("product.getPrice()").isEqualTo("orderPage.getLastPrice()");


        try {
            Thread.sleep((10000)); //создаем паузу для проверки правельности заполнения или работы теста
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    @After
    public void tearDown() {

        web.stopBrowser();

    }
}
