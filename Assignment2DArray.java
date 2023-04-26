import java.util.*;

public class Assignment2DArray {
	

	// I had solved all these question without going through the solutions provided by the course and the faculty..........


	
	// Solution of Question no----------1............

	public static void Q1(int arr[][]){
		int m = arr.length;
		int n = arr[0].length;

		int positive= 0;
		int negative = 0;
		int odd = 0;
		int even = 0;
		int zero = 0;
		for(int i = 0; i< m; i++){
			for(int j = 0; j < n; j ++){

				// printing all positive integers
				if(arr[i][j] > 0){
					positive++;
				}
				else{
					continue;
				}
							}

			for(int j = 0; j < n; j ++){
				// printing all negative integers
				if(arr[i][j] < 0){
					negative++;
				}
				else{
					continue;
				}
				

			}
			for(int j = 0; j < n; j ++){
				// printing all odd numbers
				if(arr[i][j] % 2 != 0){
					odd++;
					}
				else{
					continue;
				}
			
				
			}
			for(int j = 0; j < n; j ++){
				// printing all even numbers
				
				if(arr[i][j] %2 == 0){
					even++;
				}
				else{
					continue;
				}

			}
			for(int j = 0; j < n; j ++){
				if(arr[i][j] == 0){
					zero++;
				}
			}
			
				}
				System.out.println("All positive numbers in given array are : " + positive);
				System.out.println("All negative numbers in given array are : " + negative);
				System.out.println("All odd numbers in given array are : " + odd);
				System.out.println("All even numbers in given array are : " + even);
				System.out.println("All zeros in given array are : " + zero);

			}
		



	// Solution no Question no---------2........
	public static void Q2(int arr[][]){
		int m = arr.length;
		int n = arr[0].length;
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				if(i + j < n-1){
					System.out.print(arr[i][j] + " ");
				}
			}
		}
	}
	// Solution of Question no-----------3..............
		public static void Q3(int arr[][]){
		int m = arr.length;
		int n = arr[0].length;
		for(int i = 0; i < m; i++){
			for(int j = 0; j <n; j++){
				if(i == j || i + j == n-1){
					System.out.print(arr[i][j] + " ");
				}

			}
		}
		}
		

	// Solution of Quesion no---------4.............
		public static int Q4(int arr[][]){
			int max = Integer.MIN_VALUE;
			int m = arr.length;
			int n = arr[0].length;
			for(int i = 0; i< m ; i++){
				for(int j = 0; j<n; j++){
					if(arr[i][j] > max){
						max = arr[i][j];
					}
					else{
						continue;
					}
				}
			}
			return max;
		}
	

	// Solution of Question no-----------5...................
		public static void Q5(int arr[][]){
			int m = arr.length;
			int n = arr[0].length;
			for(int i = 0; i < m; i++){
				for(int j = 0; j < n; j++){
					if(j == (n-1)/2 || i == (n-1)/2){
						System.out.print(arr[i][j] + " ");
					}
				}
			}
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of the rows you want.");
		int m = sc.nextInt();
		System.out.println("Please enter number of the column you want.");
		int n = sc.nextInt();
		int arr[][] = new int[m][n];

		for(int i = 0; i < m; i++){
			for(int j = 0; j< n; j++){
				
				arr[i][j] = sc.nextInt();
			}
			
		}

		// Q1(arr);
		Q2(arr);
		// Q3(arr);
		// int output1 = Q4(arr);
		// System.out.println("The largest number in given matrix is : " + output1);
		// Q5(arr);
	}
}
