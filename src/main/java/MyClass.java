import java.util.Arrays;

public class MyClass {
    int id;
    int quantity;
    char size;
    double price;
    boolean inStock;
    String name;
    String[] coloursAvailable;

    //Random id
    public MyClass(int quantity, char size, double price, boolean inStock, String name, String[] coloursAvailable) {
        this.id = 10_000 + (int) (Math.random() * 90_000);
        this.quantity = quantity;
        this.size = size;
        this.price = price;
        this.inStock = inStock;
        this.name = name;
        this.coloursAvailable = coloursAvailable;
    }

    //Id given
    public MyClass(int id, int quantity, char size, double price, boolean inStock, String name, String[] coloursAvailable) {
        this.id = id;
        this.quantity = quantity;
        this.size = size;
        this.price = price;
        this.inStock = inStock;
        this.name = name;
        this.coloursAvailable = coloursAvailable;
    }

    public String presentData() {

        return "id: " + String.valueOf(id) + "\n" +
                "name: " + name + "\n" +
                "size: " + String.valueOf(size) + "\n" +
                "colours: " + Arrays.toString(coloursAvailable) + "\n" +
                "price: " + String.valueOf(price) + "\n" +
                "in stock: " + String.valueOf(inStock) + "\n" +
                "quantity: " + String.valueOf(quantity) + "\n";
    }

    public boolean equals(MyClass item) {
        return ((this.id ==  item.id) &&
                (this.quantity == item.quantity) &&
                (this.size == item.size) &&
                (this.price == item.price) &&
                (this.inStock == item.inStock) &&
                (this.name.equals(item.name)) &&
                (Arrays.equals(this.coloursAvailable, item.coloursAvailable)));
    }
}
