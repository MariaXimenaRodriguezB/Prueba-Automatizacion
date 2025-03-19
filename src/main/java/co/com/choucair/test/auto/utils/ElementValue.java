package co.com.choucair.test.auto.utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Value;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class ElementValue implements Task {
    private final Target element;
    private final String clave;


    public ElementValue(Target elemento, String clave) {
        this.element = elemento;
        this.clave = clave;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String texto;
        if (clave.equals("Valor")){
             texto = Value.of(element).answeredBy(actor);
        } else {
            texto = Text.of(element).answeredBy(actor);

        }

        actor.remember(clave,texto);
    }

    public static ElementValue message (Target elemento, String clave) {
        return instrumented(ElementValue.class,elemento,clave);
    }


}
