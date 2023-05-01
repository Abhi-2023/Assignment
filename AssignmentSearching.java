import java.util.*;

public class AssignmentSearching {
    // Question no.1..........

    // Searching the target by linear search
    public static void LinearSearch(int arr[], int target){
        int n = arr.length;
        int index = -1;
        for(int i = 0; i < n ; i++ ){
            if(arr[i] == target){
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("The element you have searched is not found in the given array!!!!!!!");
        }
        else{
            System.out.println("The element you have searched for have found on the index in the given array is : " +index);
        }

    }

    // Question no.2...........

    // Find the last occrence of target.......

    public static void LastOccurence(int arr[], int target){
        int low = 0; 
        int high = arr.length;
        int result = -1;
        while(low<= high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                result  = mid;
                low = mid+1;
            }
            else if(arr[mid] > target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        if(result == -1){
            System.out.println("Entered element is not found the given array!!!!");
        }
        else{
            System.out.println("The last occurenece of searched element is at : " + result);
        }
    }

    // Question no.3.......

    // count the number of 1's...

    public static void Count1(int arr[]){
        int n = arr.length;
        int count  = 0;
        for(int i = 0; i < n ; i++ ){
            if(arr[i] == 1){
                count++;
            }
        }
        System.out.println("The total number of 1's in a given array is : " + count);
    }

    // Question no.4........

    // counting the occurence of target.........
    public static void TargetOccurence(int arr[], int target){
        int n = arr.length;
        int count  = 0;
        for(int i = 0; i < n ; i++ ){
            if(arr[i] == target){
                count++;
            }
        }
        System.out.println("The total occurence of " + target + " in a given array is : " + count);
    }

    // Question no.5.........

    // Checking if a user input number is a perfect square or not...
    public static boolean PerfectSquare(int num){
        // int output = 0;
        boolean perfectSquare = false;
        for(int i = 1; i <= num/2; i++){
            if(i * i == num){
                perfectSquare = true;
                break;
            }
            else{
                perfectSquare = false;
            }
        }
        return perfectSquare;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of an array");
        // int size = sc.nextInt();
        // int[] arr = new int[size];
        // System.out.println("Enter the elements of array...");
        // for(int i = 0; i < arr.length; i++){
        //     arr[i] = sc.nextInt(); 
        // }
        System.out.println("Please enter the number...");
        int num = sc.nextInt();
        // LinearSearch(arr, target);
        // LastOccurence(arr, target);
        // Arrays.sort(arr);
        // Count1(arr);
        // TargetOccurence(arr, target);
            System.out.println(PerfectSquare(num));
    }
}
