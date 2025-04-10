package rules;

import com.deliveredtechnologies.rulebook.annotation.*;

import pkg.MotorReglas.Evento;

import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;
import java.util.Optional;

@Rule(order = 4)
public class RN04_NegociacionTarifa {

    @Given("Evento")
    private Fact<Evento> evento;
    
    @Given("RN04")
    private Fact<Boolean> rn;

    @When
    public boolean enNegociacion() {
    	Evento evento = this.evento.getValue();
    	return evento.isAcuerdoConfirmado() && evento.getPrecioNegociado() > evento.getLocal().getPresupuesto();
    }

    @Then
    public void reglaCorrecta() {
    	rn.setValue(true);
    }
}
