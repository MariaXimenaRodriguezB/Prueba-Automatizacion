package co.com.choucair.test.auto.tasks;

import co.com.choucair.test.auto.interactions.WaitStatic;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.test.auto.userinterfances.PageLogin.*;
import static co.com.choucair.test.auto.utils.EnvironmentConstants.*;

public class Login implements Task {

    public static Login withCredentials() {return Tasks.instrumented(Login.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUT_USER),
                Enter.theValue(userApp).into(INPUT_USER),
                Click.on(INPUT_PASSWORD),
                Enter.theValue(passApp).into(INPUT_PASSWORD),
                Click.on(BUTTON_LOGIN)
        );
    }
}
