import java.util.*;
public class differencetoarrayAccenture4 {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int s=input.nextInt();
        int arr[]=new int[s];
        int num=input.nextInt();
        int diff=input.nextInt();
        int count=0;
        for(int i=0;i<s;i++)
        arr[i]=input.nextInt();
        for(int i=0;i<=diff;i++)
        {
            if(arr[i]<=num)
            count++;

        }
        System.out.println(count);
    }
    
}
