package co.com.falabella.pruebasistecredito.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DespachoPage {

    public static final Target DEPARTAMENTO = Target.the("Seleccionar departamento").located(By.id("region"));
    public static final Target CIUDAD = Target.the("Seleccionar ciudad").located(By.id("ciudad"));
    public static final Target BARRIO = Target.the("Seleccionar barrio").located(By.id("comuna"));
    public static final Target BOTON_CONTINUAR = Target.the("Boton Continuar").locatedBy("//*[@class='fbra_formItem fbra_formItem--Button fbra_input--field04']");
    public static final Target DIRECCION = Target.the("Ingresar direccion").located(By.id("address"));
    public static final Target NUM_DEPARTAMENTO = Target.the("Ingresar numero apto").located(By.id("departmentNumber"));
    public static final Target BOTON_INGRESAR_DIR = Target.the("Boton para ingresar direccion").locatedBy("//*[@class='fbra_button fbra_test_button fbra_formItem__useAddress']");
    public static final Target BOTON_IR_PAGAR = Target.the("Boton para ir a pagar").locatedBy("//button[text() = 'Continuar']");

}
