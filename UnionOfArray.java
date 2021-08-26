import java.util.HashMap;
import java.util.*;
import java.util.Scanner; 
class UnionOfArray
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter length of array");
        int length=scan.nextInt();
        System.out.println("enter length of array 2");
        int length1=scan.nextInt();
        int[] arr =new int[length];
        int[] arr1 =new int[length];
        int min=0,max=0;
        for(int i=0;i<length;i++)
        {
            System.out.println("enter element of array");
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<length1;i++)
        {
            System.out.println("enter element of array1");
            arr1[i]=scan.nextInt();
        }
        HashMap<Integer, Integer> numberCount = new HashMap<Integer, Integer>();
        for(int i=0;i<length;i++)
        {
            numberCount.put(arr[i],i);
        }
        for(int i=0;i<length1;i++)
        {
            numberCount.put(arr1[i],i);
        }
        for(int i:numberCount.keySet())
        {
            System.out.println(i);
        }
    }
}