package rules;

import com.deliveredtechnologies.rulebook.annotation.*;
import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;
import java.util.Optional;

@Rule(order = 1)
public class RN03_ConfirmacionEvento {
	
	@Given("Confirmada")
	private Fact<Boolean> Confirmada;
	
	@Given("Accion")
    private Fact<String> Accion;

    @Given("Notificacion")
    private Fact<Boolean> Notificacion;

    @When
    public boolean requiereValidacion() {
        return Confirmada.getValue() && (Accion.getValue().equals("modificar") || Accion.getValue().equals("cancelar"));
    }

    @Then
    public void validarAccion() {
        Notificacion.setValue(true); // Se requiere notificación
        System.out.println("Notificación enviada a ambas partes: " + Accion.getValue());
    }
}
