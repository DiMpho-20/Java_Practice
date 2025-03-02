import java.util.*;

public class Main {

    public static int[] duplicate_finder(int[] my_array) {
        Set<Integer> exists = new HashSet<>();
        Set<Integer> duplees = new HashSet<>();
        
        for (int num : my_array) {
            
            if (!exists.add(num)) {
                // CHECKING whether the number is already in the array 
                duplees.add(num);
            }
        }

        
        int[] result = new int[duplees.size()];
        int index = 0;
        for (int num : duplees) {
            result[index] = num;
            index++;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 5, 5};
        int[] duplicates = duplicate_finder(arr);
        System.out.println("Duplees: " +Arrays.toString(duplicates));
    }
}
