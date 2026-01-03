public class countxy {
    public static void main(String[] args) {
		String s = "Exactlyy";
		int countx=0;
        int county=0;
		int j = s.length();
		for(int i =0; i<j; i++){
		    char ch = s.charAt(i);
		    if( ch=='x'){
		        countx++;
		    }
            if( ch=='y'){
		        county++;
		    }
		    
		}
		System.out.println("x#"+ countx);
        System.out.println("y#"+ county);
	}   
}
