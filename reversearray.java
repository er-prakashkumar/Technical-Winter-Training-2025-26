public class reversearray {
    public static void main(String[] args) {
		int [] arr = {1,3,5,6,78};
		int n = arr.length;
		int [] arrrev = new int[n];
		int j=0;
		for (int i=n-1; i>=0; i--){
		    arrrev[j] = arr[i];
		    j++;
		}
		for (int i= 0; i<n; i++){
		    System.out.print(arrrev[i]+ " ");
		}
	}
}
// Reverse an array using new array