/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public void Sorting(int[]array){
        //keeping track of the position 
        for (int position = 0; position < array.length; position++) {
            // go through the rest of the array to look for small numbers
            for (int j = position + 1; j < array.length; j++) {
                //is this the smallest number
                if(array[j] < array[position]){
                   //swap 
                  int temp = array[position];
                  array[position] = array[j];
                  array[j] = temp;
                }
            }
        }
   
    }
   public int smallestMissingNumbers(int[] array){

       //go through the array
       for (int i = 0; i < array.length; i++) {
     //comparing the next number in the array with the increment of 1
           if(array[i+1] != array[i] + 1 ){
            return array[i] + 1;   
               
           }
         } 
       
       return -1;
   }
    
    
    
    public static void main(String[] args) {
        //testing 
        Question2 test = new Question2();
        //array 
        int[] array = {0,1,9,3,5,6,7};
        //sorting method 
        test.Sorting(array);
        //print sorted array 
        System.out.println("SORTED");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        //Space
         System.out.println("");
       
        
        //finding the smallest missing number in the array
        System.out.println("The smallest missing number in the array is: ");
        System.out.println(test.smallestMissingNumbers(array));
        
        
        
        
    }
}
