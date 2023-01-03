import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendigMacine extends VendingMacine {

    private List<HotDrink> hotDrinks;

    public HotDrinkVendigMacine(){
        System.out.println("Выбрано меню горячих напитков");
        this.hotDrinks = new ArrayList<>();
    }

    public void addHotDrinks(HotDrink hotDrink){
        hotDrinks.add(hotDrink);
    }

    public List<HotDrink> getHotDrinks(){
        return hotDrinks;
    }

    // public void getProduct(){
    //     System.out.println("Горячий напиток выдан");
    // }
    // public void getProduct(String name){
    //     System.out.printf("Горячий напиток: %s", name);
    // }
}
