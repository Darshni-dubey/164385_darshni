package com.darshni.ds;
import java.util.Scanner;

public class Marks {
	 public static void main(String[] args) {
	        // TODO code application logic here
	        Scanner scanner =new Scanner(System.in);
	       int marksA[] = new int[3];
	       int marksB[] = new int[3];
	       int marksC[] = new int[3];
	       System.out.println("enter the marks of student in subject A= ");
	       for(int i=0;i<3;i++){
	           marksA[i]=scanner.nextInt();
	       }
	       System.out.println("enter the marks of student in subject B= ");
	       for(int i=0;i<3;i++){
	       marksB[i]=scanner.nextInt();
	       }
	         System.out.println("enter the marks of student in subject C= ");
	         for(int i=0;i<3;i++){
	       marksC[i]=scanner.nextInt();
	       
	         }
	       int resultA=marksA[0]+marksA[1]+marksA[2];
	       int resultB=marksB[0]+marksB[1]+marksB[2];
	       int resultC=marksC[0]+marksC[1]+marksC[2];
	        int avgA=resultA/3,avgB=resultB/3,avgC=resultC/3;
	       System.out.println("total(subjectA)="  +resultA+ "& average(subjectA)" +avgA);
	       System.out.println("total(subjectB)="  +resultB+ " & average(subjectB)" +avgB);
	       System.out.println("total(subjectC)="  +resultC+ "& average(subjectC)" +avgC);
	      
	   int total1=marksA[0]+marksB[1]+marksC[2];
	   int total2=marksA[0]+marksB[1]+marksC[2];
	   int total3=marksA[0]+marksB[1]+marksC[2];
	   int avg1=total1/3, avg2=total2/3,avg3=total3/3;
	    System.out.println("total marks scored by student1="  +total1+ "& average=" +avg1);
	       System.out.println("total marks scored by student2="  +total2+ "& average="  +avg2);
	        System.out.println("total marks scored by student3="  +total3+ "& average=" +avg3);
	      
	   
	   
	   
	   
	    }
	    
	    }