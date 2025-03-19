package co.com.choucair.test.auto.questions;

import co.com.choucair.test.auto.interactions.FindEmployeeForId;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class QuestionRegister implements Question<Boolean> {

    public static QuestionRegister value() {return new QuestionRegister();}

    @Override
    public Boolean answeredBy(Actor actor) {

        String valueId = actor.recall("Valor");

        actor.attemptsTo(FindEmployeeForId.findEmployee(valueId));

        String valueIdResult = actor.recall("Valor1");

        String valueNameResult = actor.recall("Valor2");

        Boolean resultvalueName = valueNameResult.equals("XimenaR1234567 XimenaRodriguez1234567");

        System.out.println("resulta name " + resultvalueName);

        return valueId.equals(valueIdResult);
    }
}
