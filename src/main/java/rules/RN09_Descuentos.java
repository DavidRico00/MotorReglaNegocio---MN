package rules;

import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import pkg.MotorReglas.GrupoMusical;

@Rule(order = 9)
public class RN09_Descuentos {
	@Given("grupoMusical")
	private Fact<GrupoMusical> grupo;
	
	@Given("ok9")
    private Fact<Integer> ok;

    @When
    public boolean valoracion() {
        return grupo.getValue().getConciertosRealizados() >= 0;
    }

    @Then
    public void reglaCorrecta() {
        GrupoMusical grupoMusical = grupo.getValue();
        
        if(grupoMusical.getConciertosRealizados() >= 1000 ) {
			ok.setValue(15);
		} else if(grupoMusical.getConciertosRealizados() >= 300) {
			ok.setValue(10);
		} else if(grupoMusical.getCalificacionMedia() >= 100) {
			ok.setValue(5);
		} else {
			ok.setValue(0);
		}
    }
}
