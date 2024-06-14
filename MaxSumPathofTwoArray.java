import java.util.*;
public class MaxSumPathofTwoArray {
    static void sumpath(int[] arr4, int[] arr5)
    {
        int add=0;
        for(int i=0;i<arr4.length;i++)
        {
            add=add+Math.max(arr4[i],arr5[i]);
        }
        System.out.println(add);
    }
    static int find(int s,int[] num)
    {   
        int co=0;
       for(int check : num)
       {
        if(s==check)
         co++;
       }
       if(co>0)
       return s;
       else
       return s+1;
    }
    static int Arraysize(int arr[],int arr2[],int s,int s2)
    {
        int count =0;
    for(int i=0;i<s;i++)
        {
            for(int j=0;j<s2;j++)
            {
                if(arr[i]==arr2[j])
                count++;
            }
        }
        return count;
    }
    public static void main(String args[])

    {
        Scanner input=new Scanner(System.in);
        int s=input.nextInt();
        int s2=input.nextInt();
        int arr[]=new int[s];
        int arr2[]=new int[s2];
        for(int i=0;i<s;i++)
        arr[i]=input.nextInt();
        Arrays.sort(arr);
        for(int i=0;i<s2;i++)
        arr2[i]=input.nextInt();
        Arrays.sort(arr2);
        int s3=Arraysize(arr,arr2,s,s2);
        int arr3[]=new int[s3];
        int c=0;
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s2;j++)
            {
                if(arr[i]==arr2[j])
                arr3[c++]=arr[i];
            }
        }
        int arr4[]=new int[c+1];
        int arr5[]=new int[c+1];
            int q=0,sum=0;
        for(int i=0;i<s;i++)
        {
            if(arr[i]==find(arr[i],arr3)||i==s-1)
            {
                sum=sum+arr[i];
                arr4[q]=sum;
                sum=0;
                q++;
            }else{
                sum=sum+arr[i];
            }
        }
            q=0;sum=0;
        for(int i=0;i<s2;i++)
        {
            if(arr2[i]==find(arr2[i],arr3)||i==s2-1)
            {
                sum=sum+arr2[i];
                arr5[q]=sum;
                sum=0;
                q++;  
            }else{
                sum=sum+arr2[i];
            }
        }
        sumpath(arr4,arr5);
    }
}
