class A {
    public void show() {
        System.out.println("hello");
    }
}

class B extends A {
}

public class Poly {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}