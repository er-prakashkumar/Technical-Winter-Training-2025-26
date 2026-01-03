public class countuprlwrchar {
    public static void main(String[] args){
        String s = "Top#z100z";
		int countl=0;
        int countu=0;
		int j = s.length();
		for(int i =0; i<j; i++){
		    char ch = s.charAt(i);
		    if( ch>='a' && ch<='z'){
		        countl++;
		    }
            if(ch>='A' && ch<='Z'){
                countu++;
            }
		    
		}
		System.out.println("Upper="+ countu);
        System.out.println("Lower=" + countl);
    }
}

// Count capital letter and small letter of a string which contain alphabet, numerics and symbols