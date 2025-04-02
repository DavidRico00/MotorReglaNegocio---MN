package rules;

import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import pkg.MotorReglas.Evento;

@Rule(order = 6)
public class RN06_IncumplimientoContrato {
	
	@Given("Evento")
	private Fact<Evento> evento;

    @When
    public boolean incumplimientoRealizado() {
        return evento.getValue().isIncumplimientoContrato();
    }

    @Then
    public void reglaCorrecta(NameValueReferableMap<Object> facts) {
    	facts.setValue("RN06", true);
    }
}
