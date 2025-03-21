public class ElectronicItem extends Item{
    private int warranty;

    //constructor 
    public ElectronicItem(String itemCode, String itemName, double price, int warranty){
        super(itemCode, itemName, price);
        this.warranty = warranty;
    }
    //get
    public int getWarranty(){
        return this.warranty;
    }
    // set
    public void setWarranty(int warranty){
        if(warranty < 0)
        throw new IllegalArgumentException("Error, warranty cannot be negetive");
        this.warranty = warranty;
    }
    public String toString(){
       return super.toString() + " | " + this.getWarranty();
    }
}
