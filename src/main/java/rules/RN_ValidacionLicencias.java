package rules;

import com.deliveredtechnologies.rulebook.annotation.*;
import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;
import java.util.Optional;

@Rule(order = 1)
public class RN_ValidacionLicencias {
	
	@Given("licencia")
	private Fact<Boolean> licencia;
	
	@Given("ok")
    private Fact<Boolean> ok;

    @When
    public boolean tieneLicencia() {
        return licencia.getValue();
    }

    @Then
    public void aplicarDescuento() {
        ok.setValue(true);
    }
}
