
import java.util.Arrays;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static int[] countingSort(int[] array) {
        // array that hold the lenght of the main array 
        int[] hold = new int[array.length];

        //find smallest and largest value 
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }
        //Tracker array
        int[] count = new int[max - min + 1];
    
        for (int i = 0; i < array.length; i++) {
            count[array[i] - min]++;
        }
        //Store the positions in tracker array 
        count[0]--;
        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i - 1];
        }
         //sort the numbers
        for (int i = array.length - 1; i >= 0; i--) {
            hold[count[array[i] - min]--] = array[i];
        }

        return hold;
    }

    public static void main(String[] args) {
        //Testing
        Question4 test = new Question4();
        
        //array
        int[]array = {1,2,3,0,5,0};
        
       
        //method
        test.countingSort(array);
        
        int[] sorting = countingSort(array);
        System.out.println("After: " + Arrays.toString(sorting));
    }
}
