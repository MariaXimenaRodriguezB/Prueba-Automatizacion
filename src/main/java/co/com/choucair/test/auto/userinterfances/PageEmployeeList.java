package co.com.choucair.test.auto.userinterfances;

import net.serenitybdd.screenplay.targets.Target;

public class PageEmployeeList {

    public static final Target BUTTON_ADD = Target.the("Button create new employee").locatedBy("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");

    public static final Target INPUT_EMPLOYEEID_FIND = Target.the("Input Employee id list employee").locatedBy("//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input");

    public static final Target BUTTON_SEARCH = Target.the("Find employee").locatedBy("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");

    public static final Target LIST_EMPLOYEE_VALUE = Target.the("Input Employee result list employee").locatedBy("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']/div[{0}]/div");

}
