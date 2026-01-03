public class onetoab9toc {
    public static void main(String[] args){
        String s = "211fg9t";
		String s1= "";
		int j = s.length();
		for(int i =0; i<j; i++){
		    char ch = s.charAt(i);
		    if( ch=='1'){
		        s1 = s1 +"ab";
		    }
            else if(ch=='9'){
                s1 = s1 +"c";
            }else{
                s1 = s1 + ch;
            }
		    
		}
		System.out.println(s1);
    }
}
// Given a string as input. Change every 1 to "ab" and 9 to 'c' in given string.