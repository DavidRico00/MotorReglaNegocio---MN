package pkg.MotorReglas;

import java.util.ArrayList;
import java.util.List;

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
         
         facts.setValue("RN01", false); facts.setValue("RN02", false);
         facts.setValue("RN03", false); facts.setValue("RN04", false);
         facts.setValue("RN05", false); facts.setValue("RN06", false);
         facts.setValue("RN07", false); facts.setValue("RN08", 0);
         facts.setValue("RN09", 0);
         
         //Declaracion de miembro
         List<Miembro> miembros = new ArrayList<Miembro>();
         Miembro m1 = new Miembro("Jose Ángel", "Romero Delgado", 21);
         miembros.add(m1);
         Miembro m2 = new Miembro("David", "Rico Mayoral", 17);
         m2.setAprobacion(true);
         miembros.add(m2);

         //Declaracion de grup musical
         GrupoMusical g1 = new GrupoMusical(miembros, "FullMusic", "Trap");
         g1.setConciertosRealizados(300);
         g1.setCalificacionMedia(5.6f);
         
         //Declaracion de local
         Local l1 = new Local("Melón S.L", true, 300, 150f); 
         
         //Declaracion de evento
         Evento e1 = new Evento(g1, l1);
         e1.setTerminado(true);
         e1.setModificacion(false);
         e1.setNotificado(false);
         e1.setIncumplimientoContrato(false);
         e1.setAcuerdoConfirmado(true);
         e1.setCalifGroupToLocal(-1);
         e1.setCalifLocaltoGroup(5);
         e1.setPrecioNegociado(0.0f);       
         
         
         facts.setValue("GrupoMusical", g1);
         facts.setValue("Local", l1);
         facts.setValue("Evento", e1);
         
         ruleBook.run(facts);
         
         //Impresion de resultados
         System.out.println("El local "+ ((boolean)facts.getValue("RN01")?"si":"no") + " tiene licencia");
         System.out.println("Los miembros del grupo musical "+ ((boolean)facts.getValue("RN02")?"si":"no") + " tienen la edad adecuada");
         System.out.println("El evento musical "+ ((boolean)facts.getValue("RN03")?"si":"no") + " tiene una nueva modificacion no notificada");
         System.out.println("La tarifa del evento "+ ((boolean)facts.getValue("RN04")?"si":"no") + " esta confirmada");
         System.out.println("Las calificaciones "+ ((boolean)facts.getValue("RN05")?"si":"no") + " han sido realizadas");
         System.out.println("El contrato del evento "+ ((boolean)facts.getValue("RN06")?"si":"no") + " ha sido incumplido");
         System.out.println("La retencion de pago "+ ((boolean)facts.getValue("RN07")?"no":"si") + " esta activado");
         System.out.println("El grupo aparece en la zona "+ ((int)facts.getValue("RN08")) + " del ranking");
         System.out.println("El grupo musical tiene un descuento de "+ ((int)facts.getValue("RN09")) + " %");
         
     }
}
