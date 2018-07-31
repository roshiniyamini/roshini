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
		int result;
		for(int i=1;i<=5;i++)
		{
			result=n*i;
			System.out.println(result+" ");
		}
	}
}
