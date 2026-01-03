public class chashr{
    public static void main(String[] args) {
		String s = "Topper";
		String s1="";
		int j = s.length();
		for(int i =0; i<j; i++){
		    char ch = s.charAt(i);
		    if(i%2==0){
		        s1= s1+ch;
		    }else{
		        s1= s1+ "#";}
		        System.out.println(s1);
		    }
		    
		
	}
    
}
