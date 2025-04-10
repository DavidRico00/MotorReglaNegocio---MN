package rules;

import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import pkg.MotorReglas.Evento;

@Rule(order = 7)
public class RN07_RetencionPagos {
	
	@Given("Evento")
	private Fact<Evento> evento;
	
	@Given("RN07")
    private Fact<Boolean> rn;

    @When
    public boolean retencionPago() {
        return evento.getValue().isTerminado() && !evento.getValue().isIncumplimientoContrato();
    }

    @Then
    public void reglaCorrecta() {
    	rn.setValue(true);
    }
}
