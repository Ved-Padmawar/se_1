package com.client.Server;
import java.util.*;

public class Test
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner (System.in);
		int [] arr = new int[10];
		System.out.println("Enter Array Elements: ");
		for (int i = 0; i < 10; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print(Arrays.toString(arr));
	}
}