package pkg.MotorReglas;

import com.deliveredtechnologies.rulebook.FactMap;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;
import com.deliveredtechnologies.rulebook.model.RuleBook;
import com.deliveredtechnologies.rulebook.model.runner.RuleBookRunner;


public class App 
{
    public static void main( String[] args )
    {
    	 RuleBook ruleBook = new RuleBookRunner("rules");
         NameValueReferableMap<Object> facts = new FactMap<>();

         //RN02_ValidacionEdad
         facts.setValue("Edad", 17);
         facts.setValue("okey", 0);

        //RN03_ConfirmacionEvento
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
         
         facts.setValue("ok5", false);
         facts.setValue("ok6", false);
         facts.setValue("ok7", false);
         facts.setValue("ok8", -1);
         facts.setValue("ok9", -1);
         
         Evento evento = new Evento(null, null, true, 1, -2, false);
         facts.setValue("evento", evento);
         
         GrupoMusical grupoMusical = new GrupoMusical(null, "Grupo1", "Pop", 350, 4);
         facts.setValue("grupoMusical", grupoMusical);

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
         
         System.out.println("Resultado 5:" + ((boolean) facts.getValue("ok5")? " regla cumplida" : " regla incumplida"));
         System.out.println("Resultado 6:" + ((boolean) facts.getValue("ok6")? " regla cumplida" : " regla incumplida"));
         System.out.println("Resultado 7:" + ((boolean) facts.getValue("ok7")? " regla cumplida" : " regla incumplida"));
         System.out.println("Resultado 8: prioridad -> " + (int) facts.getValue("ok8"));
         System.out.println("Resultado 9: descuento -> " + (int) facts.getValue("ok9"));       
         
     }
}
