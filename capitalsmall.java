public class capitalsmall {
    public static void main(String[] args) {
		String s = "TriSeCt";
		int j = s.length();
		for(int i =0; i<j; i++){
		    char ch = s.charAt(i);
		    if( ch>='a' && ch<='z'){
		        System.out.println(ch + ":small");
		    }
            if( ch>='A' && ch<='Z'){
		        System.out.println(ch + ":capital");
		    }	    
		}
	}   
}
