import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int Q=s.nextInt();
		int l=0;
		for(int i=N+1;i<Q;i++)
		{
			if(i%2==0)
			{
				if(l<1)
				{
			           System.out.println(i);
				}
				else
				{
				System.out.println(" ");
				System.out.println(i);	
				}
			}
		}
	}
}
