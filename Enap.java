class Details{
    private String name="hema";
     private int age;
    public String getname()
    {
        return name;
    }
    public int getage()
    {
        return age;
    }
    public int setAge(int a)
    {
        age=a;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

}
public class Enap
{
    public static void main(String args[])
    {
        Details obj= new Details();
        obj.setAge(18);
        System.out.println(obj.getname()+":"+obj.getage());
    }
}