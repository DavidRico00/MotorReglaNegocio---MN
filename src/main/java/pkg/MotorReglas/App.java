package pkg.MotorReglas;

import com.deliveredtechnologies.rulebook.FactMap;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;
import com.deliveredtechnologies.rulebook.model.RuleBook;
import java.util.Optional;
import com.deliveredtechnologies.rulebook.model.runner.RuleBookRunner;


public class App 
{
    public static void main( String[] args )
    {
    	 RuleBook ruleBook = new RuleBookRunner("rules");
         NameValueReferableMap<Object> facts = new FactMap<>();
         //RN_ValidacionEdad
         facts.setValue("Edad", 17);
         facts.setValue("okey", 0);

        //RN_ConfirmacionEvento
        facts.setValue("confirmada", true);  
        facts.setValue("accion", "modificar"); // Puede ser "modificar" o "cancelar"
        facts.setValue("notificacion", true); 

        //RN_Presupuesto
        facts.setValue("tarifa", 500.0);  
        facts.setValue("presupuesto", 600.0); 
        facts.setValue("acuerdoConfirmado", false); 

        //RN_ValidacionLicencia
         facts.setValue("ok", false);
         facts.setValue("licencia", true);

         ruleBook.run(facts);

         Boolean ok = (Boolean) facts.getValue("ok");
         int okey = (Integer) facts.getValue("okey");
         boolean Notificacion = (Boolean) facts.getValue("notificacion");
         boolean acuerdo = (Boolean) facts.getValue("acuerdoConfirmado");

         System.out.println("El resultado de la validacion es:" + okey);
         System.out.println(okey == 16 ? "Edad válida" : "Edad no válida");
         System.out.println("El bar" + (ok?" tiene licencia" : " no tiene licencia"));
         System.out.println("¿Se requiere notificación? " + (Notificacion ? " Sí" : " No"));
         System.out.println("¿Se ha confirmado el acuerdo? " + (acuerdo ? "Sí" : "No"));
    }
}
