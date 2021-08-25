import java.util.*;
import java.util.Scanner; 
class ReverseArray
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter length of array");
        int length=scan.nextInt();
        int[] arr =new int[length];
        for(int i=0;i<length;i++)
        {
            System.out.println("enter element of array");
            arr[i]=scan.nextInt();
        }
        int temp=0;
        int counter=length;
        for(int i=0;i<length/2;i++)
        {
            temp=arr[i];
            arr[i]=arr[counter-1];
            arr[counter-1]=temp;
            counter--;
        }
        System.out.println("-------------------------");
        for(int i=0;i<length;i++)
        {
            
            System.out.print(+arr[i]);
        }
    }
}