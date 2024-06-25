import java.util.*;
public class countchar {
    public static void main(String args[]){
        Scanner input =new Scanner(System.in);
        String s=input.nextLine();
        for(int j=0;j<s.length();j++){
            int c=0,co=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(j)==s.charAt(i))
            c++;  
        }
        for(int k=s.length()-1;k>=j;k--){
            if(s.charAt(j)==s.charAt(k)){
                co++;
            }
        }
        if(c==co){
        System.out.println(s.charAt(j)+"="+c);
        }
    }
    }  
}
