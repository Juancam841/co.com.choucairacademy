package co.com.choucairacademy.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Dashboard extends PageObject {
    public static final Target CLICKU_HYPER = Target.the("Para ingresar a search course").locatedBy("//*[@id=\"universidad\"]/div[@class='card-header']");
}
