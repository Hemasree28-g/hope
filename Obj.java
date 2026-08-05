class Cal
{
    public void add(int x, int y)
    {
        int sum =x+y;
        System.out.println("Sum is: " + sum);
    }
}

public class Obj
{
    public static void main(String args[])
    {
        int x = 10;
        int y = 20;

        Cal obj = new Cal();
        obj.add(x, y);
    }
}