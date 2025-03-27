public class HomeAppItem extends Item{
    final static double discount = 0.05;

    //con
    public HomeAppItem(String itemCode, String itemName, double price){
        super(itemCode, itemName, price);
    }
    public double calculateSalesPrice(){
        double salesPrice = super.getPrice() - (super.getPrice() * discount);
        return salesPrice;
    }
    //to string
    public String toString(){
       return super.toString() + " | " + calculateSalesPrice();
    }

}
