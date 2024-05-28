import java.util.*;
public class BinaryNumStringAccenture2 {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        Stack<Integer> s1=new Stack<Integer>();
        Stack<Character> s2=new Stack<Character>();
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)=='1')
            s1.push(1);
            else if(str.charAt(i)=='0')
            s1.push(0);
            else if(str.charAt(i)=='A')
            s2.push('A');
            else if(str.charAt(i)=='B')
            s2.push('B');
            else
            s2.push('C');
        }
        int b=s1.pop();
        for(int i=0;i<str.length()/2;i++){
            char s=s2.pop();
            if(s=='A')
            b=b&s1.pop();
            else if(s=='B')
            b=b|s1.pop();
            else if(s=='C')
            b=b^s1.pop();
        }
        System.out.print(b);
    }
    
}
