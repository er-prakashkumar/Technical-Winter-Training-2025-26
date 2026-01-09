class Parent{
   Parent(){
       System.out.println("GG");
   }
        Parent(int num1){
            System.out.println("Parent Constructor");
    }
}
class child extends Parent{
    child(){
        System.out.println("gg");
    }
    child(int a){
        System.out.println("Child Construsctor");
    }
}
public class inheritance{
    public static void main(String[] args){
        child obj = new child(10);
    }
}