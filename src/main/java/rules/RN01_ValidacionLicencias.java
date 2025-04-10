package rules;

import com.deliveredtechnologies.rulebook.annotation.*;
import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;

import pkg.MotorReglas.Local;

@Rule(order = 1)
public class RN01_ValidacionLicencias {
	
	@Given("Local")
	private Fact<Local> local;
	
	@Given("RN01")
    private Fact<Boolean> rn;

    @When
    public boolean tieneLicencia() {
        return local.getValue().isLicencia();
    }

    @Then
    public void reglaCorrecta() {
        rn.setValue(true);
    }
}
