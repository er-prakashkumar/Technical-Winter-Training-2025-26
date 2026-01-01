/* 
public class removedigit {
    public static void main(String[] args) {

        String str = "#w100";
        int len = str.length();
        String newstr="";

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch<='9') {
                continue;
            }
            else{
                newstr = newstr + ch;
            }
        }

        System.out.println(newstr);
    }
}
*/

// how to alter if condition 
public class removedigit {
    public static void main(String[] args) {

        String str = "#w100";
        int len = str.length();
        String newstr="";

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (!(ch >= '0' && ch<='9')) {
                newstr = newstr + ch;
            }
        }

        System.out.println(newstr);
    }
}




