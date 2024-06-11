import java.util.*;
public class shorODDandEVENpos {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        arr[i]=input.nextInt();
        int od=0,ev=0;
        Set<Integer> s1=new HashSet<Integer>();
        Set<Integer> s2=new HashSet<Integer>();
        for(int i=0;i<size;i++)
        {
            if(i%2==0)
            s1.add(arr[i]);
            else
            s2.add(arr[i]);
        }
        System.out.println(s1);
        System.out.println(s2);
    }   
}
