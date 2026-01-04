public class reversearray2 {
    	public static void main(String[] args) {
		int [] arr = {1,3,5,6,78};
		int n = arr.length;
		int p= n-1;
		int j=0;
// 		while(p>j){
// 			int temp = arr[j];
// 			arr[j]= arr[p];
// 			arr[p]= temp;
//             p--;
// 			j++;
// 		}
		for(j = 0; p>j; p--, j++){
		    	int temp = arr[j];
			arr[j]= arr[p];
			arr[p]= temp;
			
		}
		for (int i= 0; i<n; i++){
		    System.out.print(arr[i]+ " ");
		}
        System.out.println(" ");
        int sum = 0;
        for(int i=0; i<n; i++){
            sum +=arr[i];
        }
        System.out.println("Sum of array's elements = "+ sum);
	}
}
