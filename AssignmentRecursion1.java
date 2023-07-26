public class AssignmentRecursion1 {

    // Question no.1 sum of digit using recursion...
    public static int SumOfDigit(int n ){
        if(n== 0){
            return 0;
        }
        else{
            return n%10+ SumOfDigit(n/10);
        }
    }

    // Question no. 2.. sum of all natural numbers with alternate signss...
    public static int sumAlternative(int n){
        int result = 0;
        if(n == 0){
            return 0;
        }
        else if ( n % 2 == 0){
            result =  sumAlternative(n-1) -n;
        }
        else if (n %2 != 0){
            result =  n + sumAlternative(n-1) ;
        }
        return result;
    }
    
    // Question no .3.. finding the max of array using recursion...
    public static int MaxArray(int arr[], int n ){
        int max = 0;
        if(n <= 0){
            max = arr[0];
        }
        else{
            max = Math.max(arr[n-1], MaxArray(arr, n-1));
        }
        return max;

    }

    // Question no. 4. finding the sum of array using recursion...
    public static int SumOfArray(int arr[], int n){
        if(n <= 0){
            return 0;    
        }
        else{
            return SumOfArray(arr, n-1) + arr[n-1];
        }
    }

    // Question no. 5 .. checking if the given number is the armstrong number or not...
    public static int ArmStrongNumber(int n, int size){
        if(n==0 ){
            return 0;
        }
        else{
           
           return (int)Math.pow(n%10, size) + ArmStrongNumber(n/10, size);
        }
    }
    public static void main(String[] args) {
            // System.out.println(SumOfDigit(1234));
            // System.out.println(sumAlternative(10));
            int arr[] = {92, 23, 15, -20, 10};
            // System.out.println(MaxArray(arr, arr.length));
            // System.out.println(SumOfArray(arr, arr.length));
            int n = 371;
            int size = String.valueOf(n).length();
            int result = ArmStrongNumber(n, size);
            if(result == n){
                System.out.println("Given number is armstrong number..");
            }
            else{
                System.out.println("Given number is not armstrong number....");
            }
            // System.out.println(n/10);
            // System.out.println(String.valueOf(n).length());
    }   
}
