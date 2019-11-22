
package ic;
import java.util.*;
public class Router {
    protected int Price;
    protected String Type;
    public int Wlradius;;
    public void setPrice(int a){
        int Price=a;
        
    }
    public int getPrice(){
        return Price;
    }  
}
class RouterType extends Router{
    public RouterType(String a){
    switch (a){
  case "TP-link":{
      System.out.println("Tp link is a Router that has a high Quality network with spread of 2.4ghz and it has two types the first type is 2 towers which is a mid ranged router and Second type is a 3 Tower that has a high range");
  break;}
  case "Mikrotik":{
      System.out.println("Router also has Mikrotik which is best quality Router Type that has a high rage of 3.6ghz and can be accessed through the Sectors");
break;      
  }
      
    }
    }

   
}

