package rules;

import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import pkg.MotorReglas.Evento;

@Rule(order = 7)
public class RN07_RetencionPagos {
	@Given("evento")
	private Fact<Evento> evento;
	
	@Given("ok7")
    private Fact<Boolean> ok;

    @When
    public boolean retencionPago() {
        return evento.getValue().isTerminado() && !evento.getValue().isIncumplimientoContrato();
    }

    @Then
    public void reglaCorrecta() {
        ok.setValue(true);
    }
}
