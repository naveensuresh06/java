class A{
    int i=0;
    A(){
        System.out.println("A");
    }
    A(int i){
        i++;
        System.out.println(i+"A int");
    }
}

    class B extends A{
        B(int i){
            i++;System.out.println(i+"B int");}
        B(){
            System.out.println(i+"B");}
    public static void main(String args[]){
        B b=new B();
        System.out.println(b.i);
        B b1=new B(10);
        System.out.println(b1.i);
    }
    
}
