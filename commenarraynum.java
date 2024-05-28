import java.util.*;
public class commenarraynum {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int s=input.nextInt();
        int s2=input.nextInt();
        int arr[]=new int[s];
        int arr1[]=new int[s2];
        for(int i=0;i<s;i++)
        arr[i]=input.nextInt();
        for(int i=0;i<s2;i++)
        arr1[i]=input.nextInt();
        int count=0;
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s2;j++){
            if(count==1){
                count=0;
                break;
            }
            
                if(arr[i]==arr1[j])
                {
                    System.out.print(arr[i]);
                    count++;
                }
            }
            System.out.println();
        }

    }

    
}
