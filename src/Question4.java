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
    public int countingSort(int[] array){
        
        //main array 
        for (int i = 0; i < array.length; i++) {
        array[i] = 0;
        
        //count array 
        int[] count = new int[5];
        for (int se = 0; se < count.length; se++) {
        ++count[array[i]];    
        }
        
        } 
        
        return 5;
  
    }
    
    public static void main(String[] args) { 
        Question4 test = new Question4 ();
        
        int[] array ={2,1,0,0,3,5,1,1}; 
       
        test.countingSort(array);
        System.out.println("After");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        
       
       
    }
}
