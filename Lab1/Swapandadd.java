package com.Lab1;

public class Swapandadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int x=7;
     int y=5,sum;
    		 System.out.println("Before swapping:"+"x="+x+",y="+y);
     x=x+y;
     y=x-y;
     x=x-y;
     System.out.println("After swapping:"+"x="+x+",y="+y);
     sum=x+y;
     System.out.println("The sum of two numbers is:"+sum);
   
     
     
	}

}
