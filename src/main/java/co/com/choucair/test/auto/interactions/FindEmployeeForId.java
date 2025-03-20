package co.com.choucair.test.auto.interactions;

import co.com.choucair.test.auto.utils.ElementValue;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.test.auto.userinterfances.MenuMain.OPTION_MENU;
import static co.com.choucair.test.auto.userinterfances.PageEmployeeList.*;

public class FindEmployeeForId implements Interaction {

    private final String id;

    public FindEmployeeForId(String id) {this.id = id;}

    public static FindEmployeeForId findEmployee(String id) {return Tasks.instrumented(FindEmployeeForId.class,id);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo( Click.on(OPTION_MENU.of("PIM")),
                WaitStatic.milliseconds(3000),
                Click.on(INPUT_EMPLOYEEID_FIND),
                Enter.theValue(id).into(INPUT_EMPLOYEEID_FIND),
                WaitStatic.milliseconds(3000),
                Click.on(BUTTON_SEARCH),
                WaitStatic.milliseconds(3000),
                ElementValue.message(LIST_EMPLOYEE_VALUE.of("2"),"valueTextOne"),
                ElementValue.message(LIST_EMPLOYEE_VALUE.of("3"),"valueTextTwo"));

    }
}
