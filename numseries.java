class numseries {
    
    static String numberSeries(int n) {
        String num = "";

        for (int i = 1; i <= n; i++) {
            num = num + i;
        }

        return num;
    }

    static String[] seriesArray(int[] mylist) {

        String[] mylist1 = new String[mylist.length];

        for (int i = 0; i < mylist.length; i++) {
            mylist1[i] = numberSeries(mylist[i]);
        }

        return mylist1;
    }
    public static void main(String[] args) {
    int[] input = {1, 4, 3};

    String[] output = seriesArray(input);

    System.out.print("{");
    for (int i = 0; i < output.length; i++) {
        System.out.print("\"" + output[i] + "\"");
        if (i < output.length - 1) {
            System.out.print(", ");
        }
    }
    System.out.print("}");
}
}
