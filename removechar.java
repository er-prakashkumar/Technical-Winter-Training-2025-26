public class removechar {
    public static void main(String[] args) {

        String str = "global";
        int len = str.length();
        String newstr="";

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch != 'a') {
                newstr = newstr + ch;
            }
        }

        System.out.println(newstr);
    }
}


/*public class Main {
    public static void main(String[] args) {

        String str = "global";
        int len = str.length();
        String newstr="";

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch != 'a'&& ch != 'b') {
                newstr = newstr + ch;
            }
        }

        System.out.println(newstr);
    }
} */