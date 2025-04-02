package rules;

import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import pkg.MotorReglas.Evento;

@Rule(order = 5)
public class RN05_ReseñasPostEvento {

	@Given("Evento")
	private Fact<Evento> evento;
	
    @When
    public boolean isReseñaRealizada() {
    	Evento e = evento.getValue();
        return !e.isTerminado() || (e.isTerminado() && e.getCalifGroupToLocal()>0 && e.getCalifLocaltoGroup()>0);
    }

    @Then
    public void reglaCorrecta(NameValueReferableMap<Object> facts) {
    	facts.setValue("RN05", true);
    }
}
