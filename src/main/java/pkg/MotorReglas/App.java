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
         
         Miembro miembro1 = new Miembro("Jose Ángel", "Romero Delgado", 21, false);
         Miembro miembro2 = new Miembro("David", "Rico Mayoral", 17, true);
         List<Miembro> lista_miembros = new ArrayList<Miembro>();
         
         lista_miembros.add(miembro1);
         lista_miembros.add(miembro2);
         
         GrupoMusical grupo1 = new GrupoMusical(lista_miembros, "FullMusic", "Trap", 5, 8);
         
         Local local = new Local("Melón S.L", true, 12);
         
         Local local2 = new Local("Venta el Potro", true, 0);
         
         Evento evento = new Evento(grupo1, local, true, 8, 9, false);
         
         // Evento evento2 = new Evento(grupo1, local2, false, 8, 5, false);
         
         ruleBook.run(facts);
     }
}
