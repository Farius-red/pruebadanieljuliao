package co.com.choucair.certification.pruebadanieljuliao.tasks;

import co.com.choucair.certification.pruebadanieljuliao.userinterface.UtestInicio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private UtestInicio choucairAcademyPage;

    public static OpenUp thePade() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(choucairAcademyPage));
    }
}
