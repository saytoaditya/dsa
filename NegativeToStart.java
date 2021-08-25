
import java.util.*;
import java.util.Scanner; 
class NegativeToStart
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
        //-12, 11, -13, -5, 6, -7, 5, -3, -6,1
        
        int start=0,high=length-1,temp=0;
        while(start<=high)
        {
            if(arr[start]<0)
            {
                start++;
            }
            else{
                temp=arr[start];
                arr[start]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
        System.out.println("-------------------------");
        for(int i=0;i<length;i++)
        {
            
            System.out.print(+arr[i]);
        }
    }
}