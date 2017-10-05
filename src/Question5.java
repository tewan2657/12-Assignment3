/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
     public void insertSort(String[]array){
       String temp;
        //go through the array 
         for (int i = 1; i < array.length; i++) {
             
             String hold = array[i];
             // A variable that stores numbers
             int position =i;
             //
             while(position >=0 && hold.compareTo(array[i-1]) < 0){
                 
                  array[i] = array[i-1];
                position --; 
             }
              array[i] = hold;   
                 
             
             
         }
    }
    
    
    
    public static void main(String[] args) {
        //Testing
        Question5 test = new Question5();
        
        //Array 
        String[] list = {"Blue", "Red", "Black", "Yellow", "Green"};

        //Print out the array BEFORE ITS SORTED
        System.out.println("Before Sorted ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + ", ");
        }
        //space
        System.out.println("");

        //Insert Sort Method
        test.insertSort(list);
        
        //Print out the array AFTER ITS SORTED 
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        
        
        
    }
}
