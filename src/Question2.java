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
        for (int position = 0; position < array.length; position++) {
            for (int j = position + 1; j < array.length; j++) {
                if(array[j] < array[position]){
                    
                  int temp = array[position];
                  array[position] = array[j];
                  array[j] = temp;
                }
            }
        }
   
    }
    
    
    
    
    
    
    public static void main(String[] args) { 
        Question2 test = new Question2();
        
        int[] array = {0,1,2,3,5,6,7};
        
        test.Sorting(array);
        
        System.out.println("SORTED");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        
    }
}
