package co.com.falabella.pruebasistecredito.stepdefinitions;

import co.com.falabella.pruebasistecredito.utils.GeneralConstants;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class GenerealStepDefinitions {

    @Managed(driver = GeneralConstants.CHROME)
    protected WebDriver navegador;

    @SuppressWarnings("unchecked")
    public void setUp() {
        setTheStage(new Cast());
        theActorCalled(GeneralConstants.ACTOR);
        theActorInTheSpotlight().can(BrowseTheWeb.with(navegador));
    }
}
