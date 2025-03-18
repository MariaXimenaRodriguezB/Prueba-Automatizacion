package co.com.choucair.test.auto.tasks;

import co.com.choucair.test.auto.interactions.WaitStatic;
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
                Enter.theValue("Ximena1").into(INPUT_FORMREGISTER.of("firstName")),
                Click.on(INPUT_FORMREGISTER.of("middleName")),
                Enter.theValue("Ximena2").into(INPUT_FORMREGISTER.of("middleName")),
                Click.on(INPUT_FORMREGISTER.of("lastName")),
                Enter.theValue("Ximena3").into(INPUT_FORMREGISTER.of("lastName")),
                Click.on(INPUT_USERNAME),
                Enter.theValue("Ximena4").into(INPUT_USERNAME),
                Click.on(INPUT_USERPASSWORD),
                Enter.theValue("Ximena4567").into(INPUT_USERPASSWORD)
                );
    }
}
