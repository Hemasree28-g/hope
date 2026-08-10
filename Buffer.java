public class Buffer {
    public static void main(String args[])
    {
        StringBuffer sb=new StringBuffer("ya");
        sb.append(" that me");
        sb.insert(10, " hema");
        sb.delete(10,16);
        sb.insert(10, " liki");
        sb.replace(10, 16, "vijji");
        sb.reverse();
        System.out.println(sb);

    }
}
