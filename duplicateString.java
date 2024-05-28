import java.util.*;
public class duplicateString {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        String s[]=new String[t];
        for(int i=0; i<t; i++){
            s[i] = input.nextLine();
        }
        for(int i=0;i<t;i++){
            String str[] = s[i].split(" ");
            
            LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        for (String element : str) {
            linkedHashSet.add(element);
        }

        for (String element : linkedHashSet) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    }
}
