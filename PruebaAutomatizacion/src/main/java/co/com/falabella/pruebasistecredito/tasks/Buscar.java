package co.com.falabella.pruebasistecredito.tasks;

import co.com.falabella.pruebasistecredito.models.DatosProducto;
import co.com.falabella.pruebasistecredito.questions.ObtenerTexto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.falabella.pruebasistecredito.userinterface.HomePage.*;
import static co.com.falabella.pruebasistecredito.userinterface.ProductoPage.PRECIO_PRODUCTO;
import static co.com.falabella.pruebasistecredito.userinterface.ProductoPage.TALLA_PRODUCTO;
import static co.com.falabella.pruebasistecredito.userinterface.TenisHombrePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Buscar implements Task {

    private DatosProducto datosProductos;

    public Buscar(DatosProducto datosProductos) {
        this.datosProductos = datosProductos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(POP_UP),
                Enter.theValue(datosProductos.getProducto()).into(BANNER_BUSCAR),
                Click.on(OPCION_PRODUCTO.of(datosProductos.getTipoProducto())),
                WaitUntil.the(FILTRAR_PRODUCTO_MARCA, WebElementStateMatchers.isClickable()),
                Click.on(FILTRAR_PRODUCTO_MARCA),
                Click.on(OPCION_MARCA.of(datosProductos.getMarca())),
                MoveMouse.to(PRODUCTO.of(datosProductos.getNombreProducto())),
                Click.on(PRODUCTO.of(datosProductos.getNombreProducto())));
        actor.remember("precioProducto", ObtenerTexto.delElemto(PRECIO_PRODUCTO));
        actor.attemptsTo(WaitUntil.the(TALLA_PRODUCTO.of(datosProductos.getTalla()), WebElementStateMatchers.isClickable()),
                Click.on(TALLA_PRODUCTO.of(datosProductos.getTalla())));
    }

    public static Buscar producto(DatosProducto datosProducto) {
        return instrumented(Buscar.class, datosProducto);
    }

}
