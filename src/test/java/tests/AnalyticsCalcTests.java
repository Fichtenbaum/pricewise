package tests;

import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import pages.*;

import java.util.Map;

public class AnalyticsCalcTests {
    private String baseUrl = "https://uatpricewise.informars.com/?#/login";
    private CommonMenuPage commonPage = new CommonMenuPage();
    private SoftAssert softAssert = new SoftAssert();
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    AnalyticsPage analyticsPage = new AnalyticsPage();
    RoaCalcPage roaCalcPage = new RoaCalcPage();
    Map<String, Double> roaInputValues = roaCalcPage.getInputValues();

    @BeforeTest
    public void precondition() throws InterruptedException {
        loginPage.openUrl(baseUrl);
        loginPage.logIn("AsdTeam", "AsdTeam1!");
        homePage.zoomPage(0.8);
        homePage.openAnalyticsPage();
    }

    @Test
    public void helocRoaCalcTest() throws InterruptedException {
        analyticsPage.openHelocRoaCalcPage();
        roaCalcPage.fillInForm();
        softAssert.assertEquals(roaCalcPage.getTotalLine(), roaInputValues.get("totalLineInput"), "Total Line isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getBaseRate(), roaInputValues.get("baseRateInput"),"Base Rate isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getRelationshipDiscount(), roaInputValues.get("relationshipDiscountInput"),"Relationship Discount isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getAutoDebitDiscount(), roaInputValues.get("autoDebitDiscountInput"),"Auto Debit Discount isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getExpectedLife(), roaInputValues.get("expectedLifeInput"),"Expected Life isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getMinimumPaymentProc(), roaInputValues.get("minimumPaymentProcInput"),"Minimum Payment Proc isn't equal to input value");

        softAssert.assertAll();
    }

    @AfterSuite
    public void tearDown(){
       commonPage.tearDown();
    }

}
