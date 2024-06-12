import java.util.*;
public class shaortedOnEvenOddArray {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        arr[i]=input.nextInt();
        Set<Integer> s=new HashSet<Integer>();
        Set<Integer> s2=new HashSet<Integer>();
        for(int i=0;i<size;i++)
        {
            if(i%2==0)
            s.add(arr[i]);
            else
            s2.add(arr[i]);
        }
        System.out.println(s);
        System.out.println(s2);
    }
       
}
