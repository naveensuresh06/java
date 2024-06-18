class employee{
    String name;
    double salary;
    employee(String n,double s){
        name=n;
        salary=s;
    }
    // employee()
    // {
    //     name=" ";
    //     salary=0.0;
    // }
    String getName(){return name;}
    void setName(String n){name=n;}
    double getSalary(){return salary;}
    void setSalary(double s){salary=s;}
    void raiseSalary(double percent){
        salary+=salary*percent/100;
    }
}
class Manager extends employee{
    double bonus;
    Manager(String n,double sal,double bo){
    //    name=n;
    //    salary=sal;
    super(n,sal);
        bonus=bo;
    }
   void setBonus(double b){bonus=b;}
   double getbonus(){return bonus;}
   double getSalary(){
    return super.getSalary()+bonus;
   }

}
class Hr extends Manager{
    String gift;
    Hr(String n,double sal,double bo,String gif){
        super(n,sal,bo);
        gift=gif;
    }
}
public class inheritance {
    public static void main(String args[])
    {
        employee n1=new employee("naveen",30000);
        n1.raiseSalary(25);
        Manager m1=new Manager("suresh",50000,20000);
        System.out.println(m1.getbonus());
        System.out.println(m1.getSalary());
        Hr h1=new Hr("naveen",100000,40000,"doll");
        System.out.println(h1.getSalary());
    }
    
}
