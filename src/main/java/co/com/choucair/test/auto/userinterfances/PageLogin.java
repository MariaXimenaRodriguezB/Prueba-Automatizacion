package co.com.choucair.test.auto.userinterfances;


import net.serenitybdd.screenplay.targets.Target;

public class PageLogin {

    public static final Target INPUT_USER = Target.the("Input Username").locatedBy("//input[@name='username']");

    public static final Target INPUT_PASSWORD = Target.the("Input Password").locatedBy("//input[@name='password']");

    public static final Target BUTTON_LOGIN = Target.the("Button Login").locatedBy("//button[text()=' Login ']");

}
