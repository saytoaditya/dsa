import java.util.*;
import java.util.Scanner;
public class MinimizeHeight
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
        int k=4;
        int n=length;
        Arrays.sort(arr);
        int ans=arr[n-1]-arr[0];
        int small=arr[0]+k;
        int large=arr[length-1]-k;
        int mi,max;
        for(int i=1;i<n-1;i++)
        {
           mi=Math.min(small,arr[i+1]-k);
           max=Math.max(large,arr[i]+k);
           if(mi<0)
           continue;
           ans=Math.min(ans,max-mi);
        }
        System.out.println(ans);
    }
}