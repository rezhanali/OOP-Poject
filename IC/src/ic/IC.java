
package ic;
import java.util.*;

public class IC {


    public static void main(String[] args) {
Scanner x=new Scanner (System.in);
Cards ca= new Cards();

String a=x.next();
switch (a){
 case "cards":
 SoldCards sd=new SoldCards("Family");
 break;
 case "Mikrotik":
 MikType mt=new MikType("Gold");
 break;
 case "Router":
RouterType rt=new RouterType();
break;

       
    }
        
        
 
    }
    
}
