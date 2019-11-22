
package ic;
import java.util.*;

public class Mikrotik {
    private int BuyPrice;
    public String Type;
    protected int sellprice;
    public void setBuyPrice(int a){
        int BuyPrice=a;
    }
    public int getBuyPrice(){
        return BuyPrice;
    }    
}
class MikType extends Mikrotik{
    public MikType(String a){
 switch (a){
case "Gold":{
System.out.println("This is a golde mikrotik which is useful for houses nd can make mini Sectors with this type of Mikrotik");
break;}
case "lite":{
    System.out.println("this is a lite miktorik which is not as powerful as Standard and Golden Mikrotik but Still good for house Networks");
    break;}
case"Standard":{
    System.out.println("this is a Standard Mikrotik which is useful for bussiness and house networks but Can't make mini Sectors of this");
 break;}}
    }
}