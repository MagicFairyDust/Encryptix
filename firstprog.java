package rohan;

import java.util.Scanner;

public class firstprog {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the marks obtained out of 100");
		System.out.println("English:");int eng= sc.nextInt();
		System.out.println("Physics:");int phy=  sc.nextInt();
		System.out.println("Maths:");int math= sc.nextInt();
		System.out.println("Chemistry:");int chem=sc.nextInt();
		int total= eng+phy+math+chem;
		System.out.println("Total marks obtained:"+total);
		int avg= total/4;
		System.out.println("Average percentage:"+avg);
		System.out.println("Grade:");
		if(avg>=90)System.out.println("A! Congratulations!!");
		else if(avg>=80)System.out.print("B");
		else if(avg>=65)System.out.print("C");
		else if(avg>=50)System.out.print("D");
		else if(avg>=30)System.out.print("E");
		else System.out.print("Fail");
    }
}