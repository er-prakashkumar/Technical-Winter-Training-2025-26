public class repachar2 {
    public static void main(String[] args) {
		String s = "Aman";
		String s1="";
		int j = s.length();
		for(int i =0; i<j; i++){
		    char ch = s.charAt(i);
		    if(ch == 'a'){
		        s1= s1+ch + ch + ch ;
		    }
		    else if(ch == 'A'){
		        s1= s1+ch +ch;
		    } else{
		        s1 = s1+ ch;
		    }
		}
		System.out.println(s1);
	}
    
}
// Repeat character 'a' 3 times and 'A' two times if that found in given string.