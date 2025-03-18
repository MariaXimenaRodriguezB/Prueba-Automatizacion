package co.com.choucair.test.auto.userinterfances;

import net.serenitybdd.screenplay.targets.Target;

public class MenuMain {

    public static final Target OPTION_MENU = Target.the("Option seleccionada {0} del menu lateral").locatedBy("//span[text()='{0}']");

}
