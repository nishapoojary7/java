
package JAVAPROGRAM;

import java.util.Random;
import java.util.Scanner;

public class Selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size of the array :");
		int size=scanner.nextInt();
		int[]array=new int[size];
		Random random=new Random();
		System.out.println("populating array with random numbers");
		for(int i=0;i<size;i++)
		{
			array[i]=random.nextInt();
		}
		System.out.println("original array");
		for(int i=0;i<size;i++)
		{
			System.out.println(array[i]+"");
		}
		System.out.println("performing selection sort...");
		long startTime=System.currentTimeMillis();
		selectionsort(array);
		long endTime=System.currentTimeMillis();
		long executionTime=endTime-startTime;
		System.out.println("sorted array");
		for(int num:array)
		{
			System.out.println(num+"");
		}
		System.out.println("\n Execution time:"+executionTime+"milliseconds");
	}
	public static void selectionsort(int[]array)
	{
		int n=array.length;
		for(int i=0;i<n-1;i++)
		{
			int minIndex=i;
			for(int j=i+1;j<n;j++)
			{
				if(array[j]<array[minIndex])
				{
					minIndex=j;
				}
			}
			int temp=array[minIndex];
			array[minIndex]=array[i];
			array[i]=temp;
		}
	}
}