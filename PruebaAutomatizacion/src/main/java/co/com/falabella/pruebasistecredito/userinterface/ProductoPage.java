package co.com.falabella.pruebasistecredito.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductoPage {

    public static final Target PRECIO_PRODUCTO = Target.the("Precio del producto").locatedBy("//*[@class='copy13 primary high jsx-3736277290 normal    ']");
    public static final Target TALLA_PRODUCTO = Target.the("Talla del producto").locatedBy("//*[@class='button-wrapper']/*[text() = '{0}']");
    public static final Target BOTON_AGREGAR_CARRITO = Target.the("Boton agregar al carrito").located(By.id("buttonForCustomers"));
    public static final Target IR_CARRITO = Target.the("Boton para ir al carrito").located(By.id("linkButton"));

}
