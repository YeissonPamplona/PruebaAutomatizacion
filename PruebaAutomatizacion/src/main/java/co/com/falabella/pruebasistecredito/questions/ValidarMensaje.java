package co.com.falabella.pruebasistecredito.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.falabella.pruebasistecredito.userinterface.PagoPage.VALOR_PRODUCTO_PAGAR;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidarMensaje implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {

        actor.attemptsTo(WaitUntil.the(VALOR_PRODUCTO_PAGAR, isVisible()).forNoMoreThan(5).seconds());

        return Text.of(VALOR_PRODUCTO_PAGAR).viewedBy(actor).asString();
    }

    public static ValidarMensaje PagoTargetaCMR(){
        return new ValidarMensaje();
    }
}
