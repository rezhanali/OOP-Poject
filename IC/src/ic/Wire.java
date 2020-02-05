
package ic;


public class Wire {
    private int price;
    public int length;
    protected String RJType;
    public void setPrice(int a){
        int price=a;
    }
    public int getPrice(){
        return price;
    }

}
class Wiretype extends Wire{
        public static void main(String[] args) {
        Wire obj=new Wire();
        obj.setPrice(15);
        System.out.println("The wire price is "+obj.getPrice());
       
        
    }
    
}
