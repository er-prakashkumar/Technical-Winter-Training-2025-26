public class repachar {
    	public static void main(String[] args) {
		String s = "code";
		String s1="";
		int j = s.length();
		for(int i =0; i<j; i++){
		    char ch = s.charAt(i);
		    if(ch == 'd'){
		        s1= s1+ch + ch ;
		    }
		    else{
		        s1= s1+ch;
		    }
		}
		System.out.println(s1);
	}
}
 
// Repeat the given character if that found in given string.