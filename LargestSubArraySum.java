
import java.util.*;
import java.util.Scanner; 
class LargestSubArraySum
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
        int currentSum=0,maxSum=0,maxValue=Integer.MIN_VALUE;
        for(int i=0;i<length;i++)
        {
            if(arr[i]>maxValue)
            {
                maxValue=arr[i];
            }
            currentSum=currentSum+arr[i];
            if(currentSum>maxSum)
            maxSum=currentSum;
            else if(currentSum<0)
            currentSum=0;
        }
        if(maxSum!=0)
        System.out.println(+maxSum);
        else
        System.out.println(+maxValue);
    }
}