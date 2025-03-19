package co.com.choucair.test.auto.tasks;

import co.com.choucair.test.auto.interactions.WaitStatic;
import co.com.choucair.test.auto.utils.ElementValue;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;


import static co.com.choucair.test.auto.userinterfances.MenuMain.OPTION_MENU;
import static co.com.choucair.test.auto.userinterfances.PageAddEmployee.*;
import static co.com.choucair.test.auto.userinterfances.PageEmployeeList.*;

public class RegisterNewEmployee implements Task {

    public static RegisterNewEmployee register() {return Tasks.instrumented(RegisterNewEmployee.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Menu
                Click.on(OPTION_MENU.of("PIM")),
                // Employee List
                Click.on(BUTTON_ADD),
                WaitStatic.milliseconds(3000),
                // Add Employee
                CheckCheckbox.of(CHECKBOX),
                Click.on(INPUT_FORMREGISTER.of("firstName")),
                Enter.theValue("XimenaR1234567").into(INPUT_FORMREGISTER.of("firstName")),
                Click.on(INPUT_FORMREGISTER.of("middleName")),
                Enter.theValue("XimenaRodriguez1234567").into(INPUT_FORMREGISTER.of("middleName")),
                Click.on(INPUT_FORMREGISTER.of("lastName")),
                Enter.theValue("XimenaBorda1234567").into(INPUT_FORMREGISTER.of("lastName")),
                ElementValue.message(INPUT_EMPLOYEEID,"Valor"),
                Click.on(INPUT_USERNAME),
                Enter.theValue("Maria1234567").into(INPUT_USERNAME),
                Click.on(INPUT_USERPASSWORD),
                Enter.theValue("MariaXimena5678").into(INPUT_USERPASSWORD),
                Click.on(INPUT_CONFIRMPASSWORD),
                Enter.theValue("MariaXimena5678").into(INPUT_CONFIRMPASSWORD),
                Click.on(BUTTON_SAVE),
                WaitStatic.milliseconds(5000));
    }

}
