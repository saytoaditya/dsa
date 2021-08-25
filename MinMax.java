import java.util.*;
import java.util.Scanner; 
class MinMax
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter length of array");
        int length=scan.nextInt();
        int[] arr =new int[length];
        int min=0,max=0;
        for(int i=0;i<length;i++)
        {
            System.out.println("enter element of array");
            arr[i]=scan.nextInt();
        }
        
        if(length==1)
        {
             min=arr[0];
             max=arr[0];
        }
        else
        {
            if(arr[0]<arr[1])
             {
                min=arr[0];
                max=arr[1];
             }
             else
             {
                min=arr[1];
                max=arr[0];
             }
        for(int i=2;i<length;i++)
        {
            if(arr[i]<min)
            min=arr[i];
            else if(arr[i]>max)
            max=arr[i];  
        }
        }
        System.out.println("min "+min);
        System.out.println("max "+max);
    }
}