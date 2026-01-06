public class contructor1 {
    public static void main(String[] args) {
        Item item1 = new Item(5,10);
        System.out.println(item1.quantity);
        System.out.println(item1.price);
         Item item2 = new Item();
        System.out.println(item2.quantity);
        System.out.println(item2.price);
        }
}
class Item{
    int quantity;
    int price;
    Item(int q, int p){
        quantity = q;
        price = p;
    }
    Item(){
     quantity = 10;
     price = 10;
    }
}