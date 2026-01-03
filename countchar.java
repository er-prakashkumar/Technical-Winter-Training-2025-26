public class countchar {
    public static void main(String[] args) {
		String s = "Top#z100z";
		int count=0;
		int j = s.length();
		for(int i =0; i<j; i++){
		    char ch = s.charAt(i);
		    if( ch=='z'){
		        count++;
		    }
		    
		}
		System.out.println("Total="+ count);
	}   
}
// Count a char 'z' in a string which contain alphabet, numerics and symbols.