public class methode {//regersive algorithm
    static int i=0;
    static void method1(){
        System.out.println(i++);
        method2();
    }
    static void method2(){
        System.out.println(i++);
        method1();
    }
    public static void main(String args[])
    {
        method1();
    }
}
