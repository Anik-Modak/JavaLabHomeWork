package main;
import java.util.Random;
import java.util.Arrays;

public class RandomNumber {

	public static void main(String[] args) {
		
		Random random = new Random();
        int array[]=new int[20];
        System.out.print("The Random Numbers are: ");
        
        for (int i=0; i < array.length ; i++) {
            array[i] = random.nextInt(6);
            System.out.print(array[i]+" ");  
        }
        System.out.print("\nIncluding parentheses the Random Numbers are: ");
        boolean run = false;
         
        for (int i=0; i < array.length; i++) {
        	
        	if(run){
        		if(array[i] != array[i-1]) {
        			System.out.print(") ");
        			run = false;
        		}
        	}
        	if(run == false && i < array.length-1){
        		if(array[i] == array[i+1]) {
        			System.out.print("( "); 
        			run = true;
        		}
        	}
        	System.out.print(array[i] + " ");  
        }
        if(run) {
        	System.out.println(")"); 
        }
	}
}
