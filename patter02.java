public class patter02 {
    public static void main(String[] args){
        int n = 5;
        String str="";
        String str2 ="";
        for(int i = 1; i<=n; i++){
            str = str + i;
            System.out.println(str);
        }
        for(int i = n; i>0; i--){
            str2 = str2 + i;
            System.out.println(str2);
        }

    }
}
