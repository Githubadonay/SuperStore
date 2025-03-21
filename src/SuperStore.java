import javax.swing.JOptionPane;

public class SuperStore {
    public static void main(String[] args){
        final int MAX_ITEM = 100;

        //declare the array 
        Item[] allItems = new Item[MAX_ITEM];

        addItem(allItems);
        printItem(allItems);

    }
    public static void addItem(Item[] allItems){
        //create the first two item 
        allItems[0] = new HomeAppItem("H001", "Oven", 100);
        allItems[1] = new ElectronicItem("E001", "CPU",2,1);
    }
    public static void printItem(Item[] allItems){
        String output = "Item Code | Item Name | Item Price\n";
        for(int i=0; i<Item.getNumOfItems(); i++){
        output+= allItems[i].toString() + "\n";
    }
    JOptionPane.showMessageDialog(null,output);
}
}

