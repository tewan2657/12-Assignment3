/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tewan2657
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public void sortBinary (int[]array){
        //keeping track of the position 
        for (int i = 0; i < array.length; i++) {
            //go through the rest of the array to look for smaller numbers
            for (int j = i+1; j < array.length; j++) {
                //is it smaller
                if(array[j] < array [i]){
                    
                    //swap numbers
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
   
    }
    
    public int countBinary(int[] binary){
        //variable to store numbers in 
        int count = 0;
       
        //count+ all the ones
         for (int i = 0; i < binary.length; i++) {
             //if there is a "1" in the array, store in the variable
            if(binary[i] == 1){
                //keep adding up all the "1s"in the array 
              count += 1;  
            }
         }
      
        return count;
    }
    
    public static void main(String[] args) {
        // Testing Method Above 
         Question3 test = new Question3();
         //array
         int[] num = {1,0,0,1,1,1,0,1,0,1,1,0,1,0};
         
         //sorting method
         test.sortBinary(num);
         //Print out the sorted array 
         System.out.println("After Sort");
         for (int i = 0; i < num.length; i++) {
             System.out.print(num[i]);
        }
         //space
         System.out.println("");
        //count binary number method test
         System.out.println("Total count of \"1s\" in the array: " );
         System.out.println(test.countBinary(num));
         
         
         

   }
}
