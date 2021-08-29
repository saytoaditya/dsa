import java.util.*;
import java.util.Scanner;
public class MergeArray
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter length of array");
        int length=scan.nextInt();
        System.out.println("enter length of array 2");
        int length1=scan.nextInt();
        int[] arr =new int[length];
        int[] arr1 =new int[length1];
        for(int i=0;i<length;i++)
        {
            System.out.println("enter element of array");
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<length1;i++)
        {
            System.out.println("enter element of array 1");
            arr1[i]=scan.nextInt();
        }
        int j=0,k=0,l=length-1;
        while(j<=l &&k<length1)
        {
            if(arr[j]<arr1[k])
            j++;
            else
            int  temp=arr1[k];
            arr1[k]=arr[l];
            arr[l]=temp;
            k++;
            l--;
        }
        Arrays.sort(arr);
        Arrays.sort(arr1);
        for(int i=0;i<length;i++)
        {
            
            System.out.print(+arr[i]);
        }
        System.out.println(" ");
        for(int n=0;n<length1;n++)
        {
            System.out.print(+arr1[n]);
        }
    }
}
