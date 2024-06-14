import java.util.*;
public class pattern2 {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
      
        for(int i=0;i<3;i++)
        {
            for(int j=num;j>0;j--)
            {
                System.out.print((j+i)+" ");
            }
            System.out.println();
        }
    }
    
}
