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
		int count=0,total=0;
	             while(count<=n)
	    {
	    	total=total+count;
	    	count++;
	    }
	    System.out.println(+total);
	}
}
