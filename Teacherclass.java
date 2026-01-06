public class Teacherclass {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher();
        teacher1.name = "Rita";
        teacher1.subject ="Maths";
        teacher2.name = "Aarti Mam";
        teacher2.subject ="JAVA";
        System.out.println(teacher1.name);
        System.out.println(teacher1.subject);
        System.out.println(teacher2.name);
        System.out.println(teacher2.subject);
    }
}
class Teacher{
    String name;
    String subject;
}