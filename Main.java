public class Main {
    public static void main(String[] args) {

        String str = "heLLoLL";
        int len = str.length();
        int count = 0;

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch == 'L') {
                count+=1;
            }
        }

        System.out.println(count);
    }
}