class Student{
        String name;
        int roll;
    }
public class classnobject {
    public static void main(String[] args) {
        Student obj = new Student();
        System.out.println(obj.name); // Default value is "null"
        System.out.println(obj.roll); // Default value is 0.
        obj.name="Prakash";
        obj.roll=19;
        System.out.println(obj.name);
        System.out.println(obj.roll);
    }
}
