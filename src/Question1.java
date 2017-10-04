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

    public void Sortingefficiency(int[] array) {
        //Variables
        int minValue = 0;
        int minIndex = 0;
        int i;
        int j;
        //keep track of of which positions we are sorting 
        for (i = 0; i < array.length; i++) {
            minValue = array[i];
            minIndex = i;
            for (j = i; j < array.length; j++) {
                if (array[j] < minValue) {
                    minValue = array[j];
                    minIndex = j;

                }
            }
            if (minValue < array[i]) {
                swap(array, i, minIndex);
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
        test.Sortingefficiency(array);

        System.out.println("AFTER");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        
        
    }
}
