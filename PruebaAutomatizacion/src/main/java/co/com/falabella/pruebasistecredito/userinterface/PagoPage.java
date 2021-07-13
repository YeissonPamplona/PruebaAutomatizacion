package co.com.falabella.pruebasistecredito.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class PagoPage {

    public static final Target VALOR_PRODUCTO_PAGAR = Target.the("Valor del prudcto a pagar")
            .locatedBy("(//*[@class='fbra_text fbra_test_orderSummary__totalCostPrice fbra_orderSummary__totalCostPrice'])");

}
