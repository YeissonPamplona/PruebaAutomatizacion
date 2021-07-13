package co.com.falabella.pruebasistecredito.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ObtenerTexto implements Question<String> {

    private Target target;

    public ObtenerTexto(Target target) {
        this.target = target;
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(target).viewedBy(actor).asString().replaceAll(" ", "");
    }

    public static ObtenerTexto delElemto(Target target){
        return new ObtenerTexto(target);
    }
}
