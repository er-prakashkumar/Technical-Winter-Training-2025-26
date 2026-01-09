class Data{
    private String name;
    // getter method
    public String getName(){
        return this.name;
    }
    // setter method 
    public void setName (String name){
        this.name = name;
}
    public String toString(){
            return name;
        }
}
public class toString {
    public static void main(String[] main){
        Data d = new Data();
        // access the private variable using the getter and setter
        d.setName("Trisect");
        System.out.println(d.toString());
    }
}
