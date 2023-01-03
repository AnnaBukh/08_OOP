import java.util.List;

public class VendingMacine {

    public void initProduct(List<Product> products){
        Product product1 = new Product("Шоколад", 150);
        // Product product2 = new Eats(2, 50);
        // Product product3 = new Eats("Chips", 1.0, 40.0, 100.0);
        // Eats product4 = new Eats("Chips", 1.0, 40.0, 100.0);
    }


    // //переопределить метод в HotDrinkVendingMachine для вывода выданных продуктов HotDrink 
    // public void getProduct(String name, double volume, double temperature){
    //     System.out.println("Выдан продукт: ");
    // }

    public void restore(){
        System.out.println("Продукт выдан");
    }

}

