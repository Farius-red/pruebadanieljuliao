package co.com.choucair.certification.pruebadanieljuliao.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpPage  extends PageObject {

     public  static final Target SIGN_UP_BUTTON = Target.the("the button redirect to the registration page").located(By.className("unauthenticated-nav-bar__sign-up"));
     public  static  final Target INPUT_FIRSTNAME= Target.the("fill input firstname").located(By.xpath("//*[@id=\"firstName\"]"));
     public  static  final Target INPUT_LASTNAME= Target.the("fill input lastName").located(By.xpath("//*[@id=\"lastName\"]"));
     public  static  final Target INPUT_EMAIL= Target.the("fill input email").located(By.xpath("//*[@id=\"email\"]"));


    public  static  final Target INPUT_BIRTHMONTH= Target.the("fill input birthMonth").located(By.xpath("//*[@id=\"birthMonth\"]/option[8]"));
    public  static  final Target INPUT_BIRTHDAY= Target.the("fill input birthDAY").located(By.xpath("//*[@id=\"birthDay\"]/option[8]"));
    public  static  final Target INPUT_BIRTHYEAR= Target.the("fill input birthYEAR").located(By.xpath("//*[@id=\"birthYear\"]/option[11]"));

    public  static  final Target BUTTON_NEXT= Target.the("CLICK BUTTON NEXT").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));

    public  static  final Target INPUT_ZIP= Target.the("fill input id zip").located(By.id("zip"));
    public  static  final  Target INPUT_CITY= Target.the("fill input city").located(By.id("city"));
    public  static  final Target BUTTON_NEXT_DIVICES= Target.the("CLICK BUTTON NEXT_DIVICES").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));
    public  static final  Target INPUT_COMPUTER= Target.the("FILL input your computer").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/i"));
    public  static  final Target INPUT_VERSION= Target.the("fill input version").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span/i"));
    public static final Target ICON_LENGUAGE= Target.the("click en icoo version").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span/i"));
    public  static  final Target INPUT_LENGUAGE= Target.the("fill input Lenguage").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/ul"));
    public  static  final Target ICON_VERSION= Target.the("fill input Lenguage").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/ul"));
    public  static  final Target BUTTON_LAST_STEP= Target.the("CLICK BUTTON LastStep").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));


    public  static  final Target INPUT_PASWORD= Target.the("fill input password").located(By.id("password"));
    public  static  final Target INPUT_CONFIRM_PASWORD= Target.the("fill input confirmPassword").located(By.id("confirmPassword"));


    public  static  final Target CLICK_INPUT_TERM_OF_USE= Target.the("click input checkout term of use").located(By.id("termOfUse"));
    public  static  final Target CLICK_INPUT_PRYVACY= Target.the("click input checkout  privacy & security").located(By.id("privacySetting"));
    public  static  final Target BUTTON_COMPLETE_SETUP= Target.the("CLICK BUTTON  Complete Setup").located(By.xpath("//*[@id=\"laddaBtn\"]"));


}
