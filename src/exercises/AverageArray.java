package exercises;

public class AverageArray
{
 public static void main(String args[])
 {
     int array[]={22,40,50,60,-20,25,-55,70};
     double average=0;
     int sum=0;
       for(int i=0;i<array.length;i++)
       {

           sum=sum+array[i];
            average=sum/array.length;
       }
       System.out.println("average of length.array"+average);


 }


}
