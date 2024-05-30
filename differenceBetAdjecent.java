import java.util.*;
public class differenceBetAdjecent {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        arr[i]=input.nextInt();
        Arrays.sort(arr);
        int j=0,k=1,num=0;
        for(int i=0;i<size-1;i++)
        {
           num=num+(arr[k++]-arr[j++]);
        }
        System.out.print(num);
    }
    
}
