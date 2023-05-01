import java.util.Arrays;

public class AssignmentSorting {

    // Question no 1 & 4........

    // Sorting an array using bubble sort in decreasing order method.........

    public static void DecreaseBubble(int arr[]){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length -i - 1; j++){
                    if(arr[j] < arr [j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        
                    }
                    count++;
                }
        }

        System.out.println("The total passes would be required to sort this array is : " + count);    
    }

            // Question no 2 & 5........

    // Sorting an array using selection sort in decreasing order method..............

    public static void DecreaseSelection(int arr[]){  
        int count = 0;
  
        for(int i = 0; i < arr.length; i++)
        {
            int min_Index = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[min_Index] < arr[j] ){
                    min_Index = j;
                }
                count++;

            }
            if(min_Index != i){
                int temp = arr[i];
                arr[i] = arr[min_Index];
                arr[min_Index] = temp;  
            }
        }
        System.out.println("The total passes would be required to sort this array is : " + count);    
    }

    // Question no.3.............

    // Sorting an array using insertion sort in decreasing order method.................

    public static void DecreaseInsertion(int arr[]){
        for(int i = 1; i < arr.length; i++){
            int j = i;
            while(j > 0 && arr[j] > arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }

            }
        }

    public static void main(String[] args) {
        int arr[] = {3,5,1,6,0};
        DecreaseBubble(arr);
        System.out.print("Sorting the array in decreasing order using bubble sort : " );
        System.out.println(Arrays.toString(arr));
        System.out.println("---------------------------------------------------------------------------------");
        DecreaseSelection(arr);
        System.out.print("Sorting the array in decreasing order using selection sort : " );
        System.out.println(Arrays.toString(arr));
        System.out.println("---------------------------------------------------------------------------------");
        DecreaseInsertion(arr);
        System.out.print("Sorting the array in decreasing order using insertion sort : " );
        System.out.println(Arrays.toString(arr));
        System.out.println("---------------------------------------------------------------------------------");




    }
    
}
