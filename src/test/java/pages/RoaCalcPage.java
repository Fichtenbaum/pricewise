package pages;

import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class RoaCalcPage extends AbstractPage{
    private String
            totalLine = "'Total Line/Loan Amount ($)'"
            ,baseRate = "'Base Rate (%)'"
            ,relationshipDiscount = "'Relationship Discount (%)'"
            ,autoDebitDiscount = "'Auto Debit Discount (%)'"
            ,expectedLife = "'Expected Life (mo)'"
            ,minimumPaymentProc = "'Minimum Payment (%)'"
            ,minimumPaymentDol = "'Minimum Payment ($)'"
            ,utilization = "'Utilization (%)'"
            ,paymentsYear = "'Payments/Year'"
            ,prepaySpeed = "'Prepay Speed (CPR)'"
            ,introTermPeriod ="'Intro Term Period (mo)'"
            ,introTermCap = "'Intro Term Cap (%)'";

    private By totalLineInput = By.xpath("//td[text()=" + totalLine +"]/..//input[@class='form-control']")
            ,baseRateInput = By.xpath("//td[text()=" + baseRate + "]/..//input[@class='form-control']")
            ,relationshipDiscountInput = By.xpath("//td[text()="+ relationshipDiscount +"]/..//input[@class='form-control']")
            ,autoDebitDiscountInput = By.xpath("//td[text()=" + autoDebitDiscount + "]/..//input[@class='form-control']")
            ,expectedLifeInput = By.xpath("//td[text()= " + expectedLife + "]/..//input[@class='form-control']")
            ,minimumPaymentProcInput = By.xpath("//td[text()=" + minimumPaymentProc + "]/..//input[@class='form-control']")
            ,minimumPaymentDolInput = By.xpath("//td[text()=" + minimumPaymentDol + "]/..//input[@class='form-control']")
            ,utilizationInput = By.xpath("//td[text()=" + utilization + "]/..//input[@class='form-control']")
            ,paymentsYearInput = By.xpath("//td[text()=" + paymentsYear + "]/..//input[@class='form-control']")
            ,prepaySpeedInput = By.xpath("//td[text()=" + prepaySpeed + "]/..//input[@class='form-control']")
            ,introTermPeriodInput = By.xpath("//td[text()=" + introTermPeriod + "]/..//input[@class='form-control']")
            ,introTermRateInput = By.xpath("//td[text()='Intro Term Rate (%)']/..//input[@class='form-control']")
            ,introTermCapInput = By.xpath("//td[text()=" + introTermCap + "]/..//input[@class='form-control']")
            ,postIntroTermMarginInput = By.xpath("//td[text()='Post-Intro Term Margin (%)']/..//input[@class='form-control']")
            ,postIntroCapRateInput = By.xpath("//td[text()='Post-Intro Cap Rate (%)']/..//input[@class='form-control']")
            ,postIntroFloorRateInput = By.xpath("//td[text()='Post-Intro Floor Rate (%)']/..//input[@class='form-control']")
            ,postIntroCeilingRateInput = By.xpath("//td[text()='Post-Intro Ceiling Rate (%)']/..//input[@class='form-control']")
            ,originationCostInput = By.xpath("//td[text()='Origination Cost ($)']/..//input[@class='form-control']")
            ,servicingCostInput = By.xpath("//tr[3]/td[contains(text(), 'Servicing Cost')]/..//input")
            ,lossProvisionYearInput = By.xpath("//td[text()='Loss Provision / Year (%)']/..//input[@class='form-control']")
            ,originationClosingInput = By.xpath("//td[text()='Origination / Closing ($)']/..//input[@class='form-control']")
            ,otherOriginationClosingInput = By.xpath("//td[text()='Other Origination/Closing ($)']/..//input[@class='form-control']")
            ,annualInput = By.xpath("//td[text()='Annual ($)']/..//input[@class='form-control']")
            ,maintainceFeesInput = By.xpath("//td[text()='Maintenance Fees (e.g., \"late fees\") ($)']/..//input[@class='form-control']");

    public Map<String, Double> getInputValues() {
        Map<String, Double> inputValues = new HashMap<String, Double>();
        inputValues.put("totalLineInput", (double) 250000);
        inputValues.put("baseRateInput", 4.49);
        inputValues.put("relationshipDiscountInput", (double) 0);
        inputValues.put("autoDebitDiscountInput", (double) 0);
        inputValues.put("expectedLifeInput", (double) 120);
        inputValues.put("minimumPaymentProcInput", 1.5);
        inputValues.put("minimumPaymentDolInput", (double) 50);
        inputValues.put("utilizationInput", (double) 65);
        inputValues.put("paymentsYearInput", (double) 12);
        inputValues.put("prepaySpeedInput", (double) 15);
        inputValues.put("introTermPeriodInput", (double) 0);
        inputValues.put("introTermRateInput", (double) 0);
        inputValues.put("introTermCapInput", 1.75);
        inputValues.put("postIntroTermMarginInput", 0.24);
        inputValues.put("postIntroCapRateInput", 2.25);
        inputValues.put("postIntroFloorRateInput", 4.49);
        inputValues.put("postIntroCeilingRateInput", (double) 18);
        inputValues.put("originationCostInput", 1346.87);
        inputValues.put("servicingCostInput", (double) 75);
        inputValues.put("originationClosingInput", 0.41);
        inputValues.put("lossProvisionYearInput", (double) 0);
        inputValues.put("otherOriginationClosingInput", (double) 0);
        inputValues.put("annualInput", (double) 50);
        inputValues.put("maintainceFeesInput", (double) 0);
        return inputValues;
    }

    public void fillInForm() throws InterruptedException {
        Map<String, Double> inputValues = getInputValues();
        type(totalLineInput, inputValues.get("totalLineInput").toString());
        type(baseRateInput, inputValues.get("baseRateInput").toString().replace(".", ","));
        type(relationshipDiscountInput, inputValues.get("relationshipDiscountInput").toString());
        type(autoDebitDiscountInput, inputValues.get("autoDebitDiscountInput").toString());
        type(expectedLifeInput, inputValues.get("expectedLifeInput").toString());
        type(minimumPaymentProcInput, inputValues.get("minimumPaymentProcInput").toString().replace(".", ","));
        type(minimumPaymentDolInput, inputValues.get("minimumPaymentDolInput").toString());
        type(utilizationInput, inputValues.get("utilizationInput").toString());
        type(paymentsYearInput, inputValues.get("paymentsYearInput").toString());
        type(prepaySpeedInput, inputValues.get("prepaySpeedInput").toString());
        type(introTermPeriodInput, inputValues.get("introTermPeriodInput").toString());
        type(introTermRateInput, inputValues.get("introTermRateInput").toString());
        type(introTermCapInput, inputValues.get("introTermCapInput").toString().replace(".", ","));
        type(postIntroTermMarginInput, inputValues.get("postIntroTermMarginInput").toString().replace(".", ","));
        type(postIntroCapRateInput, inputValues.get("postIntroCapRateInput").toString().replace(".", ","));
        type(postIntroFloorRateInput, inputValues.get("postIntroFloorRateInput").toString().replace(".", ","));
        type(postIntroCeilingRateInput, inputValues.get("postIntroCeilingRateInput").toString());
        type(originationCostInput, inputValues.get("originationCostInput").toString().replace(".", ","));
        type(servicingCostInput, inputValues.get("servicingCostInput").toString());
        type(lossProvisionYearInput, inputValues.get("lossProvisionYearInput").toString().replace(".", ","));
        type(originationClosingInput, inputValues.get("originationClosingInput").toString());
        type(otherOriginationClosingInput, inputValues.get("otherOriginationClosingInput").toString());
        type(annualInput, inputValues.get("annualInput").toString());
        type(maintainceFeesInput, inputValues.get("maintainceFeesInput").toString());
    }

    public Double getTotalLine(){
        return Double.parseDouble(getInputText(totalLineInput));
    }

    public Double getBaseRate(){
        return Double.parseDouble(getInputText(baseRateInput));
    }

    public Double getRelationshipDiscount(){
        return Double.parseDouble(getInputText(relationshipDiscountInput));
    }

    public Double getAutoDebitDiscount(){
        return Double.parseDouble(getInputText(autoDebitDiscountInput));
    }

    public Double getExpectedLife(){
        return Double.parseDouble(getInputText(expectedLifeInput));
    }

    public Double getMinimumPaymentProc(){
        return Double.parseDouble(getInputText(minimumPaymentProcInput));
    }

}
