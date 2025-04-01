package rules;

import com.deliveredtechnologies.rulebook.annotation.*;
import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;
import java.util.Optional;

@Rule(order = 1)
public class RN02_ValidacionEdad {
	
	@Given("Edad")
	private Fact<Integer> Edad;
	
	@Given("okey")
    private Fact<Integer> okey;

    @When
    public boolean validarEdad() {
        return Edad.getValue() >= 16;
    }

    @Then
    public void asignarValor() {
        okey.setValue(16);
    }
}
