class Product { //add attributes to the product class
    private String Id;
    private String Name;
    private Double Quantity;

public Product (String Id, String Name, Double Quantity)
{
    this.Id = Id;
    this.Name = Name;
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
public void printproduct(){
    System.out.println("Product  name  " + Name + " , ID Number  " + Id + " .Product on stock: " + Quantity);
}
}
