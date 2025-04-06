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
	
	@Given("RN09")
    private Fact<Integer> rn;

    @When
    public boolean valoracion() {
        return grupo.getValue().getConciertosRealizados() >= 0;
    }

    @Then
    public void reglaCorrecta() {
        GrupoMusical grupoMusical = grupo.getValue();
        
        if(grupoMusical.getConciertosRealizados() >= 1000 ) {
        	rn.setValue(15);
		} else if(grupoMusical.getConciertosRealizados() >= 300) {
			rn.setValue(10);
		} else if(grupoMusical.getCalificacionMedia() >= 100) {
			rn.setValue(5);
		}
    }
}
