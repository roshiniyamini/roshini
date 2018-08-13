import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int sumhrs;
        int summins;
      
        Scanner s=new Scanner(System.in);
        int hours=s.nextInt();
        int mins=s.nextInt();
        int nexthrs=s.nextInt();
        int nextmins=s.nextInt();
        if(hours>nexthrs)
        {
          sumhrs=hours-nexthrs;
        }
        else 
        {
          sumhrs=nexthrs-hours;
        }
        if(mins>nextmins)
       {
          summins=mins-nextmins;
        }
        else
       {
          summins=nextmins-mins;
        }
        System.out.println(sumhrs+" "+summins);
	}
}
