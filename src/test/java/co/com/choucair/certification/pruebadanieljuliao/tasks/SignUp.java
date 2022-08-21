package co.com.choucair.certification.pruebadanieljuliao.tasks;

import co.com.choucair.certification.pruebadanieljuliao.userinterface.SignUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.time.Duration;

public class SignUp  implements Task{
    public static SignUp theRegister() {
        return Tasks.instrumented(SignUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(Click.on(SignUpPage.SIGN_UP_BUTTON),
               Enter.theValue("Daniel").into(SignUpPage.INPUT_FIRSTNAME),
               Enter.theValue("juliao").into(SignUpPage.INPUT_LASTNAME),
               Enter.theValue("daniel.juliao.tecni@gmail.com").into((SignUpPage.INPUT_EMAIL)),
               Click.on(SignUpPage.INPUT_BIRTHMONTH),
               Click.on(SignUpPage.INPUT_BIRTHDAY),
               Click.on(SignUpPage.INPUT_BIRTHYEAR),
               Click.on(SignUpPage.BUTTON_NEXT),
               Enter.theValue("1111512").into(SignUpPage.INPUT_ZIP),
               Enter.theValue("Bogotá").into(SignUpPage.INPUT_CITY),
               Click.on(SignUpPage.BUTTON_NEXT_DIVICES),

              // Enter.theValue("Ubuntu").into(SignUpPage.INPUT_COMPUTER),
               Click.on(SignUpPage.ICON_LENGUAGE),
              // WaitUntil.the(SignUpPage.ICON_VERSION,10)).forNoMoreThan(10).seconds(),
               Click.on(SignUpPage.INPUT_LENGUAGE),
               Click.on(SignUpPage.INPUT_COMPUTER),
               Click.on(SignUpPage.INPUT_VERSION),

               Click.on(SignUpPage.ICON_VERSION),

               Click.on(SignUpPage.BUTTON_LAST_STEP),
               Enter.theValue("0D123456789b").into(SignUpPage.INPUT_PASWORD),
                  Enter.theValue("0D123456789b").into(SignUpPage.INPUT_CONFIRM_PASWORD),
               Click.on(SignUpPage.CLICK_INPUT_PRYVACY),
              Click.on(SignUpPage.CLICK_INPUT_TERM_OF_USE),
               Click.on(SignUpPage.BUTTON_COMPLETE_SETUP)


       );
    }
}
