package en00a;


public class Q02 {
    public static void main(String[] args) {
        Item item1 = new Item("apple", 200);

        System.out.println(item1.getName() + "," + item1.getValue());

        Item item2 = item1;

        item2.setValue(300);

        System.out.println("item1:"+item1.getName() + "," + item1.getValue());
        System.out.println("item2:"+item2.getName() + "," + item1.getValue());

    }
}
