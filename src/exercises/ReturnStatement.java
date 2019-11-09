package exercises;

public class ReturnStatement
{
    public static void main(String[]args)
    {
       add(2,5);
       add(4,5);
       area(4,6);
       area(8,9);
    }

    public static void add(int a,int b)
    {
      int sum=a+b;
      System.out.println(sum);
      return ;
    }

    public static void area(int l,int b)
    {
       int multiply=l*b;
       System.out.println(multiply);
       return;
    }
}

