import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stocklist stock = new Stocklist("Tap Kitchen", "Milano", (double) 1004555);
        stock.addProduct("Radiator", "MilanoRad1", 545345443);
        stock.addProduct("Door Upvc", "uPvc", 54534545);
    
        boolean quit;
        while(!quit){
            Scanner sc;
            int action = sc.nextInt();
            sc.nextLine();
//using switch for creating menu options for the console
            switch (action){

                case 0:
                    System.out.println("Goodbye!");
                    break;

                case 1:  //print list of products
                    ArrayList<Stocklist> stock1ArrayList;
                    printStock(stock);
                    break;
                case 2: //check if a product is on stocklist
                    Scanner name = new Scanner(System.in);
                    String sss = name.nextLine();
                    System.out.println( "What Product are you looking for?");
                    for(Stocklist findProduct: stock)
                    {
                        if(findProduct.getName().equals(sss)){
                            System.out.println(sss + "  is on Stock  " + findProduct.getName() + " --ID--" + findProduct.getId() + " stock number " + findProduct.getQuantity);
                    }
                }
              
                case 3: //add new product
                Scanner nameadd = new Scanner(System.in);
                    String addn = nameadd.nextLine();
                    String addid = nameadd.nextLine();
                    Double addstock = nameadd.nextDouble();
                    System.out.println( "Name of Product to be added?");
            
                    
                    System.out.println( "ID of Product to be added?");
                  
                    System.out.println( "Stock of Product to be added?");
                    Stocklist stock1 = new Stocklist(addn, addid, addstock);
                    System.out.println("New Product Added!");
                    

                case 4: //delete product
                Scanner namere = new Scanner(System.in);
                    String removep = namere.nextLine();
                    for(Stocklist findProduct: stock)
                    
                        if(findProduct.getName().equals(removep)){
                            System.out.println(removep + "  is on Stock  " + findProduct.getName() + " --ID--" + findProduct.getId() + " stock number " + findProduct.getQuantity);
                    stock.remove(removep);
                        
                       { System.out.println(removep + "  is not on Stock  ");}
                        
                    
                }
                
            

    private static void printMenu(){  //menu list
        System.out.println("Available options\n press");
        System.out.println("0 - to quit\n"+
                "1 - See list of products"+
                "2 - Check if a product exist on stock"+
                "3 - Add new Product to the Stocklist\n"+
                "4 - Delete Product from Stocklist"
               );
    }
    private void printStock(ArrayList<Stocklist> stock){ //print list method
        Iterator<Stocklist> iterator = stock.iterator();
        {System.out.println(iterator.next());

        
    }
}
}

    

