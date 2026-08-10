class Mobile {
    String brand;
    String name;
    int price;

    public void show() {
        System.out.println(brand + ":" + name + ":" + price);
    }
}

public class Varstatic {
    public static void main(String args[]) {

        Mobile obj = new Mobile();
        obj.brand = "Apple";
        obj.name = "13pro";
        obj.price = 10000000;

        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.name = "pro";
        obj1.price = 20000000;

        Mobile obj2 = new Mobile();
        obj2.brand = "Realme";
        obj2.name = "model";
        obj2.price = 500000;

        obj.show();
        obj1.show();
        obj2.show();
    }
}