package co.com.choucair.test.auto.userinterfances;

import net.serenitybdd.screenplay.targets.Target;

public class PageAddEmployee {


    public static final Target CHECKBOX = Target.the("Check box create login details").locatedBy("//label/span[@class = 'oxd-switch-input oxd-switch-input--active --label-right']");

    public static final Target INPUT_FORMREGISTER = Target.the("Input utilizado {0} ").locatedBy("//input[@name='{0}']");

    public static final Target INPUT_EMPLOYEEID = Target.the("Input Employee id register employee").locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input");


    public static final Target INPUT_USERNAME = Target.the("Input username register employee").locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input");

    public static final Target INPUT_USERPASSWORD = Target.the("Input password register employee").locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input");

    public static final Target INPUT_CONFIRMPASSWORD = Target.the("Input confirm password register employee").locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input");

    public static final Target BUTTON_SAVE = Target.the("Button Save Register").locatedBy("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");

}
