public class printsmallchar {
    public static void main(String[] args) {

        String str = "gloBaL";
        int len = str.length();
        String newstr ="";

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if(ch >= 'a' && ch<='z'){
                newstr = newstr + ch;
            }
        }

        System.out.println(newstr);
    }
}
