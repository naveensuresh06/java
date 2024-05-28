import java.util.*; 
public class ProductSmallestPairAccenture7 {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int sum=input.nextInt();
        int size=input.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=input.nextInt();
        Arrays.sort(arr);
        if(arr[0]+arr[1]<=sum)
            System.out.println(arr[0]*arr[1]);
        else
            System.out.println("0");
    }   
}
