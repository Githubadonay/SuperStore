import javax.swing.JOptionPane;

public class SuperStore {
    public static void main(String[] args){
        final int MAX_ITEM = 100;

        //declare the array 
        Item[] allItems = new Item[MAX_ITEM];
        int userInput = -1;

        do{
             userInput = Integer.parseInt(JOptionPane.showInputDialog("Enter you choice:\n" +
            "1. Add Item\n"+
            "2. Print Report\n"+ 
            "3. Remove item\n"+ 
            "4.exit"));
            switch (userInput) {
                case 1:
                    addItem(allItems);
                    break;
                    case 2:
                    printItem(allItems);
                    break;
                    case 4:
                    JOptionPane.showMessageDialog(null,"Thank you bye");
                    System.exit(0);
                default:
                    break;
    
            }
        }while(userInput >= 1 && userInput <= 4);

    }
    public static void addItem(Item[] allItems){
        
        // get user input for item name, id and price 
        String Code = JOptionPane.showInputDialog("Enter what item you want");
        String name = JOptionPane.showInputDialog("Enter the name of the item");
        double price = Double.parseDouble(JOptionPane.showInputDialog("Enter the item base price "));

        //get user choice 
        String choice = JOptionPane.showInputDialog("Enter the type of item you want to add\n1.Electronic Item\n2.Home appliance Item");
        //create the first two item 
        if (choice.equals("1")){
            int warranty = Integer.parseInt(JOptionPane.showInputDialog("Enter the item warranty"));
            allItems[Item.getNumOfItems()] = new ElectronicItem(Code, name, price, warranty);
        }else if(choice.equals("2")){
        allItems[Item.getNumOfItems()] = new HomeAppItem(Code, name, price);
        }

    }
    public static void printItem(Item[] allItems){
        double totalElectronicPrice = 0; 
        double totalHomeAppPrice = 0;
        int countElectronic = 0;
        int countHApp = 0;
        String output = "Item Code | Item Name | Item base Price($) | Item sales price($)\n";
        for(int i=0; i<Item.getNumOfItems(); i++){
        output+= allItems[i].toString() + "\n";
            if(allItems[i] instanceof ElectronicItem){
                countElectronic++;
                totalElectronicPrice+= allItems[i].calculateSalesPrice();
            }else{
                countHApp++;
                totalHomeAppPrice+= allItems[i].calculateSalesPrice();
            }
        //
    }
    double avgPriceElectronic = 0;
    double avgPriceHomeApp = 0;
    if(countElectronic > 0 )
        avgPriceElectronic = totalElectronicPrice/countElectronic;
     if (countHApp > 0)
        avgPriceHomeApp = totalHomeAppPrice/countHApp;
        
    output+= "The average price of all the electronic item is $" + avgPriceElectronic + "\n";
    output+= "The average price of all the Home app item is $" + avgPriceHomeApp;
    JOptionPane.showMessageDialog(null,output);
}
}

