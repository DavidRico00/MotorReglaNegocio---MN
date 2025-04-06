package rules;

import com.deliveredtechnologies.rulebook.annotation.*;

import pkg.MotorReglas.GrupoMusical;
import pkg.MotorReglas.Miembro;

import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;

import java.util.List;
import java.util.Optional;

@Rule(order = 1)
public class RN02_ValidacionEdad {
	
	@Given("GrupoMusical")
	private Fact<GrupoMusical> grupo;
	
	@Given("RN02")
    private Fact<Boolean> rn;

    @When
    public boolean validarEdad() {
    	GrupoMusical grupoM = (GrupoMusical) grupo.getValue();
    	boolean correcto = true;
    	
    	List<Miembro> miembros = grupoM.getMiembros();
    	for (Miembro miembro : miembros) {
			if (miembro.getEdad() < 16) {
				correcto = false;
				break;
			}
			
			if(miembro.getEdad() >= 16 && miembro.getEdad() < 18 && !miembro.isAprobacion()) {
				correcto = false;
				break;
			}
		}
    	
        return correcto;
    }

    @Then
    public void reglaCorrecta() {
    	rn.setValue(true);
    }
}
