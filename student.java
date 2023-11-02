package uddhav;

import java.util.Scanner;

class demo{
	int no;
	String name;
	double per;
	demo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter roll no:");
		int no=sc.nextInt();
		System.out.println("Enter Student name:");
		String name= sc.next();
		System.out.println("Enter student per:");
		per=sc.nextFloat();
	}
	void show()
	{
		System.out.println("Roll no:"+no);
		System.out.println("stud name:"+name);
		System.out.println("stud per:"+per);
	}
}
public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         demo ob=new demo();
         
	}

}
