package en03;

/**
 * Created by C0116289 on 2017/04/24.
 */
public class Item {
    private String name;
    private int price;
    private static int totalPrice;

    public Item(String name,int price){
        this.name=name;
        this.price=price;
        totalPrice+=price;
    }

    public static int getTotalPrice(){
        return totalPrice;
    }

    public String getProperties(){
        return this.name+", "+this.price;
    }
}
