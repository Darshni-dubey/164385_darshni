package com.darshni.ds;

import java.util.Scanner;

public class ArraySorting {
	
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	int length;
	    	
	    	System.out.println("enter the length of array:");
	    	length=sc.nextInt();
	    	int array[]=new int[length];
	    	System.out.println("enter the elements of  array:");
	    	for(int i=0;i<length;i++){
	 	
	        array[i]=sc.nextInt();
	            
	    	}
	    	for(int i=0;i<length;i++){
		   
		        
		        System.out.println(array[i]);
		    	}
	    
	    	
	    //Ascending desceding....................
	    		for(int j=0;j<length-1;j++){
	    			
	    		for(int i=0;i<length-1;i++){
	    			int temp;
	    			if(array[i]<array[i+1]){
	    				temp=array[i];
	    				array[i]=array[i+1];
	    				array[i+1]=temp;
	    				
	    			}
	    			for(int k=0;k<length;k++)
	    			System.out.println(array[k]);
	    		}
	    		}
	    	}
	    }
	    

