import java.util.*;
public class pattern1 {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int k=0;
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<=i;j++){
            System.out.print(k++ +" ");
            }
            System.out.println();
        }
    }
    
}
