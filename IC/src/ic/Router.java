
package ic;

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
    int price;
    void Dlink(){
     super.Price=20;
     Price=30;
    }
    public static void main(String[] args) {
        Router obj=new Router();
        obj.setPrice(15);
        System.out.println("we will buy the router for "+ obj.getPrice());
    }
}

