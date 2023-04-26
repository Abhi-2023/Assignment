import java.util.Arrays;

class Assignment1DArray{

    // Solution of Question no---------1............
    public static int Q1(int arr[]){
        int n = arr.length;
 
        int sum = 0;
        for(int i = 0; i < n; i+=2){
            sum += arr[i];
        }
        return sum;
       
    }

        // I had solved these below questions before checking the solution provide by pwskills............

    // Solution of Question no----------2............
    public static void Q2(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i]%2 == 0){
                System.out.print(arr[i] + " ");
            }
            else{
                continue;
            }
        }
    }


    // Solution of Question no-----------3..........
    public static int Q3(int arr[]){
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            else{continue;}
        }
        return max;
    }

    // Solution of Question no----------4............
    public static int Q4(int arr[]){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        Arrays.sort(arr);
        for(int i = 1; i < n ; i++){
            if(arr[i] > max){
                max = arr[i-1];
            }
            else{
                continue;
            }
            
        }
        return max;
    }

    // Solution of Queston no----------5..........
    public static void Q5(int arr[]) {
        int n = arr.length;
        for(int i = 1; i < n -1; i++){
            if(arr[i]> arr[i-1] && arr[i] >arr[i+1]){
                System.out.println("The first peak element is : " + arr[i]);
            }
            else{
                continue;
            }
        }

    }


    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6,7,20, 25, 23, 24};
        // int output = Q1(arr);
        // System.out.println(output);
        // System.out.println("All the even elements in given array are :- ");
        // Q2(arr);
        // int output1 = Q3(arr);
        // System.out.println(output1);
        // int output2 = Q4(arr);
        // System.out.println(output2);
        // Q5(arr);
    }
}