package co.com.choucairacademy.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchCoursePage extends PageObject {
    public static final Target INPUT_COURSE = Target.the("Txt to search courses by name").locatedBy("//fieldset[@class='coursesearchbox invisiblefieldset']//input[@id='coursesearchbox']");
    public static final Target BUTTON_GO = Target.the("").locatedBy("//fieldset[@class='coursesearchbox invisiblefieldset']//button[@class='btn btn-secondary']");
    public static final Target NAME_COURSE = Target.the("").locatedBy("body.format-site.path-search.chrome.dir-ltr.lang-es_mx.yui-skin-sam.yui3-skin-sam.operacion-choucairtesting-com--academy.pagelayout-standard.course-1.context-1.jsenabled:nth-child(2) div.container-fluid:nth-child(9) div.row.pb-3:nth-child(2) div.col-12 div:nth-child(2) div.search-results:nth-child(6) div.result h4.result-title > a:nth-child(2)");
    public static final Target TITLE_COURSE = Target.the("").locatedBy("//div[@class='page-header-headings']//h1");
}
