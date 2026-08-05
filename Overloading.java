class Frinds {
    public int add(int x, int y) {
        return x + y;
    }
}

public class Overloading {
    public static void main(String args[]) {
        Frinds obj = new Frinds();   // Create object
        int sum = obj.add(4, 6);     // Call add() method
        System.out.println(sum);     // Print result
    }
}