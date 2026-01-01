public class patterny
{
	public static void main(String[] args) {
	 int n = 5;
	 String px ="";
	 String py ="y";
	 int z = n*2;
	 for(int i=1; i<=n; i++){
     px = px + py +z;
     System.out.println(px);
     z-=2;
	}
	}
}