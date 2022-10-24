package co.com.choucairacademy.interactions;

import co.com.choucairacademy.userinterface.Dashboard;
import co.com.choucairacademy.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;

public class EnterDataCourse implements Interaction {
    private final String course;

    public EnterDataCourse(String course) {
        this.course = course;
    }

    public static EnterDataCourse course(String course) {
        return Tasks.instrumented(EnterDataCourse.class, course);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(Dashboard.CLICKU_HYPER),
                Enter.theValue(course).into(SearchCoursePage.INPUT_COURSE),
                Click.on(SearchCoursePage.BUTTON_GO),
                Click.on(SearchCoursePage.NAME_COURSE)
        );
    }


}
