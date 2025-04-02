package rules;

import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import pkg.MotorReglas.GrupoMusical;

@Rule(order = 9)
public class RN09_Descuentos {
	
	@Given("GrupoMusical")
	private Fact<GrupoMusical> grupo;

    @When
    public boolean valoracion() {
        return grupo.getValue().getConciertosRealizados() >= 0;
    }

    @Then
    public void reglaCorrecta(NameValueReferableMap<Object> facts) {
        GrupoMusical grupoMusical = grupo.getValue();
        
        if(grupoMusical.getConciertosRealizados() >= 1000 ) {
        	facts.setValue("RN09", 15);
		} else if(grupoMusical.getConciertosRealizados() >= 300) {
			facts.setValue("RN09", 10);
		} else if(grupoMusical.getCalificacionMedia() >= 100) {
			facts.setValue("RN09", 5);
		} else {
			facts.setValue("RN09", 0);
		}
    }
}
