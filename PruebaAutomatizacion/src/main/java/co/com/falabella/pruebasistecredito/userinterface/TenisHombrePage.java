package co.com.falabella.pruebasistecredito.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TenisHombrePage {

    public static final Target FILTRAR_PRODUCTO_MARCA = Target.the("Opcion filtrar producto por marca").located(By.id("testId-Accordion-Marca"));
    public static final Target OPCION_MARCA = Target.the("Opcion de marca").locatedBy("//*[@class='jsx-53718149 label-text' and .= '{0}']");
    public static final Target PRODUCTO = Target.the("Producto para seleccionar").locatedBy("//*[@style='overflow: hidden;' and .= '{0}']");

}
