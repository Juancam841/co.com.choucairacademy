package co.com.proyectobase.tasks;

import co.com.proyectobase.userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginPage.LOGIN_BUTTON),
                Enter.theValue("jvillac").into(LoginPage.INPUT_USER),
                Enter.theValue("Choucair2022*").into(LoginPage.INPUT_PASS),
                Click.on(LoginPage.ENTER_BUTTON)
                );
    }
}
