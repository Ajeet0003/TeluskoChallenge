import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Service service=new Service();

        service.addProduct(new Product("Type C", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Mac Studio", "Computer", "White Table", 2025));
        service.addProduct(new Product("Focusrite Mixer", "Audio System", "White Table", 2025));
        service.addProduct(new Product("Asus Vivobook", "Laptop", "Brown Drawer", 2021));
        service.addProduct(new Product("Asus Rog", "Laptop", "Black Table", 2021));
        service.addProduct(new Product("Macbook pro", "Laptop", "Brown Drawer", 2022));
        service.addProduct(new Product("Wacom Pad", "Writing Pad", "Black Drawer", 2020));
        service.addProduct(new Product("Apple Keyboard", "Keyboard", "White Table", 2022));
        service.addProduct(new Product("Logitech Keyboard", "Keyboard", "Black Table", 2024));
        service.addProduct(new Product("Hdmi cable", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Java Black Book", "Cable", "Shelf", 2024));
        service.addProduct(new Product("Logi Mouse", "Mouse", "Black Table", 2022));
        service.addProduct(new Product("Apple Mouse", "Mouse", "White Table", 2022));
        service.addProduct(new Product("Lenovo Mouse", "Mouse", "Black Drawer", 2022));
        service.addProduct(new Product("BlackBeast", "Computer", "White Table", 2020));

        System.out.println("+++++++++++Get All Product List ++++++++++++++++");

        List<Product> products= service.getAllProduct();
        for (Product p:products)
            System.out.println(p);

        System.out.println("+++++++++++Get Product  by Product name ++++++++++++++++");
      Product prod=  service.getProductByName("BlackBeast");
        System.out.println(prod);


        System.out.println("+++++++++++Get Product List by text ++++++++++++++++");
        List<Product >prolist=  service.getProductByText("Keyboard");
        for(Product pro:prolist)
         System.out.println(pro);


        System.out.println("+++++++++++Product List Search by Palce name ++++++++++++++++");
        List<Product> productList3=service.searchByPlace("Mouse");
        for (Product p:productList3){
            System.out.println(p);
        }


        System.out.println("+++++++++++Product List Out of Warranty ,before 2023 ++++++++++++++++");
    List<Product> productList4=service.outOfWarranty();
    for (Product p1:productList4){
        System.out.println(p1);
    }
}

}





