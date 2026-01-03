public class removesmallchar {
    public static void main(String[] args) {
		String s = "Top#100";
		String s1="";
		int j = s.length();
		for(int i =0; i<j; i++){
		    char ch = s.charAt(i);
		    if(!(ch>= 'a' && ch<='z')){
		        s1= s1+ch;
		    }
		    
		}
		System.out.println(s1);
	}
    
}
// Remove small letter from given string