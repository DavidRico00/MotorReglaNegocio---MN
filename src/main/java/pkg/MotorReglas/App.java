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

         System.out.println("Resultado 5:" + ((boolean) facts.getValue("ok5")? " regla cumplida" : " regla incumplida"));
         System.out.println("Resultado 6:" + ((boolean) facts.getValue("ok6")? " regla cumplida" : " regla incumplida"));
         System.out.println("Resultado 7:" + ((boolean) facts.getValue("ok7")? " regla cumplida" : " regla incumplida"));
         System.out.println("Resultado 8: prioridad -> " + (int) facts.getValue("ok8"));
         System.out.println("Resultado 9: descuento -> " + (int) facts.getValue("ok9"));
         
     }
}
