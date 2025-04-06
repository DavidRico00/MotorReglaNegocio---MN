package rules;

import com.deliveredtechnologies.rulebook.annotation.*;

import pkg.MotorReglas.Evento;

import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;

@Rule(order = 1)
public class RN03_ConfirmacionEvento {
	
	@Given("Evento")
	private Fact<Evento> evento;
	
	@Given("RN03")
    private Fact<Boolean> rn;

    @When
    public boolean requiereValidacion() {
    	Evento evento = this.evento.getValue();
        return evento.isModificacion() && evento.isNotificado();
    }

    @Then
    public void reglaCorrecta() {
    	rn.setValue(true);
    }
}
