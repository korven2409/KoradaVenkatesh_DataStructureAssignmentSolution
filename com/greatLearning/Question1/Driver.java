package com.greatLearning.Question1;
import java.util.*;
public class Driver {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int size,maxi;
		System.out.println("enter the total no of floors in the building");
		size = sc.nextInt();
		int arr[] = new int[size];
		int i,j;
		for(i=0;i<size;i++)
		{
			System.out.println("enter the floor size given on day :"+(i+1));
			arr[i] = sc.nextInt();
		}
		for(i=0;i<size-1;i++)
		{
			if(arr[i]<arr[i+1])
			{
				System.out.println("Day"+(i+1)+": ");
			}
			else
			{
				System.out.print("Day"+(i+1)+":"+arr[i]+" ");
				maxi = arr[i];
				for(j=i-1;j>=0;j--)
				{
					if(arr[j] == maxi-1)
					{
						System.out.print(arr[j]+" ");
						maxi=arr[j];
					}
				}
				System.out.println();
			}
		}
		System.out.print("Day"+(i+1)+":"+arr[i]+" ");
		maxi = arr[i];
		for(j=i-1;j>=0;j--)
		{
			if(arr[j] == maxi-1)
			{
				System.out.print(arr[j]+" ");
				maxi=arr[j];
			}
		}
	}
}
