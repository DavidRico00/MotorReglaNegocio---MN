package rules;

import com.deliveredtechnologies.rulebook.annotation.*;
import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;
import java.util.Optional;

@Rule(order = 4)
public class RN_NegociacionTarifa {

    @Given("tarifa")
    private Fact<Double> tarifa; // Tarifa negociada

    @Given("presupuesto")
    private Fact<Double> presupuesto; // Presupuesto ofrecido por el local

    @Given("acuerdoConfirmado")
    private Fact<Boolean> acuerdoConfirmado; // Si el acuerdo está confirmado

    @When
    public boolean enNegociacion() {
        return !acuerdoConfirmado.getValue(); // Si no está confirmado el acuerdo, sigue en negociación
    }

    @Then
    public void negociar() {
        // Si el acuerdo no está confirmado, se negocia
        if (tarifa.getValue() <= presupuesto.getValue()) {
            acuerdoConfirmado.setValue(true); // Se confirma el acuerdo si la tarifa es menor o igual al presupuesto
            System.out.println("Acuerdo confirmado: Tarifa aceptada.");
        } else {
            System.out.println("Negociando... La tarifa es superior al presupuesto.");
        }
    }
}
