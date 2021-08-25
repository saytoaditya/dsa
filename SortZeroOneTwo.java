import java.util.*;
import java.util.Scanner; 
class SortZeroOneTwo
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
        int low=0,mid=0,high=length-1,temp;
        while(mid<=high)
        {
            switch (arr[mid]) {
                case 0:
                    temp=arr[low];
                    arr[low]=arr[mid];
                    arr[mid]=temp;
                    low++;
                    mid++;
                break;
                case 1:
                        mid++;
                 break;
                case 2:
                    temp=arr[mid];
                    arr[mid]=arr[high];
                    arr[high]=temp;
                        
                        high--;
                break;
            }
        }
        System.out.println("-------------------------");
        for(int i=0;i<length;i++)
        {
            
            System.out.print(+arr[i]);
        }
    }
}
