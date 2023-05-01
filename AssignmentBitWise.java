import java.util.*;



public class AssignmentBitWise {
   

    // Question no.1...........

    public static int decToBin(int num){
        int pow = 0;
        int binary = 0;
        while(num>0){
            int ld = num%2;
            num /=2;
            binary = (int)(binary + (ld*Math.pow(10, pow)));
            pow++;
        }
        return binary;
    }

    // Question no.2......

    public static boolean PowerOF2(int n){
       return (n & (n-1)) == 0;
    }
    // Question no.3.........

    public static void CheckOddEven(int num){
        int bitmask = 1;
        int result = (num & bitmask);
        if(result == 1){
            System.out.println("Entered number is odd..");
        }
        else{
            System.out.println("Entered number is even..");
        }
    }
   


    // Question no.4....

    public static int CountSetBits(int num){
        
        int count = 0; 
        while(num > 0){
            if((num&1) != 0){
                count++;
            }
            num = num >> 1;
        }
        return count;

    }


    // Question no.5.........

    public static void duplicateElements(int arr[]){
        int count = 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number.");
        int num = sc.nextInt();
        // int result1 = decToBin(num);
        // System.out.println("The binary representation of " + num + " is : " + result1);
        // System.out.println(PowerOF2(num));
        // CheckOddEven(num);
        System.out.println("Number of set bit in " +num +" are :"+CountSetBits(num));
        int arr[] = {4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3};
        // duplicateElements(arr);
        sc.close();
        
    }
}
