package rules;

import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import pkg.MotorReglas.GrupoMusical;

@Rule(order = 8)
public class RN08_FiltracionBusqueda {
	
	@Given("GrupoMusical")
	private Fact<GrupoMusical> grupo;

    @When
    public boolean valoracion() {
        return grupo.getValue().getCalificacionMedia() >= 0;
    }

    @Then
    public void reglaCorrecta(NameValueReferableMap<Object> facts) {
        GrupoMusical grupoMusical = grupo.getValue();
        
        if(grupoMusical.getCalificacionMedia() >= 0 && grupoMusical.getCalificacionMedia() < 3) {
        	facts.setValue("RN08", 1);
		} else if(grupoMusical.getCalificacionMedia() >= 3 && grupoMusical.getCalificacionMedia() < 5) {
			facts.setValue("RN08", 2);
		} else if(grupoMusical.getCalificacionMedia() >= 5 && grupoMusical.getCalificacionMedia() < 8) {
			facts.setValue("RN08", 3);
		} else {
			facts.setValue("RN08", 4);
		}
    }
}
