import java.util.*;
import java.io.*;
public class minmax
{
    public int min(int[] arr)
    {
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }
    public int max(int[] arr)
    {
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter array range");
        n = in.nextInt();
        int array[]= new int[n];
        System.out.println("Enter array values");
        for(int i=0;i<n;i++)
        {
            array[i]=in.nextInt();
        }
        minmax m = new minmax();
        System.out.println("Min value in the array is = "+m.min(array));
        System.out.println("Max value in the array is = "+m.max(array));
    }
}
