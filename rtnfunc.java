class rtnfunc {
    static int sumab(int a, int b){
        int sum;
        sum = a + b;
        return sum;    
    }
    static int squar(int a){
        int sqr;
        sqr = a*a;
        return sqr;
    }
    public static void main(String[] args) {
        int sum = sumab(8,7);
        int sqr = squar(3);
        System.out.println(sum);
        System.out.println(sqr);
    }
}
