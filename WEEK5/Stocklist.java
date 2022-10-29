import java.util.ArrayList;

public class Stocklist {
    private ArrayList<Product> products; //declare attribut arraylist to stock the products in a list
    private String Name;
    private String Id;
    private Double Quantity;
    
    
    


    

public Stocklist( String Name, String Id, Double Quantity)   //constructor arraylist
{this.products = new ArrayList<Product>();
    this.Name = Name;
    this.Id = Id;
    this.Quantity = Quantity;
    

}
public String getId() {
    return Id;
}

public void setId(String id) {
    Id = id;
}

public String getName() {
    return Name;
}

public void setName(String name) {
    Name = name;
}

public Double getQuantity() {
    return Quantity;
}

public void setQuantity(Double quantity) {
    Quantity = quantity;
}
public Product findProduct(String Name){  //method to find product in arraylist by name

    for(Product findProduct : products){
        if(findProduct.getName().equals(Name)) return findProduct;
        System.out.println(Name + "is on stock");
    }
  System.out.println(Name + "is not ion stock");
    return null;
    
}
//using boolean method to add a product to arraylist of stock
public boolean addProduct(String Name, String Id, double Quantity){
    if(findProduct(Name) == null){
        products.add(new Product(Name, Id , Quantity));
        
    System.out.println("Product " + Name + " ID " + Id + " Quantity on Stock " + Quantity + " added!");  
        return true;
    }
    else {
     System.out.println("Product "+ Name + " is already on stock and  quantity is  " + Quantity );  
        return false;}
    }

    
        
    }
    

