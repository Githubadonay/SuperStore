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

        //get user choice 
        String choice = JOptionPane.showInputDialog("Enter the type of item you want to add\n1.Electronic Item\n2.Home appliance Item");
        //create the first two item 
        if (choice.equals("1")){
            allItems[1] = new ElectronicItem("E001", "CPU",2,1);
        }else if(choice.equals("2")){
        allItems[0] = new HomeAppItem("H001", "Oven", 100);
        }

    }
    public static void printItem(Item[] allItems){
        String output = "Item Code | Item Name | Item Price\n";
        for(int i=0; i<Item.getNumOfItems(); i++){
        output+= allItems[i].toString() + "\n";
    }
    JOptionPane.showMessageDialog(null,output);
}
}

