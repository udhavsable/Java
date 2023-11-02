package UD;
import java.util.*;
public class perfectnumber {
	public static void main(String args[])
	{
		int n=4;
		boolean b=isPerfect(n);
		if(b) {
			System.out.println("Its a perfect number:");
		}
		else {
			System.out.println("Its not az perfect number:");
		}
	}
	public static boolean isPerfect(int n)
	{
		int temp=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				temp=temp+i;
			}
		}
		if(n==temp)
		{
			return true;
		}
		return false;
	}

}
