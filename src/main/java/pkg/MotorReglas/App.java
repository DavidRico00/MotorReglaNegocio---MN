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
         
         //Declaracion de miembro
         List<Miembro> miembros = new ArrayList<Miembro>();
         Miembro m1 = new Miembro("Jose Ángel", "Romero Delgado", 21);
         miembros.add(m1);
         Miembro m2 = new Miembro("David", "Rico Mayoral", 17);
         m2.setAprobacion(true);
         miembros.add(m2);

         //Declaracion de grup musical
         GrupoMusical g1 = new GrupoMusical(miembros, "FullMusic", "Trap");
         g1.setConciertosRealizados(12);
         g1.setCalificacionMedia(5.6f);
         
         //Declaracion de local
         Local l1 = new Local("Melón S.L", true, 12, 150f); 
         
         //Declaracion de evento
         Evento e1 = new Evento(g1, l1);
         e1.setTerminado(false);
         e1.setModificacion(false);
         e1.setNotificado(false);
         e1.setIncumplimientoContrato(false);
         e1.setAcuerdoConfirmado(false);
         e1.setCalifGroupToLocal(0);
         e1.setCalifLocaltoGroup(0);
         e1.setPrecioNegociado(0.0f);       
         
         ruleBook.run(facts);
     }
}
