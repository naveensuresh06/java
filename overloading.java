public class overloading {
    static void pass()
    {
        System.out.println("all subject fail");
    }
    static void pass(String m,String t){
        System.out.println(m+"and"+t+"  subject will be pass");
    }
    static void pass(int a){
        System.out.println(a+" subject will be pass");
    }
    
    public static void main(String args[])
    {
        // same methode name and different parameters(different data types passing)
        // is called overloading. 
        pass();
        pass("maths","tamil");
        pass(4);
    }
    
}
