package co.com.choucairacademy.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchCoursePage extends PageObject {
    public static final Target INPUT_COURSE = Target.the("Txt to search courses by name").locatedBy("//fieldset[@class='coursesearchbox invisiblefieldset']//input[@id='coursesearchbox']");
    public static final Target BUTTON_GO = Target.the("").locatedBy("//fieldset[@class='coursesearchbox invisiblefieldset']//button[@class='btn btn-secondary']");
    public static final Target NAME_COURSE = Target.the("").locatedBy("//h4[@class='result-title']//a[contains(text(),'Bancolombia')]");
    public static final Target TITLE_COURSE = Target.the("").locatedBy("//div[@class='page-header-headings']//h1");
}
