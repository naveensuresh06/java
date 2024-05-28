import java.util.*;
public class FactorsOfNumber {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        if(num<0)
        num=-num;
        for(int i=1;i<=num;i++){
            if(num%i==0)
            arr.add(i);
        }
        System.out.println(arr);
    }
    
}
