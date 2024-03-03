package ArrayJava;

import java.util.Scanner;

public class ProgramApr15_1 {

	public static void main(String[] args) {

		int size;
		System.out.println("Enter the size of array");
		Scanner x = new Scanner(System.in);
		size = x.nextInt();
		int a[]= new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++)
		{
			a[i]=x.nextInt();
		}
		System.out.println("Array elements are5");
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
