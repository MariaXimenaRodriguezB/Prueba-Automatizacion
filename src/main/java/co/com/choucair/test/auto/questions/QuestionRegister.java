package co.com.choucair.test.auto.questions;

import co.com.choucair.test.auto.interactions.FindEmployeeForId;
import co.com.choucair.test.auto.models.ExecutionData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class QuestionRegister implements Question<Boolean> {

    public static QuestionRegister value() {return new QuestionRegister();}

    @Override
    public Boolean answeredBy(Actor actor) {

        String valueId = actor.recall("valueInput");

        actor.attemptsTo(FindEmployeeForId.findEmployee(valueId));

        String valueIdResult = actor.recall("valueTextOne");

        String valueNameResult = actor.recall("valueTextTwo");

        Boolean resultvalueName = valueNameResult.equals(ExecutionData.getFirstName()+" "+ExecutionData.getMiddleName());

        Boolean resultvalueId = valueId.equals(valueIdResult);

        return resultvalueId && resultvalueName;
    }
}
