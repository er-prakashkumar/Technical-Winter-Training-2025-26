class fun2 {
    static void details(String name, int age){
        System.out.println(name +", "+ age);
    }
    public static void main (String[] args){
        //details(24, "Amar"); Error :: we need exact datatype in sequence.
        details("Amar",24);        
    }
}
