public class replacenumwithhash {
    public static void main(String[] args) {

        String str = "123456789";
        int len = str.length();
       String newstr = "";

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch == '1' || ch== '5') {
                newstr = newstr + '#';
            }
            else{
                newstr = newstr + ch;
            }
        }

        System.out.println(newstr);
    }
}
