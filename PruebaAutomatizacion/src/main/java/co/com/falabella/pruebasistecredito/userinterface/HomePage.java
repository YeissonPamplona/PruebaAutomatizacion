package co.com.falabella.pruebasistecredito.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target POP_UP = Target.the("PopUp aviso importante").located(By.id("fake-close"));
    public static final Target BANNER_BUSCAR = Target.the("Banner para buscar producto").locatedBy("//*[@class='SearchBar-module_searchBar__Input__3xQbs']");
    public static final Target OPCION_PRODUCTO = Target.the("Opcion para buscar producto").locatedBy("//*[@class='SearchList-module_searchListItem__3vy5z' and .= '{0}']");
}
