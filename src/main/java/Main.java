public class Main {
    public static void main(String[] args) {
        //1. Primitive:
        int quantity = 5;
        char size = 'S';
        double price = 5864.80;
        boolean inStock = true;
        //2. Non-primitive:
        String name = "Dress";
        String[] coloursAvailable = {"green", "blue", "pink"};
        //3. MyClass:
        MyClass myItemDress = new MyClass(quantity, size, price, true, name, coloursAvailable);
        System.out.println(myItemDress.presentData());

        //Compare to another instance:
        MyClass myItemSkit = new MyClass(4, 'S', 1499.0, true, "Skirt", new String[]{"black", "blue"});
        System.out.println(myItemSkit.equals(myItemDress)); //false

        //Compare to an identical instance:
        MyClass myItemDressCopy = new MyClass(myItemDress.id, myItemDress.quantity, myItemDress.size, myItemDress.price, myItemDress.inStock, myItemDress.name, myItemDress.coloursAvailable);
        System.out.println(myItemDressCopy.equals(myItemDress)); //true
    }
}
