package exercises;

public class TimeTableFunction
{
public static void main(String []args)
{
    printTimeTable(5);
    printTimeTable(25);
}
 public static void printTimeTable( int a)
 {
   for(int i=1;i<=10;i++)
     System.out.println(a*i);

 }
}
