package co.com.falabella.pruebasistecredito.stepdefinitions;

import co.com.falabella.pruebasistecredito.exceptions.MensajeExceptions;
import co.com.falabella.pruebasistecredito.models.DatosEnvio;
import co.com.falabella.pruebasistecredito.models.DatosProducto;
import co.com.falabella.pruebasistecredito.questions.ValidarMensaje;
import co.com.falabella.pruebasistecredito.tasks.Agregar;
import co.com.falabella.pruebasistecredito.tasks.Buscar;
import co.com.falabella.pruebasistecredito.tasks.IniciarPago;
import co.com.falabella.pruebasistecredito.utils.GeneralConstants;
import cucumber.api.java.Before;
import cucumber.api.java.es.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import org.hamcrest.Matchers;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AgregarProdStepDefinitions extends GenerealStepDefinitions {

    @Before
    public void configuracion() {
        setUp();
    }

    @Dado("Que el usuario busca un producto")
    public void queElUsuarioBuscaUnProducto(List<DatosProducto> datosProductos) {
        theActorInTheSpotlight().wasAbleTo(Open.url(GeneralConstants.URL));
        theActorInTheSpotlight().wasAbleTo(Buscar.producto(datosProductos.get(0)));
    }

    @Cuando("Agrega el producto al carrito para iniciar proceso de pago")
    public void agregaElProductoAlCarritoParaIniciarProcesoDePago(List<DatosEnvio> datosEnvios) {
        theActorInTheSpotlight().attemptsTo(Agregar.alCarrito());
        theActorInTheSpotlight().attemptsTo(IniciarPago.deProducto(datosEnvios));
    }

    @Entonces("deberia de ver el precio inicial del producto")
    public void deberiaDeVerElPrecioInicialDelProducto() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMensaje.PagoTargetaCMR(),
                Matchers.equalTo(theActorInTheSpotlight().recall("precioProducto"))).
                orComplainWith(MensajeExceptions.class, "El valor a pagar no es el mismo"));
    }
}
