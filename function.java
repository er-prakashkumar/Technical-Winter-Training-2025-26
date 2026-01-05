class function {
    static void sayHello() {
        System.out.println("Hello World");
    }
    static void fun1(int age){
        System.out.println("Your age is " + age);
    }
    static void fun2(int num){
        if(num>10){
            System.out.println(num);
        } else{
            System.out.println(num*2);
        }
    }
    public static void main(String[] args) {
        sayHello();  
        fun1(20);
        fun2(15);
        fun2(5);
    }
}

