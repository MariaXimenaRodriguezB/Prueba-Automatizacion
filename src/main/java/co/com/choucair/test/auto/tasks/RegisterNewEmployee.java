package co.com.choucair.test.auto.tasks;

import co.com.choucair.test.auto.interactions.WaitStatic;
import co.com.choucair.test.auto.models.DataForRegister;
import co.com.choucair.test.auto.models.ExecutionData;
import co.com.choucair.test.auto.utils.ElementValue;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;


import static co.com.choucair.test.auto.userinterfances.MenuMain.OPTION_MENU;
import static co.com.choucair.test.auto.userinterfances.PageAddEmployee.*;
import static co.com.choucair.test.auto.userinterfances.PageEmployeeList.*;

public class RegisterNewEmployee implements Task {

    private final DataForRegister dataForRegister;

    public RegisterNewEmployee(DataForRegister dataForRegister) {
        this.dataForRegister = dataForRegister;
    }

    public static RegisterNewEmployee register(DataForRegister dataForRegister) {return Tasks.instrumented(RegisterNewEmployee.class, dataForRegister);}

    @Override
    public <T extends Actor> void performAs(T actor) {

        ExecutionData.setFirstName(dataForRegister.getFirstName());
        ExecutionData.setMiddleName(dataForRegister.getMiddleName());

        actor.attemptsTo(
                //Menu
                Click.on(OPTION_MENU.of("PIM")),
                // Employee List
                Click.on(BUTTON_ADD),
                WaitStatic.milliseconds(3000),
                // Add Employee
                CheckCheckbox.of(CHECKBOX),
                Click.on(INPUT_FORMREGISTER.of("firstName")),
                Enter.theValue(dataForRegister.getFirstName()).into(INPUT_FORMREGISTER.of("firstName")),
                Click.on(INPUT_FORMREGISTER.of("middleName")),
                Enter.theValue(dataForRegister.getMiddleName()).into(INPUT_FORMREGISTER.of("middleName")),
                Click.on(INPUT_FORMREGISTER.of("lastName")),
                Enter.theValue(dataForRegister.getLastName()).into(INPUT_FORMREGISTER.of("lastName")),
                ElementValue.message(INPUT_EMPLOYEEID,"valueInput"),
                Click.on(INPUT_USERNAME),
                Enter.theValue(dataForRegister.getUserName()).into(INPUT_USERNAME),
                Click.on(INPUT_USERPASSWORD),
                Enter.theValue(dataForRegister.getUserPassword()).into(INPUT_USERPASSWORD),
                Click.on(INPUT_CONFIRMPASSWORD),
                Enter.theValue(dataForRegister.getUserPassword()).into(INPUT_CONFIRMPASSWORD),
                Click.on(BUTTON_SAVE),
                WaitStatic.milliseconds(5000));
    }

}
