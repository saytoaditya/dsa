import java.util.*;
import java.util.Scanner; 
class RotateArray
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
        int temp=arr[length-1];
        for(int i=length-1;i>=0;i--)
        {
            if(i==0)
            {
                arr[i]=temp;
            }
            else
            arr[i]=arr[i-1];
        }
        System.out.println("-------------------------");
        for(int i=0;i<length;i++)
        {
            
            System.out.print(+arr[i]);
        }
    }
}