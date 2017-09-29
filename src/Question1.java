/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public void swap(int[] array, int p1, int p2) {
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }

    public void Sorting(int[] array) {
        //keep track of of which positions we are sorting 
        for (int position = 0; position < array.length; position++) {
            //go through the numbers looking for the smallest number
            for (int j = position + 1; j < array.length; j++) {
                //is this the smallest number
                if (array[j] < array[position]) {
                    
                    swap(array, j, position);
                }
            }
        }
    }

    public static void main(String[] args) {
        Question1 test = new Question1();
        
        //Array of Numbers
        int[] array = {12, 65, 18, 59, 78, 89, 2, 33};

        System.out.println("BEFORE");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //sorting
        test.Sorting(array);

         System.out.println("AFTER");
         for (int i = 0; i < array.length; i++) {
             System.out.println(array[i]);
        }
    }
}
