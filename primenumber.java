package UD;
import java.util.Scanner;
public class primenumber {
   public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number:");
	   int number=sc.nextInt();
	   
	   if(isPrime(number)) {
		   System.out.println(number + "is a prime number:");
	   }
	   else
	   {
		   System.out.println(number +"is not a number is prime:");
	   }
   }
   //Function to check if a number is prime
   public static boolean isPrime(int number) {
	 if(number<=1) {
		 return false;
	 }  
	 if(number<=3)
	 {
		 return true;
	 }
	 if(number%2==0 || number%3==0) {
		 return false;
	 }
	 for(int i=5; i*i<=number;i+=6) {
		 if(number % i == 0 || number % (i+2) == 0) {
			 return false;
		 }
	 }
	 return true;
   }
}