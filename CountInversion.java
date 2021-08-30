import java.util.*;
import java.util.Scanner; 
class CountInversion
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
        int count=0;
         
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                count++;
                
            }
        }
        System.out.println(count);
    }
}