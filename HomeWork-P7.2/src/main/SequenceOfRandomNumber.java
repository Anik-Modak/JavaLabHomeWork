package main;

import java.util.Random;

public class SequenceOfRandomNumber {

	public static void main(String[] args) {
		
		Random random = new Random();
		int array[] = new int[20];
		
        System.out.print("The Random Numbers are: ");
        
        for (int i=0; i < array.length ; i++) {
            array[i] = random.nextInt(6);
            System.out.print(array[i]+" ");  
        }
        
        System.out.print("\nIncluding parentheses the Random Numbers are: ");
        boolean run = false;
        
        int id1 = 0, id2 = 0;
        int par1 = 0, par2 = 0;
        int mx = 0;
         
        for (int i = 0; i < array.length; i++) {
        	
        	if(run){
        		if(array[i] != array[i-1]) {
        			id2 = i;
        			run = false;
        			
        		}
        	}
        	
        	if(run == true && i == array.length - 1) {
            	id2 = i + 1; 
            }
        	
        	if(mx < id2 - id1) {
        		mx = id2 -id1;
        		par1 = id1;
        		par2 = id2;
        	}
        	
        	if(run == false && i < array.length - 1){
        		if(array[i] == array[i+1]) {
        			id1 = i;
        			run = true;
        		}
        	}
       
        }
        for (int i = 0; i < array.length; i++) {
        	
        	if(par1 == i) {
        		System.out.print("( "); 
        	}
        	
        	if(par2 == i) {
        		System.out.print(") ");
        	}
        	
        	System.out.print(array[i] + " "); 
        }
        
        if(par2 == array.length) {
    		System.out.print(") ");
    	}
	}
}