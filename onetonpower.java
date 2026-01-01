public class onetonpower {
    	public static void main(String[] args){
        int n = 5;
        int j = 3;
        int r = 1;
        String str= "";
        for(int i = 1; i<=j; i++){
            r = r*n;
            str = str + r + "#";
        }
        System.out.println(str);
}
}
