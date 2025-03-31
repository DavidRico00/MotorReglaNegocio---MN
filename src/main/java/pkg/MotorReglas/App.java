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
         
         facts.setValue("ok", false);
         facts.setValue("licencia", true);

         ruleBook.run(facts);

         Boolean ok = (Boolean) facts.getValue("ok");

         System.out.println("El bar" + (ok?" tiene licencia" : " no tiene licencia"));
     }
}
