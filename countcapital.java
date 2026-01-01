public class countcapital {
    public static void main(String[] args) {

        String str = "gloBaL";
        int len = str.length();
        int count= 0;

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch<= 'Z') {
                count++;
            }
        }

        System.out.println(count);
    }
}
