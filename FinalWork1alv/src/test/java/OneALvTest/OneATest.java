package OneALvTest;

import OneALvTest.Helper.Common;
import org.junit.Test;

public class OneATest {
    private Common web = new Common();

    @Test
    public void test(){

        web.startBrowser();

        try {
            Thread.sleep((10000)); //создаем паузу для проверки правельности заполнения или работы теста
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        web.stopBrowser();

    }
}
