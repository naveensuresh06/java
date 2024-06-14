import java.util.*;
public class pattern3 {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        for(int i=2;i>=0;i--)
        {
            for(int j=num;j>0;j--)
            {
                System.out.print(i+j+" ");
            }
            System.out.println();
        }
    }
    
}
