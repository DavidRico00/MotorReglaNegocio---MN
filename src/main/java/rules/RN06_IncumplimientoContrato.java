package rules;

import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import pkg.MotorReglas.Evento;

@Rule(order = 6)
public class RN06_IncumplimientoContrato {
	@Given("evento")
	private Fact<Evento> evento;
	
	@Given("ok6")
    private Fact<Boolean> ok;

    @When
    public boolean incumplimientoRealizado() {
        return evento.getValue().isIncumplimientoContrato();
    }

    @Then
    public void reglaCorrecta() {
        ok.setValue(true);
    }
}
