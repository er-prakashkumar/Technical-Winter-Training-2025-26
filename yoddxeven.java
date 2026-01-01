public class yoddxeven {
    
    public static void main(String[] args){
        int n = 5;
        String str = "";
        for(int i = 1; i<=n; i++){
            if(i%2==0){
             str = str + "x" ;
            }else {
                str = str + "y";
            }
        }
    System.out.println(str);
    }
}
