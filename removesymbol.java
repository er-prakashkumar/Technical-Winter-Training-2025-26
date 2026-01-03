public class removesymbol {
    public static void main(String[] args) {
		String s = "Top$10$0";
		String s1="";
		int j = s.length();
		for(int i =0; i<j; i++){
		    char ch = s.charAt(i);
		    if(ch== '$'){
		        continue;
		    } else{
                 s1= s1+ch;
            }
		    
		}
		System.out.println(s1);
	}
    
}
// Remove $ symbol from given string

