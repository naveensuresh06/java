import java.util.*;
public class MaxExponents {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int n1=input.nextInt();
        int n2=input.nextInt();
        // ArrayList<Integer> a1=new ArrayList<Integer>();
        // ArrayList<Integer> a2=new ArrayList<Integer>();
        // ArrayList<Integer> a3=new ArrayList<Integer>();
        // int max=Integer.MIN_VALUE;
        // int count=0;
        // for(int i=n1;i<=n2;i++)
        // {
        //     if(i%2!=0){
        //     a1.add(0);
        //     a2.add(i);
        //     }
        //     else{
        //         int nu=i;
        //         while(nu%2==0){
        //         count++;
        //         nu=nu/2;
        //         }
        //         a1.add(count);
        //         a2.add(i);
        //     }
        //     count=0;
        // }
        // int m=Collections.max(a1);
        // for(int i=0;i<=n2-n1+1;i++){
        //     int value=a1.get(i);
        // if(value==m){
        //     int value2=a2.get(i);
        // System.out.println(value2);
        // break;
        // }
        // }
        int count=0,temp=0,ans=0;
        for(int i=n1;i<=n2;i++)
        {
            int num=i;
            while(num%2==0)
            {
                count++;
                num=num/2;
            }
            if(count>temp)
            {
                temp=count;
                ans=i;
            }
            count=0;
        }
        System.out.println(ans);
    }
    
}
