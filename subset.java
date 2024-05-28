import java.util.*;
public class subset {
    static void arraylist(){
        ArrayList<Integer> num=new ArrayList<Integer>();
    }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int s=input.nextInt();
        int arr[]=new int[s];
        for(int i=0;i<s;i++)
        arr[i]=input.nextInt();
        for(int i=0;i<s;i++)
        {
            for(int j=i+1;j<s;j++)
            {
                System.out.println(arr[i]+" "+arr[j]);
            }
            System.out.println();
        }
    }
}
