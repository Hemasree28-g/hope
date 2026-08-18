class Demo{
    public void  show()
    {
        System.out.println("this is first one");
    }
}
class Demo2 extends Demo{
     public void display()
    {
        System.out.println("this is 2nd ");
    }
}
class Inheritance {
    public static void main(String args[])
    { 
   Demo2 obj=new Demo2();
    obj.show();
    obj.display();

    }
}