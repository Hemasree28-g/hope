public class Yaa{
    public void MeBook()
    {
        System.out.println("ya tq");
    }
    public String getCost(int cost)
    {
        if(cost<10)
        {
        return "price";
        }
    }
}
public class Method {
    public static void main(String args[])
    {
        Yaa obj=new Yaa();
        obj.MeBook();
       String cost=obj.getCost(10);
        System.out.println(cost);
    }
}
