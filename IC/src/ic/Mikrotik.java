
package ic;


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
class GoldMik extends Mikrotik{
    public static void main(String[] args) {
        Mikrotik obj=new Mikrotik();
        obj.setBuyPrice(80);
        System.out.println("we will buy it for "+obj.getBuyPrice()+"$");
        
        
    }
}
