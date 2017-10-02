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
    public int binarySearch (int[]array, int target){
     int min =0;
     int max = array.length - 1;
     while(max > min){
         int guess = (max + min) /2;
         //find it??
         if(array[guess] == target){
             return guess;
         }else if(target > array[guess]){
          min = guess + 1;   
         }else{
             max = guess - 1;
         } 
     }   
     //Didn't find it 
        return -1;
    }
    
    
    public static void main(String[] args) {
        // Testing Method Above 
      
        Question3 test = new Question3();
         int[] num = {4,8,1,9,7,5,2};
       
       
       
         System.out.println("After Search:");
         System.out.println(test.binarySearch(num, 5));
    }
}
