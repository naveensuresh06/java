import java.util.*;
public class arrayEvenpos2largestaddOddpos2smalestAccenture6 {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int s=input.nextInt();
        int arr[]=new int[s];
        for(int i=0;i<s;i++)
        arr[i]=input.nextInt();
        int even[],odd[];
        if(s%2==0){
            even=new int[s/2];
            odd=new int[s/2];
        }else
        {
            even=new int[(s/2)+1];
            odd=new int[s/2];
        }
        int j=0,k=0;
        for(int i=0;i<s;i++){
            if(i%2==0)
            even[j++]=arr[i];
            else
            odd[k++]=arr[i];
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        System.out.println(even[j-2]+odd[1]);
    }
}
