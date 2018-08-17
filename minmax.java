import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a[] = new int[10];
		Scanner s=new Scanner(System.in);
                        int n=s.nextInt();
                        for(int i=0;i<n;i++)
                        {
                        	a[i]=s.nextInt();
                        }
		int min = a[0]; 
		

		for (int i = 0; i <n; i++)  
		{
			if (a[i] < min) 
			{
				min = a[i];
			}
		}	
		    System.out.print(min+" ");
		int max=a[0];    
		for (int i=0;i<n;i++)
		{
			if(a[i]>max)
			max=a[i];
		}
		System.out.print(max);
	}
}
