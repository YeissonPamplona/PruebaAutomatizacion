package co.com.falabella.pruebasistecredito.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.falabella.pruebasistecredito.userinterface.ProductoPage.*;

public class Agregar implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTON_AGREGAR_CARRITO),
                WaitUntil.the(IR_CARRITO, WebElementStateMatchers.isClickable()),
                Click.on(IR_CARRITO));
    }

    public static Agregar alCarrito() {
        return Tasks.instrumented(Agregar.class);
    }
}
