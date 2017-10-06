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
             //position is greater than 0 and compare array[i] to array[i-1] 
             while(position >0 && hold.compareTo(array[position - 1]) < 0){
                
                 //swap
                temp = array[position];
                array[position] = array[position - 1];
                array[position - 1] = temp;
                position --; 
             }
              array[position] = hold;   
             
    
             
             
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
        
        //after sorted  
        System.out.println("AFTER SORTED");
        //Print out the array AFTER ITS SORTED 
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + ", ");
        }
        //space
        System.out.println("");
        
        
        
    }
}
