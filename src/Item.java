public class Item{
    private String itemCode;
    private String itemName;
    private double price;
    private static int numOfItems;

    //contructor 
    public Item(){ numOfItems++;}
    public Item(String itemCode, String itemName, double price){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
        numOfItems++;
    }
    //get
    public String getItemCode(){
        return this.itemCode;
    }
    public String getItemName(){
        return this.itemName;
    }
    public double getPrice(){
        return this.price;
    }
    public static int getNumOfItems(){
       return numOfItems;
    }
//set
public void setItemCode(String itemCode){
    if(itemCode.equals(""))
    throw new IllegalArgumentException("item code can not be empty");
    this.itemCode = itemCode;
}
public void setItemName(String itemName){
    if(itemName.equals(""))
    throw new IllegalArgumentException("item name can not be empty");
    this.itemName = itemName;
}
public void setPrice(double price){
    if(price < 0 )
    throw new IllegalArgumentException("Error price can not be negetive");
    this.price = price;
}
public double calculateSalesPrice(){
    return this.getPrice();
}

//to string

public String toString(){
    return this.getItemCode() + " | " + this.getItemName() + " | " + this.getPrice();
}

}
