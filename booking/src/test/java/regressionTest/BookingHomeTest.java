package regressionTest;

import base.MobileAPI2;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regressoin.BookingHomePage;

public class BookingHomeTest extends MobileAPI2 {
    BookingHomePage bookObjec;


    @BeforeMethod
    public void initi(){

        bookObjec= PageFactory.initElements(appiumDriver,BookingHomePage.class);
    }
    @Test
    public void setHamburgertest() {
        bookObjec.setHamburger();
        alertAccept(appiumDriver);
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {


        }

    }


}
