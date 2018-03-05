package pages;

import org.openqa.selenium.By;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;
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
            ,introTermPeriod = "'Intro Term Period (mo)'"
            ,introTermRate = "'Intro Term Rate (%)'"
            ,introTermCap = "'Intro Term Cap (%)'"
            ,postIntroTermMargin = "'Post-Intro Term Margin (%)'"
            ,postIntroTermCapRate = "'Post-Intro Cap Rate (%)'"
            ,postIntroFloorRate = "'Post-Intro Floor Rate (%)'"
            ,postIntroCeilingRate = "'Post-Intro Ceiling Rate (%)'"
            ,originationCost = "'Origination Cost ($)'"
            ,lossProvisionYear = "'Loss Provision / Year (%)'"
            ,originationClosing = "'Origination / Closing ($)'"
            ,otherOriginationClosing = "'Other Origination/Closing ($)'"
            ,maintenanceFees = "'Maintenance Fees (e.g., \"late fees\") ($)'"
            ,annual = "'Annual ($)'"
            ,originationExpenses = "'Origination Expenses'"
            ,grossInterestIncome = "'Gross Interest Income'"
            ,originationFees = "'Origination Fees'"
            ,interestIncome= "'Interest Income'"
            ,interestExpenseSource = "'Interest Expense Source'"
            ,sourceRate = "'Source  Rate'"
            ,netInterestIncome = "'Net Interest Income'"
            ,servicingExpenses = "'Servicing Expenses'"
            ,annualFees = "'Annual Fees'"
            ,nonInterestExpense = "'Non-Interest Expense'"
            ,lossProvision = "'Loss Provision'"
            ,creditInsurance = "'Credit Insurance'"
            ,pretaxIncome = "'Pretax Income'"
            ,stateTaxes = "'State Taxes'"
            ,federalTaxes = "'Federal Taxes'"
            ,taxes = "'Taxes'"
            ,netIncome = "'Net Income'"
            ,averageBalance = "'Average Balance'"
            ,preTaxROA = "'Pre-Tax ROA'"
            ,afterTaxROA = "'After-Tax ROA'"
            ,creditDisability = "'Credit Disability'"
            ,creditDisabilityLife = "'Credit Disability + Life'"
            ,employeeBonus = "'Employee Bonus (%)'";

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
            ,interestOnlyDropdown = By.xpath("//select[@class='form-control']")
            ,introTermPeriodInput = By.xpath("//td[text()=" + introTermPeriod + "]/..//input[@class='form-control']")
            ,introTermRateInput = By.xpath("//td[text()=" + introTermRate + "]/..//input[@class='form-control']")
            ,introTermCapInput = By.xpath("//td[text()=" + introTermCap + "]/..//input[@class='form-control']")
            ,postIntroTermMarginInput = By.xpath("//td[text()=" + postIntroTermMargin + "]/..//input[@class='form-control']")
            ,postIntroCapRateInput = By.xpath("//td[text()=" + postIntroTermCapRate + "]/..//input[@class='form-control']")
            ,postIntroFloorRateInput = By.xpath("//td[text()=" + postIntroFloorRate + "]/..//input[@class='form-control']")
            ,postIntroCeilingRateInput = By.xpath("//td[text()=" + postIntroCeilingRate + "]/..//input[@class='form-control']")
            ,originationCostInput = By.xpath("//td[text()=" + originationCost + "]/..//input[@class='form-control']")
            ,servicingCostInput = By.xpath("//tr[3]/td[contains(text(), 'Servicing Cost')]/..//input")
            ,lossProvisionYearInput = By.xpath("//td[text()=" + lossProvisionYear + "]/..//input[@class='form-control']")
            ,originationClosingInput = By.xpath("//td[text()=" + originationClosing + "]/..//input[@class='form-control']")
            ,otherOriginationClosingInput = By.xpath("//td[text()=" + otherOriginationClosing + "]/..//input[@class='form-control']")
            ,annualInput = By.xpath("//td[text()=" + annual + "]/..//input[@class='form-control']")
            ,maintainceFeesInput = By.xpath("//td[text()=" + maintenanceFees + "]/..//input[@class='form-control']")
            ,creditDisabilityInput = By.xpath("//td[text()=" + creditDisability + "]/..//input[@class='form-control']")
            ,creditDisabilityLifeInput = By.xpath("//td[text()=" + creditDisabilityLife + "]/..//input[@class='form-control']")
            ,employeeBonusInput = By.xpath("//td[text()=" + employeeBonus +"]/..//input[@class='form-control']");

    private By grossInterestIncomeExpected = By.xpath("//td[text()=" + grossInterestIncome + "]/../td[3]")
            ,originationExpensesExpected = By.xpath("//td[text()=" + originationExpenses + "]/../td[3]")
            ,originationFeesExpected = By.xpath("//td[text()= " + originationFees + "]/../td[3]")
            ,interestIncomeExpected = By.xpath("//td[text()=" + interestIncome + "]/../td[3]")
            ,interestExpenseSourceExpected = By.xpath("//td[text()=" + interestExpenseSource + "]/../td[3]")
            ,sourceRateExpected = By.xpath("//td[text()=" + sourceRate + "]/../td[3]")
            ,netInterestIncomeExpected = By.xpath("//th[text()=" + netInterestIncome + "]/../th[3]")
            ,servicingExpensesExpected = By.xpath("//td[text()=" + servicingExpenses + "]/../td[3]")
            ,annualFeesExpected = By.xpath("//td[text()=" + annualFees + "]/../td[3]")
            ,nonInterestExpenseExpected = By.xpath("//td[text()=" + nonInterestExpense + "]/../td[3]")
            ,lossProvisionExpected = By.xpath("//td[text()=" + lossProvision + "]/../td[3]")
            ,creditInsuranceExpected = By.xpath("//td[text()=" + creditInsurance + "]/../td[3]")
            ,pretaxIncomeExpected = By.xpath("//th[text()=" + pretaxIncome + "]/../th[3]")
            ,stateTaxesExpected = By.xpath("//td[text()=" + stateTaxes + "]/../td[3]")
            ,federalTaxesExpected = By.xpath("//td[text()=" + federalTaxes + "]/../td[3]")
            ,taxesExpected = By.xpath("//td[text()=" + taxes +"]/../td[3]")
            ,netIncomeExpected = By.xpath("//th[text()=" + netIncome + "]/../th[3]")
            ,averageBalanceExpected = By.xpath("//td[text()=" + averageBalance + "]/../td[3]")
            ,preTaxROAExpected = By.xpath("//td[text()=" + preTaxROA + "]/../td[3]")
            ,afterTaxROAExpected = By.xpath("//td[text()=" + afterTaxROA + "]/../td[3]");

    private By grossInterestIncomeActual = By.xpath("//td[text()='Gross Interest Income']/../td[2]")
            ,originationExpensesActual = By.xpath("//td[text()='Origination Expenses']/../td[2]")
            ,originationFeesActual = By.xpath("//td[text()='Origination Fees']/../td[2]")
            ,interestIncomeActual= By.xpath("//td[text()='Interest Income']/../td[2]")
            ,interestExpenseSourceActual = By.xpath("//td[text()='Interest Expense Source']/../td[2]")
            ,sourceRateActual = By.xpath("//td[text()='Source  Rate']/../td[2]")
            ,netInterestIncomeActual = By.xpath("//th[text()='Net Interest Income']/../th[2]")
            ,servicingExpensesActual = By.xpath("//td[text()='Servicing Expenses']/../td[2]")
            ,annualFeesActual = By.xpath("//td[text()='Annual Fees']/../td[2]")
            ,nonInterestExpenseActual = By.xpath("//td[text()='Non-Interest Expense']/../td[2]")
            ,lossProvisionActual = By.xpath("//td[text()='Loss Provision']/../td[2]")
            ,creditInsuranceActual = By.xpath("//td[text()='Credit Insurance']/../td[2]")
            ,pretaxIncomeActual = By.xpath("//th[text()='Pretax Income']/../th[2]")
            ,stateTaxesActual = By.xpath("//td[text()='State Taxes']/../td[2]")
            ,federalTaxesActual = By.xpath("//td[text()='Federal Taxes']/../td[2]")
            ,taxesActual = By.xpath("//td[text()='Taxes']/../td[2]")
            ,netIncomeActual = By.xpath("//th[text()='Net Income']/../th[2]")
            ,averageBalanceActual = By.xpath("//td[text()='Average Balance']/../td[2]")
            ,preTaxROAActual = By.xpath("//td[text()='Pre-Tax ROA']/../td[2]")
            ,afterTaxROAActual = By.xpath("//td[text()='After-Tax ROA']/../td[2]")
            ,baseRateActual = By.xpath("//td[text()=" + baseRate + "]/../td[2]");

    public Map<String, Double> getInputValues() {
        Map<String, Double> inputValues = new HashMap<String, Double>();
        inputValues.put("totalLineInput", (double) 250000);
        inputValues.put("baseRateInput", 4.74);
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
        inputValues.put("postIntroFloorRateInput", 4.74);
        inputValues.put("postIntroCeilingRateInput", (double) 18);
        inputValues.put("originationCostInput", 1346.87);
        inputValues.put("servicingCostInput", (double) 75);
        inputValues.put("originationClosingInput", (double)0);
        inputValues.put("lossProvisionYearInput", 0.41);
        inputValues.put("otherOriginationClosingInput", (double) 0);
        inputValues.put("annualInput", (double) 50);
        inputValues.put("maintainceFeesInput", (double) 0);
        return inputValues;
    }

    public Map<String, Double> getInputValuesHelocLineAmount1() {
        Map<String, Double> inputValues = new HashMap<String, Double>();
        inputValues.put("totalLineInput", (double) 2500000);
        inputValues.put("baseRateInput", 11.05);
        inputValues.put("relationshipDiscountInput", 0.25);
        inputValues.put("autoDebitDiscountInput", 0.25);
        inputValues.put("expectedLifeInput", (double) 240);
        inputValues.put("minimumPaymentProcInput", (double) 10);
        inputValues.put("minimumPaymentDolInput", (double) 5000);
        inputValues.put("utilizationInput", (double) 100);
        inputValues.put("paymentsYearInput", (double) 24);
        inputValues.put("prepaySpeedInput", (double) 50);
        inputValues.put("introTermPeriodInput", (double) 360);
        inputValues.put("introTermRateInput", 8.84);
        inputValues.put("introTermCapInput", 8.84);
        inputValues.put("postIntroTermMarginInput", (double) 10);
        inputValues.put("postIntroCapRateInput", (double) 10);
        inputValues.put("postIntroFloorRateInput", (double) 10);
        inputValues.put("postIntroCeilingRateInput", (double) 20);
        inputValues.put("originationCostInput", (double) 100000);
        inputValues.put("servicingCostInput", (double) 1000);
        inputValues.put("lossProvisionYearInput", (double) 25);
        inputValues.put("originationClosingInput", (double)25000);
        inputValues.put("otherOriginationClosingInput", (double) 25000);
        inputValues.put("annualInput", (double) 1000);
        inputValues.put("maintainceFeesInput", (double) 1000);
        inputValues.put("creditDisabilityInput",(double) 25 );
        inputValues.put("creditDisabilityLifeInput", 0.35);
        inputValues.put("employeeBonusInput", (double) 25 );
        return inputValues;
    }

    public Map<String, String> getInputValuesHelocLineAmount1Expected() {
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setMinimumFractionDigits(2);
        Map<String, String> inputValues = new HashMap<String, String>();
        inputValues.put("grossInterestIncomeActual", numberFormat.format((double)208500));
        inputValues.put("originationExpensesActual", numberFormat.format((double) 5000));
        inputValues.put("originationFeesActual", numberFormat.format((double) 1250));
        inputValues.put("interestIncomeActual", numberFormat.format((double) 204750));
        inputValues.put("interestExpenseSource", numberFormat.format((double) 114000));
        inputValues.put("sourceRateActual", numberFormat.format(0.02));
        inputValues.put("netInterestIncomeActual", numberFormat.format((double) 90750));
        inputValues.put("servicingExpensesActual", numberFormat.format((double) 2000));
        inputValues.put("annualFeesActual", numberFormat.format((double) 1000));
        inputValues.put("nonInterestExpenseActual", numberFormat.format((double) 1000));
        inputValues.put("lossProvisionActual", numberFormat.format((double) 1250000));
        //inputValues.put("creditInsuranceActual", numberFormat.format(3937.44));
        //inputValues.put("pretaxIncomeActual", -1132812.56);
        inputValues.put("averageBalanceActual", numberFormat.format((double) 2500000));
        inputValues.put("preTaxROAActual", numberFormat.format(-0.46));
        return inputValues;
    }

    public Map<String, Double> getInputValuesFro() {
        Map<String, Double> inputValues = new HashMap<String, Double>();
        inputValues.put("totalLineInput", (double) 250000);
        inputValues.put("baseRateInput", 6.240);
        inputValues.put("relationshipDiscountInput", (double) 0);
        inputValues.put("autoDebitDiscountInput", (double) 0);
        inputValues.put("expectedLifeInput", (double) 84);
        inputValues.put("paymentsYearInput", (double) 12);
        inputValues.put("prepaySpeedInput", 12.5);
        inputValues.put("originationCostInput", 1346.87);
        inputValues.put("servicingCostInput", (double) 75);
        inputValues.put("originationClosingInput", (double)0);
        inputValues.put("lossProvisionYearInput", 0.41);
        inputValues.put("otherOriginationClosingInput", (double) 0);
        return inputValues;
    }

    public Map<String, Double> getInputValuesHeloan() {
        Map<String, Double> inputValues = new HashMap<String, Double>();
        inputValues.put("totalLineInput", (double) 250000);
        inputValues.put("baseRateInput", 3.750);
        inputValues.put("relationshipDiscountInput", (double) 0);
        inputValues.put("autoDebitDiscountInput", 0.250);
        inputValues.put("expectedLifeInput", (double) 60);
        inputValues.put("paymentsYearInput", (double) 12);
        inputValues.put("prepaySpeedInput", (double) 15);
        inputValues.put("originationCostInput", 1246.27);
        inputValues.put("servicingCostInput", (double) 105);
        inputValues.put("originationClosingInput", (double)0);
        inputValues.put("lossProvisionYearInput", 0.41);
        inputValues.put("otherOriginationClosingInput", (double) 0);
        return inputValues;
    }


    public void fillInForm() throws InterruptedException {
        Map<String, Double> inputValues = getInputValues();
        type(totalLineInput, inputValues.get("totalLineInput").toString());
        //type(baseRateInput, inputValues.get("baseRateInput").toString());
        type(relationshipDiscountInput, inputValues.get("relationshipDiscountInput").toString());
        type(autoDebitDiscountInput, inputValues.get("autoDebitDiscountInput").toString());
        type(expectedLifeInput, inputValues.get("expectedLifeInput").toString());
        type(minimumPaymentProcInput, inputValues.get("minimumPaymentProcInput").toString());
        type(minimumPaymentDolInput, inputValues.get("minimumPaymentDolInput").toString());
        type(utilizationInput, inputValues.get("utilizationInput").toString());
        type(paymentsYearInput, inputValues.get("paymentsYearInput").toString());
        type(prepaySpeedInput, inputValues.get("prepaySpeedInput").toString());
        type(introTermPeriodInput, inputValues.get("introTermPeriodInput").toString());
        type(introTermRateInput, inputValues.get("introTermRateInput").toString());
        type(introTermCapInput, inputValues.get("introTermCapInput").toString());
        type(postIntroTermMarginInput, inputValues.get("postIntroTermMarginInput").toString());
        //type(postIntroTermMarginInput, inputValues.get("postIntroTermMarginInput").toString().replace(".", ","));
        type(postIntroCapRateInput, inputValues.get("postIntroCapRateInput").toString());
        //type(postIntroCapRateInput, inputValues.get("postIntroCapRateInput").toString().replace(".", ","));
        type(postIntroFloorRateInput, inputValues.get("postIntroFloorRateInput").toString());
        //type(postIntroFloorRateInput, inputValues.get("postIntroFloorRateInput").toString().replace(".", ","));
        type(postIntroCeilingRateInput, inputValues.get("postIntroCeilingRateInput").toString());
        type(originationCostInput, inputValues.get("originationCostInput").toString());
        type(servicingCostInput, inputValues.get("servicingCostInput").toString());
        type(lossProvisionYearInput, inputValues.get("lossProvisionYearInput").toString());
        type(originationClosingInput, inputValues.get("originationClosingInput").toString());
        type(otherOriginationClosingInput, inputValues.get("otherOriginationClosingInput").toString());
        type(annualInput, inputValues.get("annualInput").toString());
        type(maintainceFeesInput, inputValues.get("maintainceFeesInput").toString());
    }

    public void fillInFormHelocLineAmount1() throws InterruptedException {
        Map<String, Double> inputValues = getInputValuesHelocLineAmount1();
        type(totalLineInput, inputValues.get("totalLineInput").toString());
        type(baseRateInput, "11.05");
        type(relationshipDiscountInput, inputValues.get("relationshipDiscountInput").toString());
        type(autoDebitDiscountInput, inputValues.get("autoDebitDiscountInput").toString());
        type(expectedLifeInput, inputValues.get("expectedLifeInput").toString());
        type(minimumPaymentProcInput, inputValues.get("minimumPaymentProcInput").toString());
        type(minimumPaymentDolInput, inputValues.get("minimumPaymentDolInput").toString());
        type(utilizationInput, inputValues.get("utilizationInput").toString());
        type(paymentsYearInput, inputValues.get("paymentsYearInput").toString());
        type(prepaySpeedInput, inputValues.get("prepaySpeedInput").toString());
        selectFromDropdown(interestOnlyDropdown, "Y");
        type(introTermPeriodInput, inputValues.get("introTermPeriodInput").toString());
        type(introTermRateInput, inputValues.get("introTermRateInput").toString());
        type(introTermCapInput, inputValues.get("introTermCapInput").toString());
        type(postIntroTermMarginInput, inputValues.get("postIntroTermMarginInput").toString());
        //type(postIntroTermMarginInput, inputValues.get("postIntroTermMarginInput").toString().replace(".", ","));
        type(postIntroCapRateInput, inputValues.get("postIntroCapRateInput").toString());
        //type(postIntroCapRateInput, inputValues.get("postIntroCapRateInput").toString().replace(".", ","));
        type(postIntroFloorRateInput, inputValues.get("postIntroFloorRateInput").toString());
        //type(postIntroFloorRateInput, inputValues.get("postIntroFloorRateInput").toString().replace(".", ","));
        type(postIntroCeilingRateInput, inputValues.get("postIntroCeilingRateInput").toString());
        type(originationCostInput, inputValues.get("originationCostInput").toString());
        type(servicingCostInput, inputValues.get("servicingCostInput").toString());
        type(lossProvisionYearInput, inputValues.get("lossProvisionYearInput").toString());
        type(originationClosingInput, inputValues.get("originationClosingInput").toString());
        type(otherOriginationClosingInput, inputValues.get("otherOriginationClosingInput").toString());
        type(annualInput, inputValues.get("annualInput").toString());
        type(maintainceFeesInput, inputValues.get("maintainceFeesInput").toString());
        type(creditDisabilityInput, inputValues.get("creditDisabilityInput").toString());
        type(creditDisabilityLifeInput, inputValues.get("creditDisabilityLifeInput").toString());
        type(employeeBonusInput, inputValues.get("employeeBonusInput").toString());
    }

    public void fillInFormFro() throws InterruptedException {
        Map<String, Double> inputValues = getInputValuesFro();
        type(totalLineInput, inputValues.get("totalLineInput").toString());
        type(baseRateInput, "6.240");
        type(relationshipDiscountInput, inputValues.get("relationshipDiscountInput").toString());
        type(autoDebitDiscountInput, inputValues.get("autoDebitDiscountInput").toString());
        type(expectedLifeInput, inputValues.get("expectedLifeInput").toString());
        type(paymentsYearInput, inputValues.get("paymentsYearInput").toString());
        type(prepaySpeedInput, inputValues.get("prepaySpeedInput").toString());
        type(originationCostInput, inputValues.get("originationCostInput").toString());
        type(servicingCostInput, inputValues.get("servicingCostInput").toString());
        type(lossProvisionYearInput, inputValues.get("lossProvisionYearInput").toString());
        type(originationClosingInput, inputValues.get("originationClosingInput").toString());
        type(otherOriginationClosingInput, inputValues.get("otherOriginationClosingInput").toString());
        //type(annualInput, inputValues.get("annualInput").toString());
        //type(maintainceFeesInput, inputValues.get("maintainceFeesInput").toString());
    }

        public void fillInFormHeloan() throws InterruptedException {
        Map<String, Double> inputValues = getInputValuesHeloan();
        type(totalLineInput, inputValues.get("totalLineInput").toString());
        type(baseRateInput, "3.750");
        type(relationshipDiscountInput, inputValues.get("relationshipDiscountInput").toString());
        type(autoDebitDiscountInput, inputValues.get("autoDebitDiscountInput").toString());
        type(expectedLifeInput, inputValues.get("expectedLifeInput").toString());
        type(paymentsYearInput, inputValues.get("paymentsYearInput").toString());
        type(prepaySpeedInput, inputValues.get("prepaySpeedInput").toString());
        type(originationCostInput, inputValues.get("originationCostInput").toString());
        type(servicingCostInput, inputValues.get("servicingCostInput").toString());
        type(lossProvisionYearInput, inputValues.get("lossProvisionYearInput").toString());
        type(originationClosingInput, inputValues.get("originationClosingInput").toString());
        type(otherOriginationClosingInput, inputValues.get("otherOriginationClosingInput").toString());
        //type(annualInput, inputValues.get("annualInput").toString());
        //type(maintainceFeesInput, inputValues.get("maintainceFeesInput").toString());
    }


    public Double getTotalLine(){
        return Double.parseDouble(getInputText(totalLineInput));
    }

    public Double getBaseRate(){ return Double.parseDouble(getInputText(baseRateInput)); }

    public Double getBaseRateActual(){ return Double.parseDouble(getInputText(baseRateInput)); }

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

    public Double getMinimumPaymentDol() {return Double.parseDouble(getInputText(minimumPaymentDolInput));}

    public Double getUtilization() {return Double.parseDouble(getInputText(utilizationInput));}

    public Double getPaymentsYear() {return Double.parseDouble(getInputText(paymentsYearInput));}

    public Double getPrepaySpeed() {return Double.parseDouble(getInputText(prepaySpeedInput));}

    public Double getIntroTermPeriod() {return Double.parseDouble(getInputText(introTermPeriodInput));}

    public Double getIntroTermRate() {return Double.parseDouble(getInputText(introTermRateInput));}

    public Double getIntroTermCap() {return Double.parseDouble(getInputText(introTermCapInput));}

    public Double getPostIntroTermMargin() {return Double.parseDouble(getInputText(postIntroTermMarginInput));}

    public Double getPostIntroCapRate() {return Double.parseDouble(getInputText(postIntroCapRateInput));}

    public Double getPostIntroFloorRate() {return Double.parseDouble(getInputText(postIntroFloorRateInput));}

    public Double getPostIntroCeilingRate() {return Double.parseDouble(getInputText(postIntroCeilingRateInput));}

    public Double getOriginationCost() {return Double.parseDouble(getInputText(originationCostInput));}

    public Double getservicingCost() {return Double.parseDouble(getInputText(servicingCostInput));}

    public Double getLossProvisionYear() {return Double.parseDouble(getInputText(lossProvisionYearInput));}

    public Double getOriginationClosing() {return Double.parseDouble(getInputText(originationClosingInput));}

    public Double getOtherOriginationClosing() {return Double.parseDouble(getInputText(otherOriginationClosingInput));}

    public Double getAnnual() {return Double.parseDouble(getInputText(annualInput));}

    public Double getMaintainceFees() {return Double.parseDouble(getInputText(maintainceFeesInput));}

    public String getGrossInterestIncomeExpected(){return getElementText(grossInterestIncomeExpected);}

    public String getGrossInterestIncomeActual(){return getElementText(grossInterestIncomeActual);}

    public String getoriginationExpensesExpected(){return getElementText(originationExpensesExpected);}

    public String getoriginationExpensesActual(){return getElementText(originationExpensesActual);}

    public String getoriginationFeesActual(){return getElementText(originationFeesActual);}

    public String getoriginationFeesExpected(){return getElementText(originationFeesExpected);}

    public String getinterestIncomeActual(){return getElementText(interestIncomeActual);}

    public String getinterestIncomeExpected(){return getElementText(interestIncomeExpected);}

    public String getinterestExpenseSourceActual(){return getElementText(interestExpenseSourceActual);}

    public String getinterestExpenseSourceExpected(){return getElementText(interestExpenseSourceExpected);}

    public String getsourceRateActual(){return getElementText(sourceRateActual);}

    public String getsourceRateExpected(){return getElementText(sourceRateActual);}

    public String getnetInterestIncomeActual(){return getElementText(netInterestIncomeActual);}

    public String getnetInterestIncomeExpected(){return getElementText(netInterestIncomeExpected);}

    public String getservicingExpensesActual(){return getElementText(servicingExpensesActual);}

    public String getservicingExpensesExpected(){return getElementText(servicingExpensesExpected);}

    public String getannualFeesActual(){return getElementText(annualFeesActual);}

    public String getannualFeesExpected(){return getElementText(annualFeesExpected);}

    public String getnonInterestExpenseActual(){return getElementText(nonInterestExpenseActual);}

    public String getnonInterestExpenseExpected(){return getElementText(nonInterestExpenseExpected);}

    public String getlossProvisionActual(){return getElementText(lossProvisionActual);}

    public String getlossProvisionExpected(){return getElementText(lossProvisionExpected);}

    public String getcreditInsuranceActual(){return getElementText(creditInsuranceActual);}

    public String getcreditInsuranceExpected(){return getElementText(creditInsuranceExpected);}

    public String getpretaxIncomeActual(){return getElementText(pretaxIncomeActual);}

    public String getpretaxIncomeExpected(){return getElementText(pretaxIncomeExpected);}

    public String getstateTaxesActual(){return getElementText(stateTaxesActual);}

    public String getstateTaxesExpected(){return getElementText(stateTaxesExpected);}

    public String getfederalTaxesActual(){return getElementText(federalTaxesActual);}

    public String getfederalTaxesExpected(){return getElementText(federalTaxesExpected);}

    public String gettaxesActual(){return getElementText(taxesActual);}

    public String gettaxesExpected(){return getElementText(taxesExpected);}

    public String getnetIncomeActual(){return getElementText(netIncomeActual);}

    public String getnetIncomeExpected(){return getElementText(netIncomeExpected);}

    public String getaverageBalanceActual(){return getElementText(averageBalanceActual);}

    public String getaverageBalanceExpected(){return getElementText(averageBalanceExpected);}

    public String getpreTaxROAActual(){return getElementText(preTaxROAActual);}

    public String getpreTaxROAExpected(){return getElementText(preTaxROAExpected);}

    public String getafterTaxROAActual(){return getElementText(afterTaxROAActual);}

    public String getafterTaxROAExpected(){return getElementText(afterTaxROAExpected);}







}
