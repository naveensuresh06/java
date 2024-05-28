import java.util.*;
public class DiffBtwnDivisibleNondivisibleAccentyure5 {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int lim=input.nextInt();
        int div=0,nondiv=0;
        for(int i=1;i<=lim;i++)
        {
            if(i%num==0)
            div=div+i;
            else
            nondiv=nondiv+i;
        }
        System.out.println(nondiv-div);

    }
}
