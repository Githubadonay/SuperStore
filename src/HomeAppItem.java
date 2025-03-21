public class HomeAppItem extends Item{
    final double discount = 0.05;

    //con
    public HomeAppItem(String itemCode, String itemName, double price){
        super(itemCode, itemName, price);
    }
    //to string
    public String toString(){
       return super.toString() + "|" + discount;
    }

}
