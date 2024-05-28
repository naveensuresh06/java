import java.util.*;
public class AmountOfFoodPresentHouseAccenture1 {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int r=input.nextInt();
        int unit=input.nextInt();
        int s=input.nextInt();
        int arr[]=new int[s];
        for(int i=0;i<s;i++)
        arr[i]=input.nextInt();
        int count=0;
        int num=r*unit;
        int tot=0;
        for(int i=0;i<s;i++)
        {
            if(tot>=num)break;
            else{
            tot=tot+arr[i];
            count++;
            }
        }
        if(tot==0||s==0)
        System.out.print("-1");
        else if(count==s && tot<num)
            System.out.print("0");
        else
        System.out.print(count);

    }    
}
