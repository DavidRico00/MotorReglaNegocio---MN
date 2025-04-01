package rules;

import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import pkg.MotorReglas.GrupoMusical;

@Rule(order = 8)
public class RN08_FiltracionBusqueda {
	@Given("grupoMusical")
	private Fact<GrupoMusical> grupo;
	
	@Given("ok8")
    private Fact<Integer> ok;

    @When
    public boolean valoracion() {
        return grupo.getValue().getCalificacionMedia() >= 0;
    }

    @Then
    public void reglaCorrecta() {
        GrupoMusical grupoMusical = grupo.getValue();
        
        if(grupoMusical.getCalificacionMedia() >= 0 && grupoMusical.getCalificacionMedia() < 3) {
			ok.setValue(1);
		} else if(grupoMusical.getCalificacionMedia() >= 3 && grupoMusical.getCalificacionMedia() < 5) {
			ok.setValue(2);
		} else if(grupoMusical.getCalificacionMedia() >= 5 && grupoMusical.getCalificacionMedia() < 8) {
			ok.setValue(3);
		} else {
			ok.setValue(4);
		}
    }
}
