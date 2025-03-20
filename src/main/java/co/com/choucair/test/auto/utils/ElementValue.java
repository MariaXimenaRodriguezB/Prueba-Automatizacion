package co.com.choucair.test.auto.utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Value;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class ElementValue implements Task {
    private final Target element;
    private final String pass;


    public ElementValue(Target element, String pass) {
        this.element = element;
        this.pass = pass;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String texto;
        if (pass.equals("valueInput")){
             texto = Value.of(element).answeredBy(actor);
        } else {
            texto = Text.of(element).answeredBy(actor);

        }

        actor.remember(pass,texto);
    }

    public static ElementValue message (Target element, String pass) {
        return instrumented(ElementValue.class,element,pass);
    }


}
