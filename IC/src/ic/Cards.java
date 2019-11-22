
package ic;
import java.util.*;

public class Cards {
    Scanner x=new Scanner (System.in);
    public int Price;
    protected String CardType=x.nextLine();
    private int CardCode;
    public void SetCardCode(int a){
        int Price=a;
        
    }
    public int getCardCode(){
        return Price;
    }       
}
class SoldCards extends Cards{
    public SoldCards(String a){
 if(CardType =="Family"){
System.out.println("This is a family Card which is required for families To protect illegal Websited from Childreen Price is 25$");
  
}
 else if (CardType == "Bussiness"){
System.out.println("This is a Bussiness Card Which is required for companies and Workplaces if You are using this internet we Suggest this type of Card Price is 45$");
}
 else if(CardType == "Standard"){
System.out.println("This is a standard card which is required for Adults and non bussiness people price is 30$");
}}
 
   
}
