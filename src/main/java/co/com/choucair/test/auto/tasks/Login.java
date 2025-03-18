package co.com.choucair.test.auto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Login implements Task {


    public static Login withCredentials() {return Tasks.instrumented(Login.class);}

    @Override
    public <T extends Actor> void performAs(T t) {

    }
}
