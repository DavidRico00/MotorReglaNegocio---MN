package rules;

import com.deliveredtechnologies.rulebook.annotation.*;
import com.deliveredtechnologies.rulebook.Fact;

@Rule(order = 1)
public class RN01_ValidacionLicencias {
	
	@Given("licencia")
	private Fact<Boolean> licencia;
	
	@Given("ok")
    private Fact<Boolean> ok;

    @When
    public boolean tieneLicencia() {
        return licencia.getValue();
    }

    @Then
    public void reglaCorrecta() {
        ok.setValue(true);
    }
}
