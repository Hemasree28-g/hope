class Calculator {

    // Method with two int parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with three int parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double parameters
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();

        System.out.println(obj.add(5, 10));         // 15
        System.out.println(obj.add(5, 10, 15));     // 30
        System.out.println(obj.add(2.5, 3.5));      // 6.0
    }
}