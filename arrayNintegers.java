import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int max;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		max=a[0];
		for(int i=0;i<n;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max+" ");
	}
}
