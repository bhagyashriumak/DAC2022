import java.util.Scanner;
  class P09{
  public static void main(String args[]){
	 int c = 65;
  for(int i=0;i<=4;i++)
  { 
      
     for(int j=4;j>i;j--)
	 {
		 
	   System.out.print(" ");
	   
	  }
	  for(int j=5;j>=i;j--)
	 {
		 
	  System.out.print(" "+(char)(j-c));
	 }
	   
	  System.out.println(); 	  
	   	 
	   }
	   
	   }
	}   