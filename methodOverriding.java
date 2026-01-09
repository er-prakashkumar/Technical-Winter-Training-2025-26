class A {
    int x;
    public void display(){
        System.out.println("Inside A");
    }
}
class B extends A{
    int y ;
    public void display(){
        System.out.println("Inside B");
    }
}
class C extends A{
    public void display(){
        System.out.println("Inside C");
    }
}
public class methodOverriding{
    // code 1
    public static void main(String[] args){
        A a;
        a = new B();
        a.display();
        a = new C();
        a.display();
    }
    // code 2
    // public static void main(String[] args){
    //     A a;
    //     a = new B();
    //     System.out.println(a.y);
    // }
}
