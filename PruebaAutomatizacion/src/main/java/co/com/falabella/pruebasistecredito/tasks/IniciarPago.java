package co.com.falabella.pruebasistecredito.tasks;

import co.com.falabella.pruebasistecredito.models.DatosEnvio;
import co.com.falabella.pruebasistecredito.userinterface.CarritoPage;
import co.com.falabella.pruebasistecredito.userinterface.DespachoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.falabella.pruebasistecredito.userinterface.DespachoPage.*;

public class IniciarPago implements Task {

    private List<DatosEnvio> datosEnvios;

    public IniciarPago(List<DatosEnvio> datosEnvios) {
        this.datosEnvios = datosEnvios;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CarritoPage.IR_A_COMPRAR),
                SelectFromOptions.byVisibleText(datosEnvios.get(0).getMunicipio()).from(DEPARTAMENTO),
                SelectFromOptions.byVisibleText(datosEnvios.get(0).getCiudad()).from(CIUDAD),
                SelectFromOptions.byVisibleText(datosEnvios.get(0).getCiudad()).from(BARRIO),
                Click.on(DespachoPage.BOTON_CONTINUAR));
        actor.attemptsTo(Enter.theValue(datosEnvios.get(0).getDireccion()).into(DIRECCION),
                Enter.theValue(datosEnvios.get(0).getNumDepartamento()).into(NUM_DEPARTAMENTO),
                Click.on(BOTON_INGRESAR_DIR),
                Click.on(BOTON_IR_PAGAR));
    }

    public static IniciarPago deProducto(List<DatosEnvio>datosEnvios){
        return Tasks.instrumented(IniciarPago.class, datosEnvios);
    }
}
